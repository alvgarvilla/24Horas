package com.webberis.com.general;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.webberis.rtm.beans.Club;
import com.webberis.rtm.configuration.ApplicationCtxConfiguration;
import com.webberis.rtm.service.GenericService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationCtxConfiguration.class)
public class GeneralFlowTest {
	
	private static final Logger logger = Logger.getLogger(GeneralFlowTest.class);
	
	@Autowired
	@Qualifier("clubService")
	private GenericService<Club> clubService;
	
	
	
	@Test
	public void clubFlow(){
		
//		Club club = new Club ("Rivas TM", "La Zarzuela, 10", "Rivas Vaciamadrid");
//		
//		int clubId = clubService.save(club);
		try {
			Club club2 = clubService.get(5);
			logger.info("--------------------------------------------------");
			logger.info("Club found with: "+club2.toString());
			logger.info("--------------------------------------------------");
			
	//		List<Club> clubLists = clubService.getAll();
	//		
	//		for (Club club3 : clubLists) {
	//			logger.info("--------------------------------------------------");
	//			logger.info(club3.getName());
	//			logger.info("--------------------------------------------------");
	//		}
			
			clubService.delete(club2);
		} catch (HibernateException e){
			logger.error(e);
		}
		
//		Club club4 = clubService.get(clubId);
//		logger.info("--------------------------------------------------");
//		logger.info("Club found with: "+club4.toString());
//		logger.info("--------------------------------------------------");
		
	}

}
