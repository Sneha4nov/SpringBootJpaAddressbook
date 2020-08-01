package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class PhoneNumber {
	
	
	private String label;
	private String phoneNumber;
	
	@ManyToOne
	@JoinColumn(name="name", referencedColumnName ="name")
	private Contact contact;
	
	public PhoneNumber(String label, String phoneNumber)throws Exception {
		super();
		this.label = label;
		this.phoneNumber = phoneNumber;
	}
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "PhoneNumber [label=" + label + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
}
