package com.app.accounts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class Error {
	

	private String code;
	private String message;
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Error(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	public Error() {
		// TODO Auto-generated constructor stub
	}

}
