package com.restapi.marvel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.restapi.marvel.model.MarvelComic;

public interface MarvelComicRepository extends JpaRepository<MarvelComic, Long> {

	@Query("SELECT comic from MarvelCharacter character JOIN character.comics comic WHERE character.id = :id AND UPPER(character.name) LIKE UPPER(CONCAT(:nameStartsWith,'%'))")
	public List<MarvelComic> findByCharacterId(@Param("id")Long id, @Param("nameStartsWith") String nameStartsWith);
	
}
