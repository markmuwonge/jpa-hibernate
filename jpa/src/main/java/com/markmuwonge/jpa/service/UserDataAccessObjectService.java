package com.markmuwonge.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.markmuwonge.jpa.entity.User;

@Repository //interacts  with the database
@Transactional //each method will be involved in a transaction
public class UserDataAccessObjectService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(User user)
	{
		entityManager.persist(user);
		return user.getId();
	}

}
