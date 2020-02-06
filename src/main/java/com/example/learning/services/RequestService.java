package com.example.learning.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learning.domain.Request;
import com.example.learning.exceptions.ObjectNotFoundException;
import com.example.learning.repository.RequestRepository;



@Service
public class RequestService {
	
	@Autowired
	private RequestRepository repo;
	
	public Request search(Integer id) {
		Optional<Request> cat = repo.findById(id);
		return cat.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Request.class.getName(), null));

	}
}
