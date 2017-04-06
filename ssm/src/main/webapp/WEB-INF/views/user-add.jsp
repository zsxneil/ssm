<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户新增页面</title>
</head>
<body>
	<br>
	<div style="margin:auto">
		<form action="user/save" method="post">
			<table>
				<tr>
					<th>用户名</th>
					<td>
						<input type="text" name="username">
					</td>
				</tr>
				<tr>
					<th>性别</th>
					<td>
						<select name="sex">
							<option value="1">男</option>
							<option value="0">女</option>
						</select>
					</td>
				</tr>
				<tr>
					<th>地址</th>
					<td>
						<input type="text" name="address">
					</td>
				</tr>
				<tr>
					<th colspan="1"></th>
					<td>
						<input type="submit" value="提交" >
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>