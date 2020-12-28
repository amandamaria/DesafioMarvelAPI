package com.restapi.marvel.service;

import java.util.List;

import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.restapi.marvel.apierror.MarvelApiException;
import com.restapi.marvel.model.MarvelStory;
import com.restapi.marvel.repository.MarvelStoryRepository;

@Service
public class MarvelStoryServiceImpl implements MarvelStoryService {

	@Autowired
	private MarvelStoryRepository storyRepository;
	
	@Override
	public ResponseEntity<List<MarvelStory>> findByIdCharacter(Long id, String nameStartsWith) throws MarvelApiException {		
		ResponseEntity<List<MarvelStory>> storiesToReturn = null;
		try {
			if(Strings.isEmpty(nameStartsWith)) {
				nameStartsWith = "";
			}
			List<MarvelStory> events = storyRepository.findByCharacterId(id,nameStartsWith);
			storiesToReturn = new ResponseEntity<List<MarvelStory>>(events, HttpStatus.OK);
		} catch(Exception e) {
			throw new MarvelApiException(HttpStatus.BAD_REQUEST, "Error to find stories for that character.");
		}
		return storiesToReturn;
	}
	
}
