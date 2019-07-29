package com.monkeymedia.demo.Model.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Connection {

	@Id
	@Column(name="connection_id")
	private int connectionId;
	
	@Column(name="client_id")
	private int clientId;
	
	@Column(name="gateway_id")
	private int gatewayId;
	
	@Column(name="master_connection_id")
	private int masterConnectionId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="key")
	private String key;
	
	@Column(name="secret")
	private String secret;
	
}
