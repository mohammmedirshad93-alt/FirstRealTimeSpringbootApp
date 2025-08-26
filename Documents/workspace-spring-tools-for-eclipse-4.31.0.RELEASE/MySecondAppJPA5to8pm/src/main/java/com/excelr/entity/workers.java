package com.excelr.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class workers {
	
	@Id
	private Integer empId;
	private String worName;
	public workers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public workers(Integer empId, String worName) {
		super();
		this.empId = empId;
		this.worName = worName;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getWorName() {
		return worName;
	}
	public void setWorName(String worName) {
		this.worName = worName;
	}
	@Override
	public String toString() {
		return "workers [empId=" + empId + ", worName=" + worName + "]";
	}
	
	
	
}
