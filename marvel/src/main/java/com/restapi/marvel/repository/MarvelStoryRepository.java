package com.restapi.marvel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.restapi.marvel.model.MarvelStory;

public interface MarvelStoryRepository extends JpaRepository<MarvelStory, Long> {

	@Query("SELECT story from MarvelCharacter character JOIN character.stories story WHERE character.id = :id AND UPPER(character.name) LIKE UPPER(CONCAT(:nameStartsWith,'%'))")
	public List<MarvelStory> findByCharacterId(@Param("id")Long id, @Param("nameStartsWith") String nameStartsWith);
	
}
