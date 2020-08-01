package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Contact {
	
	@Id
	private String name;
	private String language;
	private String organization;
	
	@OneToMany(mappedBy = "contact")
	private List<PhoneNumber> phoneNumber;
	


	@OneToMany(mappedBy = "contact")
	private List<Address> address;
	
	public Contact(String name, String language, String organization) {
		super();
		this.name = name;
		this.language = language;
		this.organization = organization;
	}

	
	public Contact() {
		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public List<PhoneNumber> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<PhoneNumber> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Contact [name=" + name + ", language=" + language + ", organization=" + organization + "]";
	}
	
}