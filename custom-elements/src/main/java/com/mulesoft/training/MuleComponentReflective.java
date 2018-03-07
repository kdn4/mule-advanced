package com.mulesoft.training;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MuleComponentReflective {

	private static final String PROCESS_KEY = "processed by";
	private static final String MESSAGE_KEY = "message";

	public Map<String, String> processMap(Map<String, String> input) {
		input.put(PROCESS_KEY, "processMap");
		return input;
	}

	public Map<String, String> processArray(List<String> input) {
		Map<String, String> output = new HashMap<>();
		output.put(MESSAGE_KEY, input.get(0));
		output.put(PROCESS_KEY, "processArray");
		return output;
	}

	public Map<String, String> processString(String input) {
		Map<String, String> output = new HashMap<>();
		output.put(MESSAGE_KEY, input);
		output.put(PROCESS_KEY, "processString");
		return output;
	}

}
