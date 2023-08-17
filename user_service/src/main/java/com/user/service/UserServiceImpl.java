package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService{

	
	List<User> list = List.of(new User(1111L,"Aditya","1234567890"),
			new User(2222L,"Mudar","0987654321"),
			new User(3333L,"Ram","12345609876"));
	
	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}
	
	
}
