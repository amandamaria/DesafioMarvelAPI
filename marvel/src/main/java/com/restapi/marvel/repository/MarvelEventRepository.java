package com.restapi.marvel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.restapi.marvel.model.MarvelEvent;

public interface MarvelEventRepository extends JpaRepository<MarvelEvent, Long> {

	@Query("SELECT event from MarvelCharacter character JOIN character.events event WHERE character.id = :id AND UPPER(character.name) LIKE UPPER(CONCAT(:nameStartsWith,'%'))")
	public List<MarvelEvent> findByCharacterId(@Param("id")Long id, @Param("nameStartsWith") String nameStartsWith);
	
}
