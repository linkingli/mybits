<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎界面</title>
</head>
<body>
<h2>欢迎${userrequest.userName}登录</h2>
<a href="${pageContext.request.contextPath}/findInformation?username=${userrequest.userName}">查询个人信息</a>

<c:if test="${userrequest.roleId ==1}">
<a href="${pageContext.request.contextPath}/teacherFindCourse">查询课程信息</a>
</c:if>

<c:if test="${userrequest.roleId ==2}">
  <a href="${pageContext.request.contextPath}/studentSearch?userid=${userrequest.id}">查看已选课程</a>
</c:if>

<c:if test="${userrequest.roleId ==2}">
  <a href="${pageContext.request.contextPath}/studentChoiceClass?userid=${userrequest.id}">选课</a>
</c:if>

<c:if test="${userrequest.roleId ==1}">
  <a href="${pageContext.request.contextPath}/findStudent">学生信息</a>
</c:if>




</body>
</html>