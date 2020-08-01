package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Contact;

public interface ContactRepo extends JpaRepository<Contact, String> {

	List<Contact> findByLanguage(String language);

	List<Contact> findByOrganization(String organization);
	
	@Query("from Contact where organization=CG order by name")
	List<Contact> findByOrganizationSorted(String organization);


}
