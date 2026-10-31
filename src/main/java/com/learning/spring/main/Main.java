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

	}

}
