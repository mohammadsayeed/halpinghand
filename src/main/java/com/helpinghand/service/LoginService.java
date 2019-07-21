package com.helpinghand.service;

import com.helpinghand.domain.User;

public interface LoginService {
	public void login(User user);
	public User createEmployee(String name, String empId);
	

}
