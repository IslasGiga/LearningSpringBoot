package com.example.learning;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.learning.domain.Address;
import com.example.learning.domain.BillPayment;
import com.example.learning.domain.CardPayment;
import com.example.learning.domain.Category;
import com.example.learning.domain.City;
import com.example.learning.domain.Client;
import com.example.learning.domain.Payment;
import com.example.learning.domain.Product;
import com.example.learning.domain.Request;
import com.example.learning.domain.State;
import com.example.learning.domain.enums.ClientType;
import com.example.learning.domain.enums.PaymentState;
import com.example.learning.repository.AddressRepository;
import com.example.learning.repository.CategoryRepository;
import com.example.learning.repository.CityRepository;
import com.example.learning.repository.ClientRepository;
import com.example.learning.repository.PaymentRepository;
import com.example.learning.repository.ProductRepository;
import com.example.learning.repository.RequestRepository;
import com.example.learning.repository.StateRepository;

@SpringBootApplication
public class LearningApplication implements CommandLineRunner{
	
	@Autowired
	CategoryRepository catRepo;
	
	@Autowired
	ProductRepository prodRepo;
	
	@Autowired
	CityRepository cityRepo;
	
	@Autowired
	StateRepository stateRepo;
	
	@Autowired
	ClientRepository clientRepo;
	
	@Autowired
	AddressRepository addressRepo;
	
	@Autowired
	RequestRepository requestRepo;
	
	@Autowired
	PaymentRepository paymentRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(LearningApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
			
		Category cat1 = new Category(null, "Informática");
		Category cat2 = new Category(null, "Escritório");
		
		Product p1 = new Product(null, "Computador", 2000);
		Product p2 = new Product(null, "Impressora", 800);
		Product p3 = new Product(null, "Mouse", 100);
		
		
		State state1 = new State(null, "Minas Gerais");
		State state2 = new State(null, "São Paulo");
		
		City city1 = new City(null, "Uberlandia", state1);
		City city2 = new City(null, "São Paulo", state2);
		City city3 = new City(null, "Campinas", state2);
		
		state1.getCities().addAll(Arrays.asList(city1));
		state2.getCities().addAll(Arrays.asList(city2, city3));
		
		
		
		cat1.getProducts().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProducts().addAll(Arrays.asList(p2));
		
		p1.getCategories().addAll(Arrays.asList(cat1));
		p2.getCategories().addAll(Arrays.asList(cat1, cat2));
		p3.getCategories().addAll(Arrays.asList(cat1));
		
		
		catRepo.saveAll(Arrays.asList(cat1, cat2));
		prodRepo.saveAll(Arrays.asList(p1, p2, p3));
		stateRepo.saveAll(Arrays.asList(state1, state2));
		cityRepo.saveAll(Arrays.asList(city1, city2, city3));
		
		Client c1 = new Client(null, "Maria Silva", "maria@email.com", "8532568245", ClientType.INDIVIDUAL);
		c1.getPhones().addAll(Arrays.asList("85998854545", "85995658457"));
		
		
		Address a1 = new Address(null, "Rua das Flores", "216", "Apartamento 12", "Jardins", "31254874", city1,
				c1);
		Address a2 = new Address(null, "Avenida Matos", "105", "Sala 800", "Centro", "38789258", city2,
				c1);
		
		clientRepo.saveAll(Arrays.asList(c1));
		addressRepo.saveAll(Arrays.asList(a1, a2));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Request request1 = new Request(null, sdf.parse(("30/09/2017 10:32")), c1, a1);
		Request request2 = new Request(null, sdf.parse(("10/10/2017 19:35")), c1, a2);
		
		Payment payment1 = new CardPayment(null, PaymentState.SETTLED, request1, 6);
		request1.setPayment(payment1);
		
		Payment payment2 = new BillPayment(null, PaymentState.PENDING, request2, sdf.parse("20/10/2017 00:00"), null);
		request2.setPayment(payment2);
		
		c1.getRequests().addAll(Arrays.asList(request1, request2));
		
		requestRepo.saveAll(Arrays.asList(request1, request2));
		paymentRepo.saveAll(Arrays.asList(payment1, payment2));
		
	}

}
