package com.example.mynews.dto;

import lombok.Data;

@Data
public class Member {
	
	private int memberId; // PK
	private String firstName;
	private String lastName;
	private int addressId; // FK → address.address_id
	private String email;
	private int active;
	private String username;
	private String password;
	private String lastUpdate;
	

}
