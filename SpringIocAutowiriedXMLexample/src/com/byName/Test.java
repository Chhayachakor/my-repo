package com.byName;

import org.springframework.cache.interceptor.CacheableOperation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("NewFile.xml");
		Person person =apc.getBean("p",Person.class);
				System.out.println(person);
	}

}
