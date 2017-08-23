package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.user;
import service.userService;


public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置字符编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("utf-8");
		
		//获取前台数据
		String name = request.getParameter("username");
		String passwd = request.getParameter("password");
		System.out.println(name);
		System.out.println(passwd);
		
		List<user> userlist=null;
		user usr =null;
		usr=new userService().findUserone(name, passwd);
		System.out.println(usr.getId());
		//调用service处理业务逻辑			
			try {
				
				userlist=new userService().findUser(name,passwd);
				System.out.println(userlist.size());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			user user=userlist.get(0);
			if(null!=user)
			{
				request.setAttribute("userlist", user);
				request.getRequestDispatcher("/sucess.jsp").forward(request, response);
				
			}
			
		
		
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	

	}
}
