package com.monkeymedia.demo.Model.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gateway {

	@Id
	@Column(name="gateway_id")
	private int gatewayId;
	
	@Column(name="gateway_abbr")
	private String gatewayAbbr;
	
	@Column(name="gateway_name")
	private String gatewayName;
	
	@Column(name="gateway_description")
	private String gatewayDescription;
	
	@Column(name="gateway_status")
	private String gatewayStatus;
	
	@Column(name="gateway_url")
	private String gatewayUrl;
	
	@Column(name="gateway_api_url")
	private String gatewayApiUrl;
	
}
