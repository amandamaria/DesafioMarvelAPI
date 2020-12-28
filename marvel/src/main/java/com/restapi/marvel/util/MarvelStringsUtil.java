package com.restapi.marvel.util;

public class MarvelStringsUtil {
	public static final String DEFAULT_URI="/v1/public";
	
	private static String DEFAULT_URI_CHARACTERS="/v1/public/%d";
	
	public static String getDefaultURICharacters(Long id) {
		return String.format(DEFAULT_URI_CHARACTERS, id);
	}
}
