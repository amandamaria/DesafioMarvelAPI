package com.restapi.marvel.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.restapi.marvel.apierror.MarvelApiException;
import com.restapi.marvel.model.MarvelComic;

public interface MarvelComicService {
		
	public ResponseEntity<List<MarvelComic>> findByIdCharacter(Long id, String nameStartsWith) throws MarvelApiException;
	
}
