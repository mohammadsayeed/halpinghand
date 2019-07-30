package com.helpinghand.helpinghand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.helpinghand.domain.User;
import com.helpinghand.service.LoginService;

@CrossOrigin
@RestController
public class HelpingHandController {
	/*HelpingHandController()
	{
		System.out.println("ok................");
	}*/
	
@Autowired
LoginService loginService;	


	//@PostMapping( path="/login",produces="application/json")
@PostMapping("/login")
	public void register(@RequestBody User user)
	{
		System.out.println("------------------");
		System.out.println("============"+user);
		System.out.println(user.getUserName());
		System.out.println(user.getUserPassword());
		System.out.println("i am in login");
		loginService.login(user);
	}
	/*
	@PostMapping("/login")
	public String login(@RequestBody User user)
	{
		System.out.println("i am in get login");
		return "helloooo";
	}*/

@GetMapping("/ok")
public void m1()
{
	System.out.println("--------------------------");
}

@GetMapping("/logout")
public String getLogout()
{
	
	System.out.println("--------------------------");
	return "i am logedout";
}

}
