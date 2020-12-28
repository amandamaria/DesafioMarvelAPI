package com.restapi.marvel.apierror;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomRestExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler({ MarvelApiException.class })
	public ResponseEntity<Object> handleAll(MarvelApiException ex, WebRequest request) {
	    
		ApiError apiError = new ApiError(ex.getStatus(), ex.getMessage());
	    
		return new ResponseEntity<Object>(apiError, new HttpHeaders(), apiError.getStatus());
	}
	
	@ExceptionHandler({ MethodArgumentTypeMismatchException.class })
	public ResponseEntity<Object> handleAll(MethodArgumentTypeMismatchException ex, WebRequest request) {
	    
		ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST,"Invalid or unrecognized parameter");
	    
		return new ResponseEntity<Object>(apiError, new HttpHeaders(), apiError.getStatus());
	}
	
}
