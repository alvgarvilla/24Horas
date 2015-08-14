package com.webberis.rtm.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Participation {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PARTICIPATION")
	private int id;
	
	@ManyToOne()
	@JoinColumn(name = "ID_PLAYER", nullable = false)
	private Player player;
	
	@ManyToOne()
	@JoinColumn(name = "ID_CATEGORY", nullable = false)
	private Category category;
	
	@Column(name = "DATE_ENROLMENT", nullable = false)
	private Date dateEnrolment;
	
	@ManyToOne()
	@JoinColumn(name = "ID_PARTICIPATION_STATUS", nullable = false)
	private StatusParticipation status;
	
	@Column(name = "DORSAL_NUMBER")
	private int dorsalNumber;
	

}
