package com.caiopivetta6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.caiopivetta6.domain.Address;
import com.caiopivetta6.domain.City;
import com.caiopivetta6.domain.Client;
import com.caiopivetta6.domain.State;
import com.caiopivetta6.repositories.AccountRepository;
import com.caiopivetta6.repositories.AddressRepository;
import com.caiopivetta6.repositories.CityRepository;
import com.caiopivetta6.repositories.ClientRepository;
import com.caiopivetta6.repositories.StateRepository;

@SpringBootApplication
public class BankDataDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BankDataDemoApplication.class, args);
	}
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//State and City
		
		State state = new State(null, "Veneto");
		City city = new City(null, "Verona", state);
		
		stateRepository.save(state);
		cityRepository.save(city);
		
		Address address1 = new Address(null, "Corso Porta Nuova", "Borgo Venezia", "72", "31412", city);
		addressRepository.save(address1);
		
		//Client
		
		Client client = new Client();
		
		
		
		
		
		
		
	}

}
