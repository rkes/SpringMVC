package com.mvc.spring.DAO;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.mvc.spring.User;

public class SetUserDAO extends JdbcDaoSupport{
	private final String setUserString="insert into user value (?,?,?)";
	
	public void addUser(){
		this.getJdbcTemplate().update(setUserString, "Mohan","Sohan","Bhindi");
		//System.out.println("In the User"+user);
	}
	
	
}
