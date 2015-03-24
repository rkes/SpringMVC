package com.mvc.test;

import java.lang.reflect.Method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mvc.spring.User;
import com.mvc.spring.UserService;
import com.mvc.spring.DAO.GetUserDAO;
import com.mvc.spring.DAO.SetUserDAO;
public class SpringDAO {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext appContext=new ClassPathXmlApplicationContext("spring-servlet.xml");
		
		SetUserDAO jdbcDAO=(SetUserDAO)appContext.getBean("setUserDao");
//		System.out.println(jdbcDAO.getUser("rakesh").getAge());
		//User user=jdbcDAO.getUser("rakesh");
		//System.out.println(user.getUserName());
		
		/*User user=new User();
		user.setUserName("Mohan");
		user.setAge("29");
		user.setAddress("MagarPatta");*/
	}

}
