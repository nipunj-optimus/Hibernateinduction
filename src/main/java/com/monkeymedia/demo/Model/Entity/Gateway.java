package com.monkeymedia.demo.Model.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gateway {

	@Id
	@Column(name="gateway_id")
	private int id;
	
	@Column(name="gateway_abbr")
	private String gatewayAbbr;
	
	@Column(name="gateway_name")
	private String gatewayName;
	
	@Column(name="gateway_description")
	private String gatewayDescription;
	
	@Column(name="gateway_status")
	private boolean gatewayStatus;
	
	@Column(name="gateway_url")
	private String gatewayUrl;
	
	@Column(name="gateway_api_url")
	private String gatewayApiUrl;
	
	@Column(name="gateway_hpp_url")
	private String gatewayHppUrl;
	
	@Column(name="gateway_api_secondary_url")
	private String gatewayApiSecondaryUrl;
	
	@Column(name="gateway_uid_url")
	private String gatewayUidUrl;
	
	@Column(name="gateway_query_url")
	private String gatewayQueryUrl;
	
	@Column(name="gateway_service_url")
	private String gatewayServiceUrl;
	
	@Column(name="gateway_reporting_url")
	private String gatewayReportingUrl;
	
	@Column(name="trans_date_call_supported")
	private boolean transDateCallSupported;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGatewayAbbr() {
		return gatewayAbbr;
	}

	public void setGatewayAbbr(String gatewayAbbr) {
		this.gatewayAbbr = gatewayAbbr;
	}

	public String getGatewayName() {
		return gatewayName;
	}

	public void setGatewayName(String gatewayName) {
		this.gatewayName = gatewayName;
	}

	public String getGatewayDescription() {
		return gatewayDescription;
	}

	public void setGatewayDescription(String gatewayDescription) {
		this.gatewayDescription = gatewayDescription;
	}

	public boolean isGatewayStatus() {
		return gatewayStatus;
	}

	public void setGatewayStatus(boolean gatewayStatus) {
		this.gatewayStatus = gatewayStatus;
	}

	public String getGatewayUrl() {
		return gatewayUrl;
	}

	public void setGatewayUrl(String gatewayUrl) {
		this.gatewayUrl = gatewayUrl;
	}

	public String getGatewayApiUrl() {
		return gatewayApiUrl;
	}

	public void setGatewayApiUrl(String gatewayApiUrl) {
		this.gatewayApiUrl = gatewayApiUrl;
	}

	public String getGatewayHppUrl() {
		return gatewayHppUrl;
	}

	public void setGatewayHppUrl(String gatewayHppUrl) {
		this.gatewayHppUrl = gatewayHppUrl;
	}

	public String getGatewayApiSecondaryUrl() {
		return gatewayApiSecondaryUrl;
	}

	public void setGatewayApiSecondaryUrl(String gatewayApiSecondaryUrl) {
		this.gatewayApiSecondaryUrl = gatewayApiSecondaryUrl;
	}

	public String getGatewayUidUrl() {
		return gatewayUidUrl;
	}

	public void setGatewayUidUrl(String gatewayUidUrl) {
		this.gatewayUidUrl = gatewayUidUrl;
	}

	public String getGatewayQueryUrl() {
		return gatewayQueryUrl;
	}

	public void setGatewayQueryUrl(String gatewayQueryUrl) {
		this.gatewayQueryUrl = gatewayQueryUrl;
	}

	public String getGatewayServiceUrl() {
		return gatewayServiceUrl;
	}

	public void setGatewayServiceUrl(String gatewayServiceUrl) {
		this.gatewayServiceUrl = gatewayServiceUrl;
	}

	public String getGatewayReportingUrl() {
		return gatewayReportingUrl;
	}

	public void setGatewayReportingUrl(String gatewayReportingUrl) {
		this.gatewayReportingUrl = gatewayReportingUrl;
	}

	public boolean isTransDateCallSupported() {
		return transDateCallSupported;
	}

	public void setTransDateCallSupported(boolean transDateCallSupported) {
		this.transDateCallSupported = transDateCallSupported;
	}
	
	
}
