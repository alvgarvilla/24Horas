package com.webberis.rtm.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webberis.rtm.beans.Club;
import com.webberis.rtm.dao.GenericDAO;
import com.webberis.rtm.service.GenericService;

@Service("clubService")
@Transactional()
public class ClubServiceImpl implements GenericService<Club>{

	private static final Logger logger = Logger.getLogger(ClubServiceImpl.class);
	
	@Autowired
	GenericDAO<Club> clubDao;
	
	public int save(Club element) {
		logger.info("Saving a Club element");
		try {
			Club club = clubDao.save(element);
			return club.getId();			
		} catch (HibernateException e) {
			logger.error("There was an error while saving a Club element", e);
			throw e;
		}
	}

	public void delete(Club element) {
		logger.info("Deleting a Club element");
		try {
			clubDao.delete(element);			
		} catch (HibernateException e) {
			logger.error("There was an error while deleting a Club element", e);			
			throw e;
		}	
	}

	public List<Club> getAll() {
		logger.info("Getting all Club elements");
		try {
			return clubDao.getAll(Club.class);			
		} catch (HibernateException e) {
			logger.error("There was an error while getting all Club elements", e);
			throw e;
		}	
	}

	public Club get(int id) {
		logger.info("Getting Club element");
		try {
			return clubDao.get(Club.class, id);			
		} catch (HibernateException e) {
			logger.error("There was an error while getting a Club element", e);
			throw e;
		}
	}

}
