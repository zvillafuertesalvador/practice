package com.iberotec.practice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iberotec.practice.domain.model.repository.jpa.DocumentJpaRepository;
import com.iberotec.practice.service.iface.DocumentService;

@Service
public class DocumentServiceImpl implements DocumentService{
	
	@Autowired
	private DocumentJpaRepository PracticeJpaRepository;

}
