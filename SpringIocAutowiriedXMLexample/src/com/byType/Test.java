package com.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext apc = new ClassPathXmlApplicationContext("NewFile1.xml");
	Student student= apc.getBean("u",Student.class);
	System.out.println(student);
}
}
