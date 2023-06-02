package com.ust.helo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class Controller {
	@GetMapping("/service")
	public String welcome() {
		return "hello";
	}
	
	
	

}
