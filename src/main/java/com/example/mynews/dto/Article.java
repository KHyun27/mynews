package com.example.mynews.dto;

import lombok.Data;

@Data
public class Article {
	
	private int articleId; // PK
	private String author;
	private String title; 
	private String description;
	private String url;
	private String urlToImage;
	private String publishedAt;
	private int countryId; // FK → country.countryId
	private int categoryId; // FK → category.categoryId
	private int sourceId; // FK → source.sourceId
	private String lastUpdate;

}
