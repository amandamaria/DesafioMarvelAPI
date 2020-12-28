package com.restapi.marvel.service;

import java.util.List;

import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.restapi.marvel.apierror.MarvelApiException;
import com.restapi.marvel.model.MarvelEvent;
import com.restapi.marvel.repository.MarvelEventRepository;

@Service
public class MarvelEventServiceImpl implements MarvelEventService {

	@Autowired
	private MarvelEventRepository eventRepository;
	
	@Override
	public ResponseEntity<List<MarvelEvent>> findByIdCharacter(Long id, String nameStartsWith) throws MarvelApiException {		
		ResponseEntity<List<MarvelEvent>> eventsToReturn = null;
		try {
			if(Strings.isEmpty(nameStartsWith)) {
				nameStartsWith = "";
			}
			List<MarvelEvent> events = eventRepository.findByCharacterId(id,nameStartsWith);
			eventsToReturn = new ResponseEntity<List<MarvelEvent>>(events, HttpStatus.OK);
		} catch(Exception e) {
			throw new MarvelApiException(HttpStatus.BAD_REQUEST, "Error to find events for that character.");
		}
		return eventsToReturn;
	}
	
}
