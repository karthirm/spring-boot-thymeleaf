package com.learning.springboot.thymeleafapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import org.springframework.format.annotation.DateTimeFormat;

@Entity
//@Table(name="employee")
public class Employee {
	
	@Id
	private Integer Id;
	private String name;
	private String technology;
	private String updatedBy;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String updatedOn;
	
	public Employee() {
		
	}

	public Employee(Integer id, String name, String technology, String updatedBy, String updatedOn) {
		super();
		Id = id;
		this.name = name;
		this.technology = technology;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", technology=" + technology + ", updatedBy=" + updatedBy
				+ ", updatedOn=" + updatedOn + "]";
	}
	
	
	
	
}
