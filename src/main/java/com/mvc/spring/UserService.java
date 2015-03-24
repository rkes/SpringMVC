package com.mvc.spring;

import org.springframework.stereotype.Component;

import com.mvc.spring.DAO.GetUserDAO;
import com.mvc.spring.DAO.SetUserDAO;

@Component
public class UserService {

	
	private GetUserDAO getUserDAO;
	/*private SetUserDAO setUserDAO;*/
	
	public GetUserDAO getGetUserDAO() {
		return getUserDAO;
	}

	public void setGetUserDAO(GetUserDAO getUserDAO) {
		this.getUserDAO = getUserDAO;
	}

	public User getUser(String userName) {
		return(getUserDAO.getUser(userName));		
	}
	
	/*public SetUserDAO getSetUserDAO() {
		return setUserDAO;
	}

	public void setSetUserDAO(SetUserDAO setUserDAO) {
		this.setUserDAO = setUserDAO;
	}

	public void setUser(User user){
		setUserDAO.addUser();
	}
*/
}
