package com.restapi.marvel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.restapi.marvel.apierror.MarvelApiException;
import com.restapi.marvel.model.MarvelCharacter;
import com.restapi.marvel.repository.MarvelCharacterRepository;

@Service
public class MarvelCharacterServiceImpl implements MarvelCharacterService {

	@Autowired
	private MarvelCharacterRepository characterRepository;

	@Override
	public List<MarvelCharacter> findAll() {
		return characterRepository.findAll();
	}
	
	@Override
	public ResponseEntity<MarvelCharacter> findById(Long id) throws MarvelApiException {		
		ResponseEntity<MarvelCharacter> characterToReturn = null;
		try {
			Optional<MarvelCharacter> character = characterRepository.findById(id);
			characterToReturn = new ResponseEntity<MarvelCharacter>(character.get(), HttpStatus.OK);
		} catch(Exception e) {
			throw new MarvelApiException(HttpStatus.NOT_FOUND, "We couldn't find that character");
		}
		return characterToReturn;
	}
	
}
