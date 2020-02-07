package com.chapter2.activity1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanWiring 
{
	 public static void main(String[] args)
	 {
		 ApplicationContext ac=new ClassPathXmlApplicationContext("Spring-Config2.xml");
         Customer cust=(Customer)ac.getBean("CustomerBean");
         System.out.println("The Values are:");
         System.out.println(cust.getFirstName());  
         System.out.println(cust.getMiddleName()); 
         System.out.println(cust.getLastName());   
	 }
}