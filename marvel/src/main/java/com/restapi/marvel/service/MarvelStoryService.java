package com.restapi.marvel.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.restapi.marvel.apierror.MarvelApiException;
import com.restapi.marvel.model.MarvelStory;

public interface MarvelStoryService {
		
	public ResponseEntity<List<MarvelStory>> findByIdCharacter(Long id, String nameStartsWith) throws MarvelApiException;
	
}
