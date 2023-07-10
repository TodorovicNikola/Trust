package com.trust.service.controller.dto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;

@Data
public class LaunchedProcessStatusDto {
	private List<String> currentlyActiveElements = new ArrayList<>();
	private List<String> completedElements = new ArrayList<>();
	private List<String> elementsWithUnfulfilledConstraints = new ArrayList<>();
	private Boolean terminationActivated = false;
	private Boolean constraintsFulfilled = false;
	private Map<String, String> relatedDltContent = new HashMap<>();

	public LaunchedProcessStatusDto(String payload) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			Map<String, Object> payloadMap = objectMapper.readValue(payload, Map.class);
			Map<String, Object> statusMap = (Map<String, Object>) payloadMap.get("State");

			for (String key : statusMap.keySet()) {
				if (key.contains("Active") && (Boolean) statusMap.get(key)) {
					String currentlyActiveElement = key.replace("Active", "");
					currentlyActiveElements.add(currentlyActiveElement);

				}

				if (key.contains("Var")) {
					String elementShortId = key.replace("Var", "");

					relatedDltContent.put(elementShortId, statusMap.get(key).toString());

					Map<String, Object> elementRelatedContent = (Map<String, Object>) statusMap.get(key);

					Boolean elementExecutionCompleted = (Boolean) elementRelatedContent
							.get("ElementExecutionCompleted");
					if (elementExecutionCompleted) {
						completedElements.add(elementShortId);
					}

					Boolean elementConstraintsFulfilled = (Boolean) elementRelatedContent
							.get("ElementConstraintsFulfilled");

					if (elementExecutionCompleted && !elementConstraintsFulfilled) {
						elementsWithUnfulfilledConstraints.add(elementShortId);
					}
				}
			}

			constraintsFulfilled = (Boolean) statusMap.get("ConstraintsFulfilled");
			terminationActivated = (Boolean) statusMap.get("TerminationActivated");

		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public LaunchedProcessStatusDto() {
	}
}
