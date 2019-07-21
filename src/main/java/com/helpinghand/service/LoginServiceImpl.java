package com.helpinghand.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.helpinghand.domain.User;
import com.helpinghand.entity.UserEntity;
import com.helpinghand.repository.UserRepo;
@Service
public class LoginServiceImpl implements LoginService{
		private static Logger LOGGER =Logger.getLogger(LoginServiceImpl.class.getName());

	@Autowired
	UserRepo rep;
	
	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		
		UserEntity ent = new UserEntity();
		ent.setUsername(user.getUserName());
		ent.setUserpassword(user.getUserPassword());
		//LOGGER.info("i am in login of service");
		rep.save(ent);
		
	}
	@Override
	public User createEmployee(String name, String empId) {

		System.out.println(" i am in createmployeee");
		User emp = new User();
		emp.setUserName(name);
		emp.setUserPassword(empId);
		return emp;
	}

}
