package com.caiopivetta6.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "AccountSpecial")
public class AccountSpecial extends Account {
	
	private Double limit;

	public AccountSpecial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountSpecial(Integer id, double balance, Double limit) {
		super(id, balance);
		this.limit = limit;
		// TODO Auto-generated constructor stub
	}

	public Double getLimit() {
		return limit;
	}

	public void setLimit(Double limit) {
		this.limit = limit;
	}
	
	
	
	
	
	
	
}
