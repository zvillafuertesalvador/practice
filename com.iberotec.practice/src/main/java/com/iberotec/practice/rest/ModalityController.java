package com.iberotec.practice.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iberotec.practice.domain.model.entities.Modality;
import com.iberotec.practice.service.iface.ModalityService;

@RequestMapping("/modality")
@RestController
public class ModalityController {
	
	@Autowired
	private ModalityService modalityService;
	
	@GetMapping(value = "/findAll")
	public List<Modality> findAll(){
		System.out.println(modalityService.findAll());
		return modalityService.findAll();
	}
	
	@GetMapping(value = "/find")
	public String test(){
		return "name";
	}
}
