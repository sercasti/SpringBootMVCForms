package com.springboot.mvc.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Employee {

	@Id
	@NotNull
	@Size(max = 64)
	@Column(name = "id", nullable = false, updatable = false)
	private String id;

	@NotNull
	@Size(max = 64)
	@Column(name = "name", nullable = false)
	private String name;

	@NotNull
	@Size(max = 64)
	@Column(name = "city", nullable = false)
	private String city;

	public Employee() {
	}

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
