package com.ust.helo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping("/a")
public class Control {
	@Autowired
	Environment environment;
	@Autowired
	RestTemplate template;
	@GetMapping("/connect")
	public List connection() {
		String port="http://localhost:8085/product/retrieveall";
		List output =template.getForObject(port, List.class);
		return output;
		
	}
	

}
