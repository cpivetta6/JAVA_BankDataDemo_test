package com.caiopivetta6;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.caiopivetta6.domain.AccountSaving;
import com.caiopivetta6.domain.AccountSpecial;
import com.caiopivetta6.domain.Address;
import com.caiopivetta6.domain.BankAccount;
import com.caiopivetta6.domain.BankAgency;
import com.caiopivetta6.domain.City;
import com.caiopivetta6.domain.Client;
import com.caiopivetta6.domain.State;
import com.caiopivetta6.repositories.AddressRepository;
import com.caiopivetta6.repositories.BankAccountRepository;
import com.caiopivetta6.repositories.BankAgencyRepository;
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
	private BankAccountRepository bankAccountRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private BankAgencyRepository bankAgencyRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//State and City
		
		State state = new State(null, "Veneto");
		City city = new City(null, "Verona", state);
		
		stateRepository.save(state);
		cityRepository.save(city);
		
		Address address1 = new Address(null, "Corso Porta Nuova", "Borgo Venezia", "72", "31412", city);
		Address address2 = new Address(null, "Piazza del Uomo", "Milano Centrale", "72", "31412", city);
		
		addressRepository.saveAll(Arrays.asList(address1,address2));
		
		
		//Client

		Client client1 = new Client(null, "Carl Jung", "carl@gmail.com", address1);
		Client client2 = new Client(null, "July Jung", "july@gmail.com", address1);
		
		client1.getPhone().add("3451234123");
		
		
		//BANK
		
		BankAgency bankAgency = new BankAgency(null, "Bank of Verona", 3322);
		//BankAgency bankAgency2 = new BankAgency(null, "Bank of Verona", 3322);
		
		
		//ACCOUNT
		BankAccount account_client2 = new AccountSpecial(null, 3000.0, client1, 200.0);
		BankAccount account_client1 = new AccountSaving(null, 2000.0, client2, 2);
		
		
		bankAgency.getClients().addAll(Arrays.asList(client1, client2));
		client1.setBankAccount(account_client1);
		client2.setBankAccount(account_client2);
		
		
		bankAccountRepository.saveAll(Arrays.asList(account_client1, account_client2));
		bankAgencyRepository.saveAll(Arrays.asList(bankAgency));
		clientRepository.saveAll(Arrays.asList(client1, client2));
		
		client1.setBankAgency(bankAgency);
		client2.setBankAgency(bankAgency);
		
		clientRepository.saveAll(Arrays.asList(client1, client2));
		
	}

}
