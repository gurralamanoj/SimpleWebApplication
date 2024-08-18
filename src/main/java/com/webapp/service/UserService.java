package com.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.entity.UserEntity;
import com.webapp.model.User;
import com.webapp.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public User getUser(long id)
	{
		UserEntity userEntity = userRepository.getUser(id);
		System.out.println(" UserService User Entity : " + userEntity.toString());
		User user = new User();
		System.out.println(" UserService User  : " + user.UserMapper(userEntity).toString());
		return user.UserMapper(userEntity);
	}
}
