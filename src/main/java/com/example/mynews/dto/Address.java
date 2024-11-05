package com.example.mynews.dto;

import lombok.Data;

@Data
public class Address {
	
	private int addressId; // PK
	private String address;
	private String address2;
	private String district;
	private int cityId; // FK → city.city_id
	private String postalCode;
	private String phone;
	private String lastUpdate;

}
