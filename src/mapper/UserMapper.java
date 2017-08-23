package mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


import domain.user;

public interface UserMapper 
{
	@Select("select * from user where userName =  #{user.userName}  and	 userpassWd = #{user.userPasswd} ")
	user findUseroneDao(@Param("user") user user);
	

	
}
