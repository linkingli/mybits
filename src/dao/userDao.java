package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.ibatis.session.SqlSession;

import domain.user;
import mapper.UserMapper;
import utils.DataSourceUtils;
import utils.GetSqlSessionUtil;

public class userDao implements IuserDao {

//通过连接池与数据库通信
	public List<user> findUserDao(String name, int password) throws SQLException {
		
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from user where userName = ?  and	 userpassWd = ?";
		
		return qr.query(sql, new BeanListHandler<>(user.class), name,password);
	}
	
	//使用mybits
	private SqlSession ssone=new  GetSqlSessionUtil().getSqlSession();
	private UserMapper umone=ssone.getMapper(UserMapper.class);
	public user findUseroneDao (String name, String passwd) {
		
		user u=new user();
		u.setUserName(name);
		u.setUserPasswd(passwd);
		return umone.findUseroneDao(u);
		
	}

}
