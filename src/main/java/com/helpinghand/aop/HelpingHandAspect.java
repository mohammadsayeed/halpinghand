package com.helpinghand.aop;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.helpinghand.service.LoginServiceImpl;

@Aspect
@Component
public class HelpingHandAspect {

	 private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
	//@Before(value = "execution(* com.helpinghand.service.LoginServiceImpl.*(..)) and args(name,empId)")
	 @Before(value = "execution(* com.helpinghand.service.LoginServiceImpl.*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
		//logger.info("Before method:" + joinPoint.getSignature());
		System.out.println("Before method:" + joinPoint.getSignature());
		//System.out.println("Before method:" + joinPoint.getSignature());

		//System.out.println("Creating Employee with name - " + name + " and id - " + empId);
	}

	@After(value = "execution(* com.helpinghand.service.LoginServiceImpl.*(..)) and args(name,empId)")
	public void afterAdvice(JoinPoint joinPoint, String name, String empId) {
		logger.info("After method:" + joinPoint.getSignature());
		//System.out.println("After method:" + joinPoint.getSignature());

		//System.out.println("Successfully created Employee with name - " + name + " and id - " + empId);
	}
	
}
