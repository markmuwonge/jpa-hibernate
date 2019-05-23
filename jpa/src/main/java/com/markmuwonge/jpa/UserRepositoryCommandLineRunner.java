package com.markmuwonge.jpa;

import java.awt.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.markmuwonge.jpa.entity.User;
import com.markmuwonge.jpa.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {
	
	private static final org.slf4j.Logger log = 
			LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User user = new User("Mark's Clone", "Admin");
		//New User is created User [id=1, name=Mark, role=Admin]
		userRepository.save(user);	
		log.info("New User is created " + user);
		Optional<User> userWithIdOne = userRepository.findById(1L);
		log.info("User is retrieved " + userWithIdOne);
		
		java.util.List<User> users = userRepository.findAll();
		log.info("All users : " + users);
		
	}
	
	
	

}
