package com.markmuwonge.jpa;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.markmuwonge.jpa.entity.User;
import com.markmuwonge.jpa.service.UserDataAccessObjectService;

@Component
public class UserDataAccessObjectCommandLineRunner implements CommandLineRunner {
	
	private static final org.slf4j.Logger log = 
			LoggerFactory.getLogger(UserDataAccessObjectCommandLineRunner.class);
	
	@Autowired
	private UserDataAccessObjectService userataAccessObjectService;
	
	@Override
	public void run(String... args) throws Exception {
		
		User user = new User("Mark", "Admin");
		//New User is created User [id=1, name=Mark, role=Admin]
		long insert = userataAccessObjectService.insert(user);		
		log.info("New User is created " + user);
		
	}
	
	
	

}
