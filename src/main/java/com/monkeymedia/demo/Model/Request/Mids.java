package com.monkeymedia.demo.Model.Request;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Mids {

	@JsonProperty("settings")
	private MidsSettings settings;
	
	private List<Map<String,?>> orders;
	
	public MidsSettings getSettings() {
		return settings;
	}
	public void setSettings(MidsSettings settings) {
		this.settings = settings;
	}
	public List<Map<String, ?>> getOrders() {
		return orders;
	}
	public void setOrders(List<Map<String, ?>> orders) {
		this.orders = orders;
	}
	
}
