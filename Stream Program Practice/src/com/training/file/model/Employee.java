package com.training.file.model;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Employee implements Serializable,Externalizable {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private	int empId;
	private String empName;
	private transient String userName;
	private transient String password;
	
	
	public Employee(int empId, String empName, String userName, String password) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.userName = userName;
		this.password = password;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}


	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
	
	
}
