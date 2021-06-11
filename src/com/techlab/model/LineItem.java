package com.techlab.model;

public class LineItem {
	private int id;
	private String name;
	private double unitPrice;
	private int quantity;
	private double totalItemCost;
	
	public LineItem(int id, String name, double unitPrice, int quantity) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double CalculateItemCost() {
		totalItemCost = quantity * unitPrice;
		return totalItemCost;
	}
	
	@Override
	public String toString() {
		return "Id: " + id + ", Name: " + name + ", Unit Price: " + unitPrice + ", Quantity: " + quantity + " Total Item Cost: "+ totalItemCost;
	}
	
}	
