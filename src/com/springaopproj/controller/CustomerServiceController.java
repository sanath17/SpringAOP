package com.springaopproj.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerServiceController {

	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
				"file:src/com/springaopproj/controller/beans.xml");
		System.out.println("Loading");

		CustomerService cust = (CustomerService) appContext.getBean("customerServiceProxy");
		System.out.println("**********************************");
		cust.getUrl();
		System.out.println("***************************************");
		cust.getName();
		
		try{
			cust.printThrowException();
		}catch(Exception e){
			
		}

	}

}
