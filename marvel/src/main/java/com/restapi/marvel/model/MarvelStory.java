package com.restapi.marvel.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "story")
public class MarvelStory implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description", columnDefinition = "text")
	private String description;
	
	@Column(name="type")
	private String type;
		
	@Transient
	private String resourceURI;
		
	@ManyToOne(optional = true)
	private MarvelImage imageThumbnail;
	
	public MarvelStory() {		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}

	public MarvelImage getImageThumbnail() {
		return imageThumbnail;
	}

	public void setImageThumbnail(MarvelImage imageThumbnail) {
		this.imageThumbnail = imageThumbnail;
	}
	
	

	@Override
	public String toString() {
		return "MarvelStory [id=" + id + ", title=" + title + ", description=" + description + ", type=" + type
				+ ", resourceURI=" + resourceURI + ", imageThumbnail=" + imageThumbnail + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((imageThumbnail == null) ? 0 : imageThumbnail.hashCode());
		result = prime * result + ((resourceURI == null) ? 0 : resourceURI.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarvelStory other = (MarvelStory) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (imageThumbnail == null) {
			if (other.imageThumbnail != null)
				return false;
		} else if (!imageThumbnail.equals(other.imageThumbnail))
			return false;
		if (resourceURI == null) {
			if (other.resourceURI != null)
				return false;
		} else if (!resourceURI.equals(other.resourceURI))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
}
