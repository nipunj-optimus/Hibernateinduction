package com.monkeymedia.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.monkeymedia.demo.Model.Request.MonkeyRequest;
import com.monkeymedia.demo.Services.MonkeyRequestServices;
import com.monkeymedia.demo.Utility.TransactionType;

@Controller
public class MonkeyRequestController {
	
	@Autowired
	MonkeyRequestServices monkeyRequestServices;
	
	
	@PostMapping(value="/sale" , produces = "application/json")
	ResponseEntity<String> getSale(@RequestBody MonkeyRequest monkeyRequest)
	{
		return monkeyRequestServices.monkeyRequestParser(monkeyRequest,TransactionType.SALE);
	}
	
	/*
	@PostMapping(value="/ProfilePreAuth" , produces = "application/json")
	ResponseEntity<String> getProfilePreAuth(@RequestBody MonkeyRequest monkeyRequest)
	{
		return monkeyRequestServices.monkeyRequestParser(monkeyRequest,TransactionType.PROFILEPREAUTH );
	}
	
	@PostMapping(value= "/Capture" , produces = "application/json")
	ResponseEntity<String> getCapture(@RequestBody MonkeyRequest monkeyRequest)
	{
		return monkeyRequestServices.monkeyRequestParser(monkeyRequest,TransactionType.CAPTURE);
	}
	@PostMapping(value="/Void",produces="application/java")
	ResponseEntity<String> getVoid(@RequestBody MonkeyRequest monkeyRequest)
	{
		return monkeyRequestServices.monkeyRequestParser(monkeyRequest, TransactionType.VOID);
	}
	@PostMapping(value="/refund",produces="application/java")
	ResponseEntity<String> getRefund(@RequestBody MonkeyRequest monkeyRequest)
	{
		return monkeyRequestServices.monkeyRequestParser(monkeyRequest, TransactionType.REFUND);
	}
    */
}
