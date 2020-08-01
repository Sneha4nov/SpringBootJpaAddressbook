package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.example.demo.dao.ContactRepo;
import com.example.demo.model.Contact;

@Controller
public class ContactController {

	@Autowired
	ContactRepo contactRepo;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping("/addA")
	public String addA(Contact c) {

		contactRepo.save(c);
		return "home.jsp";

	}
	
//	@RequestMapping("/retrievedata")
//	@ResponseBody
//	public String retrivecontact() {
//		
//		
//		return contactRepo.findAll().toString();
//
//
//	}
	
	// below After using JPA fetch All data in JSON formate
	
	@RequestMapping("/retrievedata")
	@ResponseBody
	public List<Contact> retrivecontactInJson() {
		
		
		return contactRepo.findAll();


	}
	
	
	@RequestMapping("/retrievedata/Sneha")
	@ResponseBody
	public String retrivecontactbyname() {
		
		// http://localhost:8080/retrievedata/Sneha
		return contactRepo.findById("Sneha").toString();


	}
	
	
//	@RequestMapping("/retrievedata/{name}")
//	@ResponseBody
//	public String retrivecontactbyWildCard(@PathVariable("name") String name) {
//		
//		// http://localhost:8080/retrievedata/AnyName  usingCRUD Repo
//		return contactRepo.findById(name).toString();
//
//
//	}
	
	// Below after using JPARepository instead CRUDRepo
	
	@RequestMapping("/retrievedata/{name}")
	@ResponseBody
	public Optional<Contact> retrivecontactbyWildCardAgain(@PathVariable("name") String name) {
		
		// http://localhost:8080/retrievedata/AnyName
		
		// getting data in JSON Formate
		return contactRepo.findById(name);


	}
	
	

	@RequestMapping("/getA")
	public ModelAndView getA(@RequestParam String name) {
		ModelAndView mv = new ModelAndView("showContact.jsp");
		Contact c = contactRepo.findById(name).orElse(new Contact());
		
		System.out.println(contactRepo.findByLanguage("JAVA"));
		System.out.println(contactRepo.findByOrganization("Microsoft"));
		System.out.println(contactRepo.findByOrganizationSorted("CG"));
		mv.addObject(c);
		return mv;

	}
	
	@RequestMapping("/getOrg")
	public ModelAndView getOrg(@RequestParam String organization) {
		ModelAndView mv = new ModelAndView("showContact.jsp");
		//?????????????????????
		List<Contact> c = contactRepo.findByOrganization(organization);
		
		mv.addObject(c);
		return mv;

	}
	
	
	@RequestMapping("/deleteContact")
	public ModelAndView deleteA(@RequestParam String name){
		
		ModelAndView mv = new ModelAndView("deleteData.jsp");
		Contact c = contactRepo.findById(name).orElse(new Contact());
		contactRepo.delete(c);
		mv.addObject(c);
		return mv;
				
	}
	
	
	
}
