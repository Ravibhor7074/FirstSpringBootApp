package com.example.SpringBootExample.Entity;

import java.io.Serializable;

public class Data implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String color;
    public String capacity;

	/*
	 * public double price; public String generation; public int year; public String
	 * description;
	 */
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	/*
	 * public double getPrice() { return price; } public void setPrice(double price)
	 * { this.price = price; } public String getGeneration() { return generation; }
	 * public void setGeneration(String generation) { this.generation = generation;
	 * } public int getYear() { return year; } public void setYear(int year) {
	 * this.year = year; } public String getDescription() { return description; }
	 * public void setDescription(String description) { this.description =
	 * description; }
	 */
	public Data(String color, String capacity) {
		super();
		this.color = color;
		this.capacity = capacity;
		/*
		 * this.price = price; this.generation = generation; this.year = year;
		 * this.description = description;
		 */
	}
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Data [color=" + color + ", capacity=" + capacity + "]";
	}
    
 
 
}




