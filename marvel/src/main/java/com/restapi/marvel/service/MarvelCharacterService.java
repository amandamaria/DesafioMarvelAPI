package com.restapi.marvel.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.restapi.marvel.apierror.MarvelApiException;
import com.restapi.marvel.model.MarvelCharacter;

public interface MarvelCharacterService {
	
	public List<MarvelCharacter> findAll();
	public ResponseEntity<MarvelCharacter> findById(Long id) throws MarvelApiException;
	
}
