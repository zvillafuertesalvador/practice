package com.iberotec.practice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iberotec.practice.service.iface.DocumentService;

@RequestMapping("/practice")
@RestController
public class DocumentController {
	
	@Autowired
	private DocumentService documentService;
	
	
	@GetMapping("/index")
	public String index(){
		return "HI bladimir";
	}
}
