package com.restapi.marvel.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="comic")
public class MarvelComic implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description", columnDefinition = "text")
	private String description;
	
	@Column(name="isbn")
	private String isbn;
	
	@Column(name="pageCount")
	private int pageCount;
	
	@Transient
	private String resourceURI;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<MarvelImage> images;
	
	@ManyToOne(optional = true)
	private MarvelImage imageThumbnail;
	
	
	public MarvelComic() {
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}

	public List<MarvelImage> getImages() {
		return images;
	}

	public void setImages(List<MarvelImage> images) {
		this.images = images;
	}

	public MarvelImage getImageThumbnail() {
		return imageThumbnail;
	}

	public void setImageThumbnail(MarvelImage imageThumbnail) {
		this.imageThumbnail = imageThumbnail;
	}
	

	@Override
	public String toString() {
		return "MarvelComic [id=" + id + ", title=" + title + ", description=" + description + ", isbn=" + isbn
				+ ", pageCount=" + pageCount + ", resourceURI=" + resourceURI + ", images=" + images + ", imageThumbnail=" 
				+ imageThumbnail + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((imageThumbnail == null) ? 0 : imageThumbnail.hashCode());
		result = prime * result + ((images == null) ? 0 : images.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((resourceURI == null) ? 0 : resourceURI.hashCode());
		result = prime * result + pageCount;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		MarvelComic other = (MarvelComic) obj;
		
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
		if (images == null) {
			if (other.images != null)
				return false;
		} else if (!images.equals(other.images))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (pageCount != other.pageCount)
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
		return true;
	}
	
}
