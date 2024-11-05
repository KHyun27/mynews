package com.example.mynews.dto;

import lombok.Data;

@Data
public class Country {
	
	private int countryId; // PK
	private String code;
	private String name;
	private String lastUpdate;

}
