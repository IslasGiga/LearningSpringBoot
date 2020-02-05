package com.example.learning.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learning.domain.Client;
import com.example.learning.exceptions.ObjectNotFoundException;
import com.example.learning.repository.ClientRepository;



@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repo;
	
	public Client search(Integer id) {
		Optional<Client> cat = repo.findById(id);
		return cat.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Client.class.getName(), null));
		
	}
}
