package com.webberis.rtm.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webberis.rtm.beans.Player;
import com.webberis.rtm.dao.GenericDAO;
import com.webberis.rtm.service.GenericService;

@Service("playerService")
@Transactional
public class PlayerServiceImpl implements GenericService<Player>{
	
	private static final Logger logger = Logger.getLogger(ClubServiceImpl.class);

	@Autowired
	GenericDAO<Player> playerDao;
	
	public int save(Player element) {
		logger.info("Saving a Player element");
		try {
			Player player = playerDao.save(element);
			return player.getId();			
		} catch (HibernateException e) {
			logger.error("There was an error while saving a Player element", e);
			throw e;
		}
	}

	public void delete(Player element) {
		logger.info("Deleting a Club element");
		try {
			playerDao.delete(element);			
		} catch (HibernateException e) {
			logger.error("There was an error while deleting a Club element", e);			
			throw e;
		}	
	}

	public List<Player> getAll() {
		logger.info("Getting all Player elements");
		try {
			return playerDao.getAll(Player.class);			
		} catch (HibernateException e) {
			logger.error("There was an error while getting all Player elements", e);
			throw e;
		}	
	}

	public Player get(int id) {
		logger.info("Getting Club element");
		try {
			return playerDao.get(Player.class, id);			
		} catch (HibernateException e) {
			logger.error("There was an error while getting a Player element", e);
			throw e;
		}
	}

}
