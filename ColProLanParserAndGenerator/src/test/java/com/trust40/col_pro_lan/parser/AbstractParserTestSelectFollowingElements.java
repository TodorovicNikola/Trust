package com.trust40.col_pro_lan.parser;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import com.trust40.col_pro_lan.parser.impl.IPParser;
import com.trust40.col_pro_lan.parser.model.Gate;
import com.trust40.col_pro_lan.parser.model.IDNamedElement;
import com.trust40.col_pro_lan.parser.model.ProcessElement;
import com.trust40.col_pro_lan.parser.model.ProcessStep;
import com.trust40.col_pro_lan.parser.model.Relationship;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AbstractParserTestSelectFollowingElements {

    @Spy
    private IPParser ipParser; // Replace with your actual class name

    @Mock private ProcessElement mockElement;
    @Mock private ProcessStep mockStep;
    @Mock private Gate mockGate;
    @Mock private Relationship mockRelationship;
    @Mock private IDNamedElement mockSourceElement;

    private Map<String, IDNamedElement> previousElements;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        previousElements = new HashMap<>();
    }
    /**
     * Scenario: ProcessStep with a Decision Gate source.
     * Verifies that selectFollowingElements is called when conditions are met.
     */
    @Test
    public void testProcessStep_WithDecisionGateSource() {
        // Setup Step
        when(mockStep.getId()).thenReturn("step_1");
        when(mockStep.isTraced()).thenReturn(true);
        
        List<Relationship> incoming = new ArrayList<>();
        incoming.add(mockRelationship);
        when(mockStep.getIncomingRelationship()).thenReturn(incoming);

        // Setup Source Node as a Decision Gate
        Gate sourceGate = mock(Gate.class);
        when(mockRelationship.getSource()).thenReturn(sourceGate);
        when(sourceGate.getType()).thenReturn("DECISION");
        
        // Outgoing size > 1 triggers the inner if
        List<Relationship> outgoing = new ArrayList<>();
        outgoing.add(mock(Relationship.class));
        outgoing.add(mock(Relationship.class));
        when(sourceGate.getOutgoingRelationship()).thenReturn(outgoing);

        ipParser.selectPreviousElements(mockStep, previousElements);

        // Verify basic put
        assertTrue(previousElements.containsKey("step_1"));
        // Verify call to the other protected method
        verify(ipParser).selectFollowingElements(eq(sourceGate), eq(previousElements));
    }

    /**
     * Scenario: Parallelism Gate with multiple incoming relationships.
     * Verifies that the gate removes itself and maps relationships instead.
     */
    @Test
    public void testParallelismGate_MappingLogic() {
        String gateId = "parallel_gate";
        when(mockGate.getId()).thenReturn(gateId);
        when(mockGate.getType()).thenReturn("PARALLELISM");

        // Needs incoming size > 1
        List<Relationship> incoming = new ArrayList<>();
        incoming.add(mockRelationship);
        incoming.add(mock(Relationship.class));
        when(mockGate.getIncomingRelationship()).thenReturn(incoming);
        
        when(mockRelationship.getId()).thenReturn("rel_1");

        // Setup the internal helper selectElement(relationship)
        Map<String, IDNamedElement> followingMap = new HashMap<>();
        when(mockSourceElement.getFollowingElements()).thenReturn(followingMap);
        doReturn(mockSourceElement).when(ipParser).selectElement(any(Relationship.class));

        ipParser.selectPreviousElements(mockGate, previousElements);

        // Logic check: Gate should be REMOVED from previousElements
        assertFalse("Gate should be removed from map", previousElements.containsKey(gateId));
        
        // Logic check: Relationship ID should be added instead
        assertTrue("Relationship should be in map", previousElements.containsKey("rel_1"));
        
        // Logic check: The gate should be put into the "following" map of the source
        assertTrue("Gate should be in source's following map", followingMap.containsKey(gateId));
    }

    /**
     * Scenario: Simple ProcessElement that doesn't meet Step or Gate criteria.
     * Verifies that only the basic put() occurs.
     */
    @Test
    public void testBasicElement_OnlyAddsToMap() {
        ProcessElement genericElement = mock(ProcessElement.class);
        when(genericElement.getId()).thenReturn("generic_id");

        ipParser.selectPreviousElements(genericElement, previousElements);

        assertEquals(1, previousElements.size());
        assertEquals(genericElement, previousElements.get("generic_id"));
        // Verify no internal branching methods were called
        verify(ipParser, never()).selectFollowingElements(any(), any());
        verify(ipParser, never()).selectElement(any());
    }
    
    
    
}
