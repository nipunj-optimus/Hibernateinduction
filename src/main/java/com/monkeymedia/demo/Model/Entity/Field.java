package com.monkeymedia.demo.Model.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Field {
	@Id
	@Column(name="field_id")
	private  int fieldId;
	
	
	@ManyToOne
	@JoinColumn(name="gateway_id")
	private Gateway gateway;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;

	public int getFieldId() {
		return fieldId;
	}

	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}

	public Gateway getGatewayId() {
		return gateway;
	}

	public void setGatewayId(Gateway gateway) {
		this.gateway = gateway;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
