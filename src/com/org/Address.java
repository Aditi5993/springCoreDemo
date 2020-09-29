package com.org;

public class Address {
 String city, state, zipcode;

 @Override
public String toString() {
	return "Address [city=" + city + ", State=" + state + ", zipcode=" + zipcode + "]";
}
public Address() {
	 
	 
 }
public Address(String city, String state, String zipcode) {
	//super();
	this.city = city;
	this.state = state;
	this.zipcode = zipcode;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}


}

