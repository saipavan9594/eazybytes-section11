package com.example.section11accounts.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.section11accounts.model.Accounts;

public interface AccountsRepository extends CrudRepository<Accounts, Long> {
	
	Accounts findByCustomerId(int customerId);

}
