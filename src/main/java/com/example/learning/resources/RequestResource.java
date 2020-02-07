package com.example.learning.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.learning.domain.Request;

import com.example.learning.services.RequestService;

@RestController
@RequestMapping(value="requests")
public class RequestResource {

	@Autowired
	private RequestService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> list(@PathVariable Integer id) {
		
		Request obj = service.search(id);
		return ResponseEntity.ok(obj);
		
	}
}
