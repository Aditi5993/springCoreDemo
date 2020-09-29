package com.org;
//bean class or Modelor POJO
public class Employee {
	//attributes
	int eId;
	String eName;
	Address eAddress;
	//methods
	
	public Employee(int eId, String eName, Address eAddress) {
		
		this.eId = eId;
		this.eName = eName;
		this.eAddress = eAddress;
	}
	
	
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eAddress=" + eAddress + "]";
	}


	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("----------Employee Object Constructed--------------");
	}

	//Constructor Injection
	public Employee(Address eAddress) {
		// TODO Auto-generated constructor stub
		this.eAddress = eAddress;
	}


	
	public int geteId() {
		return eId;
	}


	public void seteId(int eId) {
		this.eId = eId;
	}


	public String geteName() {
		return eName;
	}


	public void seteName(String eName) {
		this.eName = eName;
	}


	public Address geteAddress() {
		return eAddress;
	}


	public void seteAddress(Address eAddress) {
		this.eAddress = eAddress;
	}


	public void myInit() {
		
		System.out.println("---------Object Initialised---------");
	}

	public void myDestroy() {
		
		System.out.println("---------Object Destroyed---------");
	}
}
