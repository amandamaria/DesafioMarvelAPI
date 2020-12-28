package com.restapi.marvel.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.restapi.marvel.apierror.MarvelApiException;
import com.restapi.marvel.model.MarvelSeries;

public interface MarvelSeriesService {
		
	public ResponseEntity<List<MarvelSeries>> findByIdCharacter(Long id, String nameStartsWith) throws MarvelApiException;
	
}
