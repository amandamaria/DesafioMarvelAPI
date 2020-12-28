package com.restapi.marvel.service;

import java.util.List;

import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.restapi.marvel.apierror.MarvelApiException;
import com.restapi.marvel.model.MarvelComic;
import com.restapi.marvel.repository.MarvelComicRepository;

@Service
public class MarvelComicServiceImpl implements MarvelComicService {

	@Autowired
	private MarvelComicRepository comicRepository;
	
	@Override
	public ResponseEntity<List<MarvelComic>> findByIdCharacter(Long id, String nameStartsWith) throws MarvelApiException {		
		ResponseEntity<List<MarvelComic>> comicsToReturn = null;
		try {
			if(Strings.isEmpty(nameStartsWith)) {
				nameStartsWith = "";
			}
			List<MarvelComic> comics = comicRepository.findByCharacterId(id,nameStartsWith);
			comicsToReturn = new ResponseEntity<List<MarvelComic>>(comics, HttpStatus.OK);
		} catch(Exception e) {
			throw new MarvelApiException(HttpStatus.BAD_REQUEST, "Error to find comics for that character.");
		}
		return comicsToReturn;
	}
	
}
