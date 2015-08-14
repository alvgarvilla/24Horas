package com.webberis.rtm.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class StatusParticipation {
	
	@Id
	@Column(name = "ID_STATUS")
	private int id;
	
	@Column(name = "STATUS")
	private String status;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	private List<Participation> participations;
	
	
	public StatusParticipation() {
	}

	public StatusParticipation(int id, String status, List<Participation> participations) {
		this.id = id;
		this.status = status;
		this.participations = participations;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Participation> getParticipations() {
		return participations;
	}

	public void setParticipations(List<Participation> participations) {
		this.participations = participations;
	}
	
	

}
