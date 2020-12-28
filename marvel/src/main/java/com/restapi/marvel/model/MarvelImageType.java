package com.restapi.marvel.model;

public enum MarvelImageType {
	
	PNG("PNG"),
	JPG("JPG"),
	BITMAP("BITMAP"),
	GIF("GIF");	
	
	private String name;
	
	private MarvelImageType(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
