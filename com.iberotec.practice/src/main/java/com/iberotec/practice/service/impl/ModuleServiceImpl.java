package com.iberotec.practice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iberotec.practice.domain.model.entities.Module;
import com.iberotec.practice.domain.model.repository.jpa.ModuleJpaRepository;
import com.iberotec.practice.service.iface.ModuleService;

@Service
public class ModuleServiceImpl implements ModuleService{

	@Autowired
	private ModuleJpaRepository moduleJpaRepository;
	
	@Override
	public List<Module> findByAcadProg(String acadProg) {
		return moduleJpaRepository.findByAcadProg(acadProg);
	}

}
