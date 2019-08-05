package com.monkeymedia.demo.Model.Request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MidsOrders {

	
	@JsonProperty
	private String process_id;
	
	@JsonProperty
	private String order_id;
	
	@JsonProperty
	private String billing_id;
	
	@JsonProperty
	private String store_code;
	
	@JsonProperty
	private String member_id;
	
	@JsonProperty
	private String amount;
	
	@JsonProperty
	private String mnky_shownav;
	
	@JsonProperty
	private String currency;
	
	@JsonProperty
	private String industry_type;
	
	@JsonProperty
	private String callback_link;
	
	@JsonProperty
	private String  css_url;

	public String getProcess_id() {
		return process_id;
	}

	public void setProcess_id(String process_id) {
		this.process_id = process_id;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getBilling_id() {
		return billing_id;
	}

	public void setBilling_id(String billing_id) {
		this.billing_id = billing_id;
	}

	public String getStore_code() {
		return store_code;
	}

	public void setStore_code(String store_code) {
		this.store_code = store_code;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getMnky_shownav() {
		return mnky_shownav;
	}

	public void setMnky_shownav(String mnky_shownav) {
		this.mnky_shownav = mnky_shownav;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getIndustry_type() {
		return industry_type;
	}

	public void setIndustry_type(String industry_type) {
		this.industry_type = industry_type;
	}

	public String getCallback_link() {
		return callback_link;
	}

	public void setCallback_link(String callback_link) {
		this.callback_link = callback_link;
	}

	public String getCss_url() {
		return css_url;
	}

	public void setCss_url(String css_url) {
		this.css_url = css_url;
	}
	
	
	
}
