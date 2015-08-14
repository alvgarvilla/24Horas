package com.webberis.rtm.beans;

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
@Table(name = "PLAYER")
public class Player {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PLAYER")
	private int id;
	
	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Column(name = "SURNAME", nullable = false)
	private String surname;
	
	@Column(name = "DATE_BIRTH", nullable = false)
	private Date dateBirth;
	
	@Column(name = "DATE_ENROLMENT", nullable = false)
	private Date dateEnrolment;
	
	@ManyToOne()
	@JoinColumn(name = "ID_CLUB")
	private Club club;

	public Player() {
	}

	public Player(String name, String surname, Date dateBirth, Date dateEnrolment, Club club) {
		this.name = name;
		this.surname = surname;
		this.dateBirth = dateBirth;
		this.dateEnrolment = dateEnrolment;
		this.club = club;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	public Date getDateEnrolment() {
		return dateEnrolment;
	}

	public void setDateEnrolment(Date dateEnrolment) {
		this.dateEnrolment = dateEnrolment;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}
	
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", surname=" + surname + ", dateBirth=" + dateBirth
				+ ", dateEnrolment=" + dateEnrolment + ", club=" + club + "]";
	}	

}
