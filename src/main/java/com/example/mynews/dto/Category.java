package com.example.mynews.dto;

import lombok.Data;

@Data
public class Category {
	
	private int categoryId; // PK
	private String code;
	private String name;
	private String description;
	private String lastUpdate;

}
