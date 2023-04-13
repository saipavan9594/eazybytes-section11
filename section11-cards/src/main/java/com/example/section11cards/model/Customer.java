package com.example.section11cards.model;


import jakarta.persistence.Id;

import lombok.Data;

@Data
public class Customer {
	
	@Id
	private int customerId;

}
