package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	
private String label;
private String address;

@ManyToOne
@JoinColumn(name="name", referencedColumnName ="name")
private Contact contact;

public Address(String label, String address)throws Exception {
	super();
	this.label = label;
	this.address = address;
}

public String getLabel() {
	return label;
}

public void setLabel(String label) {
	this.label = label;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

@Override
public String toString() {
	return "Address [label=" + label + ", address=" + address + "]";
}


}
