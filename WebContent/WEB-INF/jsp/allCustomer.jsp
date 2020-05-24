<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<script type="text/javascript" src="js/jquery-1.11.3.js"></script>
<meta charset=UTF-8">
<title>用户列表</title>

</head>
<body>
	<h6>
		<a href="<%=basePath%>toAddCustomer">添加用户</a>
	</h6>
	<table border="1">
		<tbody>
			<tr>
				<th>编号</th>
				<th>名称</th>
				<th>职业</th>
				<th>电话</th>
				<th>操作</th>
			</tr>
			<c:if test="${!empty student }">
				<c:forEach items="${student}" var="customer">
					<tr>
						<td>${customer.id }</td>
						<td>${customer.name }</td>
						<td>${customer.phone }</td>
						<td>${customer.age }</td>
						<td>${customer.address }</td>
						<td><a href="<%=basePath%>findCustomerById?id=${customer.id}">编辑</a>
							<a href="<%=basePath%>deleteCustomer?id=${customer.id }">删除</a></td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
</body>
</html>