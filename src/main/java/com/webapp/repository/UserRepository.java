package com.webapp.repository;

import org.springframework.stereotype.Repository;

import com.webapp.entity.UserEntity;

@Repository
public class UserRepository {

	public UserEntity getUser(long id) 
	{
		UserEntity userEntity = new UserEntity(100, "Manoj", "Gurrala", "Software", 40, 50000);
		System.out.println(" UserRepository User Entity : " + userEntity.toString());
		return userEntity; 
	}
}
