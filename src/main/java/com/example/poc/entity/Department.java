package com.example.poc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Department {

	
	
	@Id
	private Long id;
	@Column(name="depname")
	private String depName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", depName=" + depName + "]";
	}
	
	
	
}
