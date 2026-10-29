package com.learning.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.spring.entity.Address;
import com.learning.spring.entity.Employee;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

		// "emp1" bean ko batana hota hai ki konsa bean uthana hai xlm se
		Employee e1 = ioc.getBean("emp1", Employee.class);
		System.out.println(e1);

		Address address = ioc.getBean("add1", Address.class);

		// we can update the address bean as well as employee bean
		e1.setName("testJatin");
		address.setCity("Ludhinaya");
		address.setState("Punjab");
		System.out.println(address);

		System.out.println("Updated address: " + e1);

		// "emp2" bean ko batana hota hai ki konsa bean uthana hai xml se
		Employee e2 = ioc.getBean("emp2", Employee.class);
		System.out.println(e2);

		Address address2 = ioc.getBean("add2", Address.class);
		System.out.println(address2);

	}

}
