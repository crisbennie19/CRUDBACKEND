package com.crudbackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class dbEntity {
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	
	long id;
	String name;
	String address;
	public dbEntity() {
	}
	public dbEntity(long id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "dbEntity [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
		

}
