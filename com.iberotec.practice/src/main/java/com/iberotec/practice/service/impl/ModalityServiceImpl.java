package com.iberotec.practice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iberotec.practice.domain.model.entities.Modality;
import com.iberotec.practice.domain.model.repository.jpa.ModalityJpaRepository;
import com.iberotec.practice.service.iface.ModalityService;

@Service
public class ModalityServiceImpl implements ModalityService{

	@Autowired
	private ModalityJpaRepository modalityJpaRepository;

	@Override
	public List<Modality> findAll() {
		return modalityJpaRepository.findAll();
	}
	
}
