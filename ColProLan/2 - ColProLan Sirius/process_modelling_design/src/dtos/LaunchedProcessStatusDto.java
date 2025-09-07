package dtos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LaunchedProcessStatusDto {
	private List<String> currentlyActiveElements = new ArrayList<>();
	private List<String> completedElements = new ArrayList<>();
	private List<String> elementsWithUnfulfilledConstraints = new ArrayList<>();
	private Boolean terminationActivated = false;
	private Boolean constraintsFulfilled = false;
	private Map<String, String> relatedDltContent = new HashMap<>();

	public LaunchedProcessStatusDto(List<String> currentlyActiveElements, List<String> completedElements,
			List<String> elementsWithUnfulfilledConstraints, Boolean terminationActivated, Boolean constraintsFulfilled,
			Map<String, String> relatedDltContent) {
		super();
		this.currentlyActiveElements = currentlyActiveElements;
		this.completedElements = completedElements;
		this.elementsWithUnfulfilledConstraints = elementsWithUnfulfilledConstraints;
		this.terminationActivated = terminationActivated;
		this.constraintsFulfilled = constraintsFulfilled;
		this.relatedDltContent = relatedDltContent;
	}

	public LaunchedProcessStatusDto() {
		super();
	}

	public List<String> getCurrentlyActiveElements() {
		return currentlyActiveElements;
	}

	public void setCurrentlyActiveElements(List<String> currentlyActiveElements) {
		this.currentlyActiveElements = currentlyActiveElements;
	}

	public Boolean getTerminationActivated() {
		return terminationActivated;
	}

	public void setTerminationActivated(Boolean terminationActivated) {
		this.terminationActivated = terminationActivated;
	}

	public Boolean getConstraintsFulfilled() {
		return constraintsFulfilled;
	}

	public void setConstraintsFulfilled(Boolean constraintsFulfilled) {
		this.constraintsFulfilled = constraintsFulfilled;
	}

	public Map<String, String> getRelatedDltContent() {
		return relatedDltContent;
	}

	public void setRelatedDltContent(Map<String, String> relatedDltContent) {
		this.relatedDltContent = relatedDltContent;
	}

	public List<String> getCompletedElements() {
		return completedElements;
	}

	public void setCompletedElements(List<String> completedElements) {
		this.completedElements = completedElements;
	}

	public List<String> getElementsWithUnfulfilledConstraints() {
		return elementsWithUnfulfilledConstraints;
	}

	public void setElementsWithUnfulfilledConstraints(List<String> elementsWithUnfulfilledConstraints) {
		this.elementsWithUnfulfilledConstraints = elementsWithUnfulfilledConstraints;
	}

	@Override
	public String toString() {
		return "LaunchedProcessStatusDto [currentlyActiveElements=" + currentlyActiveElements + ", completedElements="
				+ completedElements + ", elementsWithUnfulfilledConstraints=" + elementsWithUnfulfilledConstraints
				+ ", terminationActivated=" + terminationActivated + ", constraintsFulfilled=" + constraintsFulfilled
				+ ", relatedDltContent=" + relatedDltContent + "]";
	}

}
