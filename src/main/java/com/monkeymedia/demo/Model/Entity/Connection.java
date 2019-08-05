package com.monkeymedia.demo.Model.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Connection {

	@Id
	@Column(name="connection_id")
	private int connectionId;
	
	@Column(name="client_id")
	private int clientId;
	
	@ManyToOne
	@JoinColumn(name="gateway_id")
	private Gateway gateway;
	
	@Column(name="master_connection_id")
	private int masterConnectionId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="[key]")
	private String key;
	
	@Column(name="secret")
	private String secret;

	public int getConnectionId() {
		return connectionId;
	}

	public void setConnectionId(int connectionId) {
		this.connectionId = connectionId;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	
	public Gateway getGateway() {
		return gateway;
	}

	public void setGateway(Gateway gateway) {
		this.gateway = gateway;
	}

	public int getMasterConnectionId() {
		return masterConnectionId;
	}

	public void setMasterConnectionId(int masterConnectionId) {
		this.masterConnectionId = masterConnectionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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
