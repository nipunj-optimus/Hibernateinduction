package com.monkeymedia.demo.Model.Request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MonkeyRequest {

	
	
	@JsonProperty("settings")
	private Settings settings;
	
	@JsonProperty("mids")
	private List<Mids>  mids;

	public Settings getSettings() {
		return settings;
	}

	public void setSettings(Settings settings) {
		this.settings = settings;
	}

	public List<Mids> getMids() {
		return mids;
	}

	public void setMids(List<Mids> mids) {
		this.mids = mids;
	}
	
	
	
}
