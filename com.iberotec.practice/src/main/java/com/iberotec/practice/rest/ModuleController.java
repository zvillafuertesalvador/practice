package com.iberotec.practice.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iberotec.practice.domain.model.entities.Module;
import com.iberotec.practice.service.iface.ModuleService;

@RequestMapping("/module")
@RestController
public class ModuleController {
	
	@Autowired
	private ModuleService moduleService;
	
	@GetMapping(value = "/findByAcadProg")
	public List<Module> findByAcadProg(){
		return moduleService.findByAcadProg("TELEM");
	}
}
