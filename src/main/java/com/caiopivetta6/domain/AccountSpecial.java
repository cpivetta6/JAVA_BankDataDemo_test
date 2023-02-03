package com.caiopivetta6.domain;

import jakarta.persistence.Entity;

@Entity
public class AccountSpecial extends BankAccount {

	private static final long serialVersionUID = 1L;
	private Double limite;

	public AccountSpecial() {
		
	}

	public AccountSpecial(Integer id, Double balance, Client client, Double limite) {
		super(id, balance, client);
		this.limite = limite;
	}

	public Double getLimit() {
		return limite;
	}

	public void setLimit(Double limit) {
		this.limite = limit;
	}
	
	
	
	
}
