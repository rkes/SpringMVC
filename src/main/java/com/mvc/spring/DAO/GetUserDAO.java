package com.mvc.spring.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.inject.Inject;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.mvc.spring.User;

public class GetUserDAO extends JdbcDaoSupport{
	
	@Inject
	private User user;
	
	private final String getUserQuery="select * from user where userName like ?";
	
	public User getUser(String userName){
	
		return getJdbcTemplate().queryForObject(getUserQuery, new ParameterizedRowMapper<User>() {

		@Override
		public User mapRow(ResultSet paramResultSet, int paramInt)
				throws SQLException {
			user.setUserName(paramResultSet.getString(1));
			user.setAge(paramResultSet.getString(2));
			user.setAddress(paramResultSet.getString(3));
			
			return user;
		}
	},	
			userName);
	
	}
	
	
}
