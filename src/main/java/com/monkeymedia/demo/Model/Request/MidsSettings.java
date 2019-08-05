package com.monkeymedia.demo.Model.Request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MidsSettings {
	
	@JsonProperty("key")
	private String key;
	
	@JsonProperty("secret")
	private String secret;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}	
	
	

}
