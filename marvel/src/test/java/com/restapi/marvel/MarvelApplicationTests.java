package com.restapi.marvel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;

import com.restapi.marvel.apierror.MarvelApiException;
import com.restapi.marvel.model.MarvelCharacter;
import com.restapi.marvel.repository.MarvelCharacterRepository;
import com.restapi.marvel.service.MarvelCharacterService;
import com.restapi.marvel.service.MarvelComicService;
import com.restapi.marvel.service.MarvelEventService;
import com.restapi.marvel.service.MarvelSeriesService;

@SpringBootTest
class MarvelApplicationTests {

	@Autowired
	private MarvelCharacterService characterService;
	
	@MockBean
	private MarvelCharacterRepository characterRepository;
	
	@Autowired
	private MarvelComicService comicService;
	
	@Autowired
	private MarvelEventService eventService;
	
	@Autowired
	private MarvelSeriesService seriesService;
	
	@Autowired
	private MarvelSeriesService storiesService;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void listCharactersTest() {
		Mockito.when(characterRepository.findAll())
				.thenReturn(Stream.of(new MarvelCharacter(), new MarvelCharacter(), new MarvelCharacter()
						,new MarvelCharacter(), new MarvelCharacter(), new MarvelCharacter()).collect(Collectors.toList()));
		assertEquals(6, characterService.findAll().size());
	}
	
	@Test
	public void characterById() throws MarvelApiException {
		Long id = 1L;
		MarvelCharacter character = new MarvelCharacter();
		character.setName("Capitão América");
		Optional<MarvelCharacter> response = Optional.of(character); 
		Mockito.when(characterRepository.findById(id))
				.thenReturn(response);
		
		assertEquals(HttpStatus.OK, characterService.findById(id).getStatusCode());
	}
	
	@Test
	public void characterByInvalidId() throws MarvelApiException {
		Long id = -8L;

		MarvelApiException exception = assertThrows(MarvelApiException.class, () -> {
			characterService.findById(id);
	    });
		
		assertEquals(HttpStatus.NOT_FOUND, exception.getStatus());
	}
	
	@Test
	public void comicsByInvalidChacterId() throws MarvelApiException {
		Long id = -8L;
		assertEquals(0, comicService.findByIdCharacter(id, "").getBody().size());
	}
	
	@Test
	public void eventsByInvalidChacterId() throws MarvelApiException {
		Long id = -8L;
		assertEquals(0, eventService.findByIdCharacter(id, "").getBody().size());
	}
	
	@Test
	public void seriesByInvalidChacterId() throws MarvelApiException {
		Long id = -8L;
		assertEquals(0, seriesService.findByIdCharacter(id, "").getBody().size());
	}
	
	@Test
	public void storiesByInvalidChacterId() throws MarvelApiException {
		Long id = -8L;
		assertEquals(0, storiesService.findByIdCharacter(id, "invalid").getBody().size());
	}
	
	@Test
	public void comicsByIdAndInvalidChacterName() throws MarvelApiException {
		Long id = 1L;
		assertEquals(0, comicService.findByIdCharacter(id, "invalid").getBody().size());
	}
	
	@Test
	public void eventsByIdAndInvalidChacterName() throws MarvelApiException {
		Long id = 1L;
		assertEquals(0, eventService.findByIdCharacter(id, "invalid").getBody().size());
	}
	
	@Test
	public void seriesByIdAndInvalidChacterName() throws MarvelApiException {
		Long id = 1L;
		assertEquals(0, seriesService.findByIdCharacter(id, "invalid").getBody().size());
	}
	
	@Test
	public void storiesByIdAndInvalidChacterName() throws MarvelApiException {
		Long id = 1L;
		assertEquals(0, storiesService.findByIdCharacter(id, "invalid").getBody().size());
	}

	@Test
	public void comicsByIdAndName() throws MarvelApiException {
		Long id = 1L;
		assertTrue(comicService.findByIdCharacter(id, "cap").getBody().size()>0);
	}
	
	@Test
	public void eventsByIdAndName() throws MarvelApiException {
		Long id = 1L;
		assertTrue(eventService.findByIdCharacter(id, "cap").getBody().size()>0);
	}
	
	@Test
	public void seriesByIdAndName() throws MarvelApiException {
		Long id = 1L;
		assertTrue(seriesService.findByIdCharacter(id, "cap").getBody().size()>0);
	}
	
	@Test
	public void storiesByIdAndName() throws MarvelApiException {
		Long id = 1L;
		assertTrue(storiesService.findByIdCharacter(id, "cap").getBody().size()>0);
	}
}
