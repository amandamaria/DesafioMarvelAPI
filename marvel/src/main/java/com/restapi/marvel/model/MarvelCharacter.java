package com.restapi.marvel.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.restapi.marvel.util.MarvelStringsUtil;

@Entity
@Table(name = "character")
public class MarvelCharacter implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description", columnDefinition = "text")
	private String description;	
	
	@Transient
	private String resourceURI;
	
	@Column(columnDefinition = "text")
	private String urls;
	
	@ManyToOne(optional = true)
	private MarvelImage imageThumbnail;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="character_comics", joinColumns=
		{@JoinColumn(name="marvel_character_id")}, inverseJoinColumns= {@JoinColumn(name="comics_id")})
	private List<MarvelComic> comics;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="character_stories", joinColumns=
		{@JoinColumn(name="marvel_character_id")}, inverseJoinColumns= {@JoinColumn(name="stories_id")})
	private List<MarvelStory> stories;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="character_events", joinColumns=
		{@JoinColumn(name="marvel_character_id")}, inverseJoinColumns= {@JoinColumn(name="events_id")})
	private List<MarvelEvent> events;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="character_series", joinColumns=
		{@JoinColumn(name="marvel_character_id")}, inverseJoinColumns= {@JoinColumn(name="series_id")})
	private List<MarvelSeries> series;
	
	public MarvelCharacter(){		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getResourceURI() {
		return MarvelStringsUtil.getDefaultURICharacters(id);
	}

	public String getUrls() {
		return urls;
	}

	public void setUrls(String urls) {
		this.urls = urls;
	}

	public MarvelImage getImageThumbnail() {
		return imageThumbnail;
	}

	public void setImageThumbnail(MarvelImage imageThumbnail) {
		this.imageThumbnail = imageThumbnail;
	}

	public List<MarvelComic> getComics() {
		return comics;
	}

	public void setComics(List<MarvelComic> comics) {
		this.comics = comics;
	}

	public List<MarvelStory> getStories() {
		return stories;
	}

	public void setStories(List<MarvelStory> stories) {
		this.stories = stories;
	}

	public List<MarvelEvent> getEvents() {
		return events;
	}

	public void setEvents(List<MarvelEvent> events) {
		this.events = events;
	}

	public List<MarvelSeries> getSeries() {
		return series;
	}

	public void setSeries(List<MarvelSeries> series) {
		this.series = series;
	}	

	@Override
	public String toString() {
		return "MarvelCharacter [id=" + id + ", name=" + name + ", description=" + description 
				+ ", resourceURI=" + resourceURI + ", urls=" + urls + ", imageThumbnail=" + imageThumbnail
				+ ", comics=" + comics + ", stories=" + stories + ", events=" + events + ", series=" + series + "]";
	}	
	
}
