package com.mvc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mvc.spring.UserService;

public class SpringDAO {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext appContext=new ClassPathXmlApplicationContext("mvc-servlet.xml");
		
		UserService jdbcDAO=(UserService)appContext.getBean("userService");
		System.out.println(jdbcDAO.getUser("rakesh").getAge());
	}

}
