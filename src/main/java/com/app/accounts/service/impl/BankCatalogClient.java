package com.app.accounts.service.impl;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.google.gson.Gson;

import bank_web_service.GetBankDetailsRequest;
import bank_web_service.GetBankDetailsResponse;

public class BankCatalogClient extends WebServiceGatewaySupport {

	public GetBankDetailsResponse getBankById(String id) throws IOException {
		GetBankDetailsRequest request = new GetBankDetailsRequest();
		request.setCustomerId(id);
		GetBankDetailsResponse response = (GetBankDetailsResponse) getWebServiceTemplate()
				.marshalSendAndReceive(request, new SoapActionCallback("http://34.236.109.151:8000/ws/"));

		Gson gson = new Gson();
		System.out.println("Customer Details------------>"+gson.toJson(response).toString());
  
			FileWriter file = new FileWriter("D:\\SOAP\\Response\\SOAP_Response.txt");
			        file.write(gson.toJson(response).toString());
			        file.close(); 
			 

		return response;
	}
}