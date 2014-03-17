<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  	<form action="user/login.action" method="post">
	<table align="center">		
		<tr>
			<th colspan="2">用户登录</th>
		</tr>
		<tr>
			<td>用户名</td>
			<td><input type="text" name="userName"/></td>
		</tr>
		<tr>
			<td>密码</td>
			<td><input type="password" name="userPassword"/></td>
		</tr>
		<tr>
			<td>用户类型</td>
			<td>
				<SELECT name="userType">
					<option value="1">普通用户</option>
					<option value="2">管理员</option>
				</SELECT>
			</td>
		</tr>
		<tr>
			<td><input type="reset" value="重置" /></td>
			<td><input type="submit" value="提交" /></td>
		</tr>		
	</table>
	</form>
  </body>
</html>
