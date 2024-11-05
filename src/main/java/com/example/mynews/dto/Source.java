package com.example.mynews.dto;

import lombok.Data;

@Data
public class Source {
	
	private int sourceId; // PK
	private String id;
	private String name;
	private String lastUpdate;

}
