package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Employee")
// @Data
public class Employee implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String ename;
	private String email;
	private int salary;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}

/*
 * SQL> desc Employee; Name Null? Type -----------------------------------------
 * -------- ---------------------------- EID NOT NULL NUMBER(10) ENAME NOT NULL
 * VARCHAR2(15 CHAR) EMAIL NOT NULL VARCHAR2(20 CHAR) SALARY NUMBER(10)
 */