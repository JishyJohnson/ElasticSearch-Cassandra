package com.utmc.inventory.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.stereotype.Component;

//@Component
@Table("items")
public class Items {
	@PrimaryKey
	private int itemNo;
	private String itemName;
	private double price;
	
	
	public Items(int itemNo, String itemName, double price) {
		super();
		this.itemNo = itemNo;
		this.itemName = itemName;
		this.price = price;
	}
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
