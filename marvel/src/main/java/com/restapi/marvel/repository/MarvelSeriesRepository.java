package com.restapi.marvel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.restapi.marvel.model.MarvelSeries;

public interface MarvelSeriesRepository extends JpaRepository<MarvelSeries, Long> {

	@Query("SELECT series from MarvelCharacter character JOIN character.series series WHERE character.id = :id AND UPPER(character.name) LIKE UPPER(CONCAT(:nameStartsWith,'%'))")
	public List<MarvelSeries> findByCharacterId(@Param("id")Long id, @Param("nameStartsWith") String nameStartsWith);
	
}
