package com.monkeymedia.demo.Services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.monkeymedia.demo.Model.Entity.Connection;
import com.monkeymedia.demo.Model.Entity.FieldData;
import com.monkeymedia.demo.Model.Entity.Gateway;
import com.monkeymedia.demo.Model.Request.GatwayDto;
import com.monkeymedia.demo.Model.Request.MidsSettings;
import com.monkeymedia.demo.Model.Request.MonkeyRequest;
import com.monkeymedia.demo.Repository.ConnectioRepository;
import com.monkeymedia.demo.Repository.ConnectionFieldValueRepository;
import com.monkeymedia.demo.Repository.FieldRepository;
import com.monkeymedia.demo.Repository.GatewayRepository;
import com.monkeymedia.demo.Utility.TransactionType;

@Repository
public class MonkeyRequestServices  {

	@Autowired
	ConnectioRepository connectionRepository;
	@Autowired
	FieldRepository fieldRepository;
	@Autowired
	ConnectionFieldValueRepository connectionFieldValueRepository;
	@Autowired
	GatewayRepository gatewayRepository;



	public ResponseEntity<String> monkeyRequestParser(MonkeyRequest monkeyRequest ,TransactionType transactionType)
	{
		MidsSettings midsSettings = monkeyRequest.getMids().get(0).getSettings();

		//getting gateway id
		Connection connection  = connectionRepository.findByKeyAndSecret(midsSettings.getKey() , midsSettings.getSecret());

		//fetching name and value from field table and connection field value table
		List<FieldData> fielddata = connectionFieldValueRepository.findNameandValue(connection);

		//initalizing map
		HashMap<String, String> map = new HashMap<>();

		//iterate field data
		for (FieldData data: fielddata)

		{
			map.put(data.getName(), data.getValue());
		}

		System.out.println(getSettingsObject(connection.getGateway()));

		return null;		

	}

	public Map<String, String> getSettingsObject(Gateway gateway) {

		Optional<Gateway> gateways = gatewayRepository.findById(gateway.getId());
		GatwayDto gatewayDto = new GatwayDto();

		if(gateways.isPresent())
		{
			gatewayDto.setGatewayApiSecondaryUrl(gateways.get().getGatewayApiSecondaryUrl());
			gatewayDto.setGatewayApiUrl(gateways.get().getGatewayApiUrl());
			gatewayDto.setGatewayHppUrl(gateways.get().getGatewayHppUrl());
			gatewayDto.setGatewayQueryUrl(gateways.get().getGatewayQueryUrl());
			gatewayDto.setGatewayReportingUrl(gateways.get().getGatewayReportingUrl());
			gatewayDto.setGatewayServiceUrl(gateways.get().getGatewayServiceUrl());
			gatewayDto.setGatewayUidUrl(gateways.get().getGatewayUidUrl());
			gatewayDto.setGatewayUrl(gateways.get().getGatewayUrl());
		}
		else {
			System.out.println("No value found");
		}
		return new ObjectMapper().convertValue(gatewayDto, HashMap.class);
	}
}
