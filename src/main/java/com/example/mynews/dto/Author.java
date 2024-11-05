package com.example.mynews.dto;

import lombok.Data;

@Data
public class Author {
	
	private int authorId; // PK
	private String firstName;
	private String lastName;
	private int addressId; // FK → address.address_id
	private String email;
	private String password;
	private String lastUpdate;

}
