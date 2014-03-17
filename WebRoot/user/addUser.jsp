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
<div align="center"><form action="add.action" method="post"> 
	<table align="center"> 
		<tr align="center"> 
			<th colspan="2">用户添加</th> 
		</tr> 
		<tr align="center"> 
			<td>用户名</td> 
			<td><input type="text" name="userName"></td> 
		</tr> 
		<tr align="center"> 
			<td>密码</td> 
			<td><input type="password" name="userPassword"></td> 
		</tr> 
		<tr align="center"> 
			<td><input type="reset" value="重置"></td> 
			<td><input type="submit" value="提交"></td> 
		</tr> 
	</table> 
</form></div>
</body>
</html>