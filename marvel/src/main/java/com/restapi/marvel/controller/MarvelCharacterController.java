package com.restapi.marvel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.marvel.apierror.MarvelApiException;
import com.restapi.marvel.model.MarvelCharacter;
import com.restapi.marvel.model.MarvelComic;
import com.restapi.marvel.model.MarvelEvent;
import com.restapi.marvel.model.MarvelSeries;
import com.restapi.marvel.model.MarvelStory;
import com.restapi.marvel.service.MarvelCharacterService;
import com.restapi.marvel.service.MarvelComicService;
import com.restapi.marvel.service.MarvelEventService;
import com.restapi.marvel.service.MarvelSeriesService;
import com.restapi.marvel.service.MarvelStoryService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/v1/public")
@Api(value="Marvel Rest API")
@CrossOrigin(origins = "*")
public class MarvelCharacterController {

	@Autowired
	private MarvelCharacterService characterService;
	
	@Autowired
	private MarvelComicService comicService;
	
	@Autowired
	private MarvelEventService eventService;
	
	@Autowired
	private MarvelStoryService storyService;
	
	@Autowired
	private MarvelSeriesService seriesService;
	
	@GetMapping("/characters")
	@ApiOperation(value="Busca uma lista de personagens.")
	public List<MarvelCharacter> listCharacters() {
		return characterService.findAll();
	}
	
	@GetMapping("/characters/{characterId}")
	@ApiOperation(value="Busca um único personagem a partir do ID.")		
	public ResponseEntity<MarvelCharacter> characterById(@PathVariable(value = "characterId") Long id ) throws MarvelApiException {		
		return characterService.findById(id);		
	}
	
	@GetMapping("/characters/{characterId}/comics")
	@ApiOperation(value="Busca lista de quadrinhos de um único personagem a partir do ID do personagem e nome (opcional)")
	public ResponseEntity<List<MarvelComic>> characterComicsById(@PathVariable(value = "characterId") Long id, @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith) throws MarvelApiException {
		return comicService.findByIdCharacter(id, nameStartsWith);
	}
	
	@GetMapping("/characters/{characterId}/events")
	@ApiOperation(value="Busca lista de eventos em que um determinado personagem apareceu a partir do ID do personagem e nome (opcional)")
	public ResponseEntity<List<MarvelEvent>> characterEventsById(@PathVariable(value = "characterId") Long id, @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith) throws MarvelApiException {
		return eventService.findByIdCharacter(id, nameStartsWith);
	}
	
	@GetMapping("/characters/{characterId}/series")
	@ApiOperation(value="Busca listas de séries de histórias em quadrinhos de um personagem específico a partir do ID do personagem e nome (opcional)")
	public ResponseEntity<List<MarvelSeries>> characterSeriesById(@PathVariable(value = "characterId") Long id, @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith) throws MarvelApiException {
		return seriesService.findByIdCharacter(id, nameStartsWith);
	}
	
	@GetMapping("/characters/{characterId}/stories")
	@ApiOperation(value="Busca listas de histórias em quadrinhos de um personagem específico a partir do ID do personagem e nome (opcional)")
	public ResponseEntity<List<MarvelStory>> characterSstoriesById(@PathVariable(value = "characterId") Long id, @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith) throws MarvelApiException {
		return storyService.findByIdCharacter(id, nameStartsWith);
	}
}
