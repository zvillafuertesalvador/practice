package com.iberotec.practice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iberotec.practice.domain.model.repository.jpa.UserJpaRepository;
import com.iberotec.practice.service.iface.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserJpaRepository userJpaRepository;
	
}
