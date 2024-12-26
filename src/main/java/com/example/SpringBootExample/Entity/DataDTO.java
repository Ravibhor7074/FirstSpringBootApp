package com.example.SpringBootExample.Entity;

import java.io.Serializable;
import java.util.List;

public class DataDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  String id;
	private String name;
	public Data data;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public DataDTO(String id, String name, Data data) {
		super();
		this.id = id;
		this.name = name;
		this.data = data;
	}
	
	public DataDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DataDTO [id=" + id + ", name=" + name + ", data=" + data + "]";
	}
		 
	
}
