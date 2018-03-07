package com.mulesoft.training;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mule.api.annotations.param.InboundHeaders;
import org.mule.api.annotations.param.Payload;

public class MuleComponentAnnotated {


	private static final String HTTP_METHOD = "http.method";
	private static final String PROCESS_KEY = "processed_by";
	private static final String MESSAGE_KEY = "message";
	private int count;
	
	public MuleComponentAnnotated() {
		count = 1;
	}

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

	public Map<String, Object> processAll(@Payload Object input,
			@InboundHeaders(HTTP_METHOD) String method) {
		Map<String, Object> output = new HashMap<>();
		output.put(MESSAGE_KEY, input.toString());
		output.put(HTTP_METHOD.replace('.', '_'), method);
		output.put(PROCESS_KEY, "processAll");
		output.put("current_count", count);
		count++;
		return output;
	}

} 
