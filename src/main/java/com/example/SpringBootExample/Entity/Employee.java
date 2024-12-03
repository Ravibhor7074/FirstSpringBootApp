package com.example.SpringBootExample.Entity;

public class Employee {
	
	private int id;
	private String name;
	private String sal;
	private String dob;
	private String nm;
	private String dept;
	private String file;
	private String age;
	
	public Employee() {
		super();
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
