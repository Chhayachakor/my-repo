package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/constructor/NewFile.xml");
		University university= (University)apc.getBean("u");
		System.out.println(university);
		
	}

	}


