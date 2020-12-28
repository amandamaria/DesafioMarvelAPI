package com.restapi.marvel.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.restapi.marvel.apierror.MarvelApiException;
import com.restapi.marvel.model.MarvelEvent;

public interface MarvelEventService {
		
	public ResponseEntity<List<MarvelEvent>> findByIdCharacter(Long id, String nameStartsWith) throws MarvelApiException;
	
}
