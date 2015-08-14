package com.webberis.rtm.beans;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Category {
	
	@Id
	@Column(name = "ID_CATEGORY")
	private int id;
	
	@Column(name = "DATE_MAX_BIRTH", nullable = false)
	private Date dateMaxBirth;
	
	@Column(name = "CATEGORY")
	private String category;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	private List<Participation> participations;
	
	
	public Category (){
		
	}

	public Category(int id, Date dateMaxBirth, String category) {
		this.id = id;
		this.dateMaxBirth = dateMaxBirth;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateMaxBirth() {
		return dateMaxBirth;
	}

	public void setDateMaxBirth(Date dateMaxBirth) {
		this.dateMaxBirth = dateMaxBirth;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
