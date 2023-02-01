package com.caiopivetta6.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {

	private Integer id;
	private String name;
	private Integer acc;
	private String email;
	
	private List<String> phone = new ArrayList<>();
	
	public Client() {
		
	}

	public Client(Integer id, String name, Integer acc, String email) {
		super();
		this.id = id;
		this.name = name;
		this.acc = acc;
		this.email = email;
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

	public Integer getAcc() {
		return acc;
	}

	public void setAcc(Integer acc) {
		this.acc = acc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
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
		Client other = (Client) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
