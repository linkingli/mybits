package service;

import java.sql.SQLException;
import java.util.List;

import dao.userDao;
import domain.user;

public class userService {

	

	public List<user> findUser(String name, String passwd) throws SQLException 
	{
		int password=Integer.parseInt(passwd);
		return new userDao().findUserDao(name,password);
		
	}

	public user findUserone(String name, String passwd) {
		
		return new userDao().findUseroneDao(name,passwd);
	}
	
	

}
