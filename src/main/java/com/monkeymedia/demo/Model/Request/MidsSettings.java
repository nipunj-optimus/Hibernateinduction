package com.monkeymedia.demo.Model.Request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MidsSettings {
	@JsonProperty("key")
	private String key;
	
	@JsonProperty("secret")
	private String secret;

}
