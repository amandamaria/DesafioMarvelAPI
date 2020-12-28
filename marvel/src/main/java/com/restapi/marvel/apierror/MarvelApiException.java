package com.restapi.marvel.apierror;

import org.springframework.http.HttpStatus;

public class MarvelApiException extends Exception {

	
	private static final long serialVersionUID = 1L;
	
	private String message;
	private HttpStatus status;
	private String[] errors;
	
	public MarvelApiException(HttpStatus status, String message) {
		super(message);
		this.message = message;
		this.status = status;
	}
	
	public MarvelApiException(HttpStatus status, String message, String[] errors) {
		super(message);
		this.message = message;
		this.status = status;
		this.errors = errors;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String[] getErrors() {
		return errors;
	}

	public void setErrors(String[] errors) {
		this.errors = errors;
	}
	
	
}
