package com.caiopivetta6.domain;

import jakarta.persistence.Entity;

@Entity
public class AccountSaving extends BankAccount {
	
	private static final long serialVersionUID = 1L;
	private Integer yieldDays;
	
	public AccountSaving() {
		
	}
	
	public AccountSaving(Integer id, Double balance, Client client,  Integer yieldDays) {
		super(id, balance, client);
		this.yieldDays = yieldDays;
	}
	
	public Integer getYieldDays() {
		return yieldDays;
	}
	
	public void setYieldDays(Integer yieldDays) {
		this.yieldDays = yieldDays;
	}
	
	
	
}
