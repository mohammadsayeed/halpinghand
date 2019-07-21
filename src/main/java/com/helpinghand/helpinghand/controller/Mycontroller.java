package com.helpinghand.helpinghand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.helpinghand.domain.Country;

@RestController
public class Mycontroller {

	@RequestMapping("/lol")
	public String main()
	{
		System.out.println("n.............................");
		return "i am running well ";
	}
	//@Autowired
	
	
	@GetMapping("/contries")
	public String getCountryDetails()
	{
		RestTemplate rest = new RestTemplate();
		ResponseEntity<Country> sr= rest.getForEntity("https://restcountries.eu/rest/v2/name/china?fullText=true", Country.class);
		String nm = sr.getBody().getName();
		System.out.println("country ="+nm);
		return null;
	}
}
