package com.caiopivetta6.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "BankAgency_tb")
public class BankAgency implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Integer agencyNumber;
	
	@OneToMany(mappedBy = "bankAgency")
	private List<Client> clients = new ArrayList<>();
	
	@JsonManagedReference
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;
	
	@OneToMany(mappedBy = "bankAgency")
	private List<Account> accounts = new ArrayList<>();
	
	public BankAgency() {
		
	}

	public BankAgency(Integer id, String name, Integer agencyNumber) {
		super();
		this.id = id;
		this.name = name;
		this.agencyNumber = agencyNumber;
	}
	
	
	

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAgencyNumber() {
		return agencyNumber;
	}

	public void setAgencyNumber(Integer agencyNumber) {
		this.agencyNumber = agencyNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAgency other = (BankAgency) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
