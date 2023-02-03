package com.caiopivetta6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiopivetta6.domain.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Integer> {

	
	
}
