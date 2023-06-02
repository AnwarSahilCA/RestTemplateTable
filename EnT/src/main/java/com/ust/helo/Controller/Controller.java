package com.ust.helo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.helo.Entity.Products1;
import com.ust.helo.Repository.jpaRepository;

@RestController
@RequestMapping("/product")
public class Controller {
	@Autowired
	jpaRepository jrepo;
	@PostMapping("/create")
	public ResponseEntity<Products1> create(@RequestBody Products1 product){
		jrepo.save(product);
		return ResponseEntity.status(HttpStatus.OK).body(product);
		
	}
	@GetMapping("/retrieve/{id}")
	public ResponseEntity<Products1> retrieve(@PathVariable long id){
		Optional<Products1> opt=jrepo.findById(id);
		return ResponseEntity.status(HttpStatus.OK).body(opt.get());
		
	
	}
	@GetMapping("/retrieveall")
	public ResponseEntity<List<Products1>> retrieveall(){
		List<Products1> l1=jrepo.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(l1);
	}

}
