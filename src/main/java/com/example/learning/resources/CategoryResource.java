package com.example.learning.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.learning.domain.Category;
import com.example.learning.services.CategoryService;

@RestController
@RequestMapping(value="categories")
public class CategoryResource {

	@Autowired
	private CategoryService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> list(@PathVariable Integer id) {
		
		Category obj = service.search(id);
		return ResponseEntity.ok(obj);
		
	}
	
	@RequestMapping(method = RequestMethod.POST)	
	public ResponseEntity<Void> insert(@RequestBody Category obj) {
		
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
		
	}
}
