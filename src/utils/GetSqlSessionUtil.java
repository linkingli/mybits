package utils;



import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class GetSqlSessionUtil 
{
	public SqlSession getSqlSession()
	{
		InputStream is = null;
		SqlSession ss = null;
	
		try {
			is = Resources.getResourceAsStream("SqlMapConfig.xml");
	
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			
			SqlSessionFactory ssf = ssfb.build(is);
			
			ss = ssf.openSession(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ss;
	}
}
