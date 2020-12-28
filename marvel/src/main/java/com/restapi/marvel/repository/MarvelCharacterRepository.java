package com.restapi.marvel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.marvel.model.MarvelCharacter;

public interface MarvelCharacterRepository extends JpaRepository<MarvelCharacter, Long> {
	
}
