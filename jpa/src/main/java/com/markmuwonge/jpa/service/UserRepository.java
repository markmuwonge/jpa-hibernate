package com.markmuwonge.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;
import com.markmuwonge.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
