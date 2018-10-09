package com.smartstart.model;

public class Model {
	private String name, description;
	private Double value;
	private Integer id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getDescription() {
          return description;
	}
   
	public void setDescription(String description) {
		this.description = description;

	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;

	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id= id;

	}

}
