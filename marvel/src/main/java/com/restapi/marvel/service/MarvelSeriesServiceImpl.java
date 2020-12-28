package com.restapi.marvel.service;

import java.util.List;

import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.restapi.marvel.apierror.MarvelApiException;
import com.restapi.marvel.model.MarvelSeries;
import com.restapi.marvel.repository.MarvelSeriesRepository;

@Service
public class MarvelSeriesServiceImpl implements MarvelSeriesService {

	@Autowired
	private MarvelSeriesRepository seriesRepository;
	
	@Override
	public ResponseEntity<List<MarvelSeries>> findByIdCharacter(Long id, String nameStartsWith) throws MarvelApiException {		
		ResponseEntity<List<MarvelSeries>> seriesToReturn = null;
		try {
			if(Strings.isEmpty(nameStartsWith)) {
				nameStartsWith = "";
			}
			List<MarvelSeries> events = seriesRepository.findByCharacterId(id,nameStartsWith);
			seriesToReturn = new ResponseEntity<List<MarvelSeries>>(events, HttpStatus.OK);
		} catch(Exception e) {
			throw new MarvelApiException(HttpStatus.BAD_REQUEST, "Error to find series for that character.");
		}
		return seriesToReturn;
	}
	
}
