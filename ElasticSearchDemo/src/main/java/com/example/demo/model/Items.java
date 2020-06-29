package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(indexName = "customerindex")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Items {
	@Id
	private int itemNo;
	private String itemName;
	private double price;
	
	

}
