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
	<table align="center" border="1">
		<s:if test="list == null">
			<tr>
				<td><font color=red>没有记录</font></td>
			</tr>
		</s:if>
		<s:else>
			<tr>
				<td colspan="3">所有用户</td>
			</tr>
			<tr>
				<th>ID</th>
				<th>用户名</th>
				<th>密码</th>
			</tr>
			<s:iterator value="list" id="user">
				<tr>
					<td><s:property value="#user.getUserID()"/></td>
					<td><s:property value="#user.getUserName()"/></td>
					<td><s:property value="#user.getUserPassword()"/></td>
				</tr>
			</s:iterator>
		</s:else>
	</table>
</body>
</html>