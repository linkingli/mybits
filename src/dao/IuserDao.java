package dao;

import java.sql.SQLException;
import java.util.List;

import domain.user;

public interface IuserDao {
	List<user> findUserDao(String name, int password) throws SQLException;
	user findUseroneDao (String name, String passwd);
}
