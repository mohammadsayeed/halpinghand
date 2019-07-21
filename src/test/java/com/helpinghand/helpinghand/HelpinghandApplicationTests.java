package com.helpinghand.helpinghand;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.helpinghand.domain.User;
import com.helpinghand.service.LoginService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelpinghandApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired 
	LoginService loginService;	
	
	@Test
	public void test()
	{
		User user = new User();
		user.setUserName("sona");
		user.setUserPassword("mishra");
		System.out.println("i am in testing");
		loginService.login(user);
		loginService.createEmployee("mona","mona");
		
	}
}
