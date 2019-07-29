package com.monkeymedia.demo.Model.Request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MonkeyRequest {

	@JsonProperty("Settings")
	private Settings settings;
	
	@JsonProperty("mids")
	private Mids mids;
	
}
