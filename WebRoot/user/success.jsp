<%@ page language="java" 
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>用户ID</td>
			<td><s:property value="#session.user.userID" /></td>
		</tr>
		<tr>
			<td>用户名</td>
			<td><s:property value="#session.user.userName" /></td>
		</tr>
		<tr>
			<td>密码</td>
			<td><s:property value="#session.user.userPassword" /></s></td>
		</tr>
	</table>
	<table>
		<tr>			
			<td><a href="addUser.jsp">添加</a></td>
			<td><a href="delete.action">删除</a></td>
			<td><a href="modifyUser.jsp">修改</a></td>
			<td><a href="list.action">列举</a></td>
		</tr>
	</table>
</body>
</html>