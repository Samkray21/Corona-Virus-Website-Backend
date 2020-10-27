package com.krayemsecond.coronasupportsite.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="tbl_book")

public class Shop {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	private String sku;
	
	private String name;
	
	private String description;
	
	@Column(name="image_url")
	private String imageUrl;
	
	private boolean active;
	

	@Column(name="date_created")
	private Date createdOn;
	
	@Column(name="last_updated")
	private Date updatedOn;
	
	private int likes;
	
	private int dislike;
	
	private int difference;


	
	@ManyToOne
	@JoinColumn(name="category_id", nullable=false)
	private ShopCategory category;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
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


	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}


	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public ShopCategory getCategory() {
		return category;
	}

	public void setCategory(ShopCategory category) {
		this.category = category;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getDislike() {
		return dislike;
	}

	public void setDislike(int dislike) {
		this.dislike = dislike;
	}

	public int getDifference() {
		return difference;
	}

	public void setDifference(int difference) {
		this.difference = difference;
	}
	
	
	
	
	
	
	
	
	
}
