package com.monkeymedia.demo.Utility;

public enum TransactionType {
	
	//form API transaction types
	FORM_SALE,
	FORM_PREAUTH,
	FORM_PROFILE,
	FORM_PROFILE_PREAUTH,
	
	//SOAP API based transaction type
	PROFILEPREAUTH,
	SALE,
	REFUND,
	VOID,
	CAPTURE	

}
