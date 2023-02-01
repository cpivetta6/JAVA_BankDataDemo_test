package com.caiopivetta6.domain;

public class AccountSaving extends Account {
	
	
	private Integer yieldDays;
	
	
	public AccountSaving() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AccountSaving(Integer id, double balance, Integer yieldDays) {
		super(id, balance);
		this.yieldDays = yieldDays;
		// TODO Auto-generated constructor stub
	}
	
	public Integer getYieldDays() {
		return yieldDays;
	}
	
	public void setYieldDays(Integer yieldDays) {
		this.yieldDays = yieldDays;
	}
	
	
	
	
}
