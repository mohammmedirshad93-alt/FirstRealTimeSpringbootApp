package com.excelr.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Address {
	
	@Id
	private Integer addId;
	private String  City;
	private Integer empId;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(Integer addId, String city, Integer empId) {
		super();
		this.addId = addId;
		City = city;
		this.empId = empId;
	}
	public Integer getAddId() {
		return addId;
	}
	public void setAddId(Integer addId) {
		this.addId = addId;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", City=" + City + ", empId=" + empId + "]";
	}


}
