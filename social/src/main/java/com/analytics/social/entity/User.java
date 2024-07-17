package com.analytics.social.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "`user`")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private String bio;
    private String contactOptions;
    private String links;
	public User(String name, String category, String bio, String contactOptions, String links) {
		super();
		
		this.name = name;
		this.category = category;
		this.bio = bio;
		this.contactOptions = contactOptions;
		this.links = links;
	}
	
	
	
	public User() {
		super();
		
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getContactOptions() {
		return contactOptions;
	}
	public void setContactOptions(String contactOptions) {
		this.contactOptions = contactOptions;
	}
	public String getLinks() {
		return links;
	}
	public void setLinks(String links) {
		this.links = links;
	}
    
    

    
}
