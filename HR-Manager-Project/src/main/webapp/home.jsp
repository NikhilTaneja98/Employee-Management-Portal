<%@page import="com.nagarro.controllers.LoginController"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="com.nagarro.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">
<style type="text/css">
.enter {
	width: 400px;
	height: 300px;
	top: 200px;
	margin: auto;
	align-content: center;
}

#input {
	width: 180px;
}
</style>
</head>
<body>
<% String u = LoginController.user; %>
	<h2>Employee Management</h2>
	<h4 style="text-align:right;padding-right:20px;">
		Welcome
		<%=u%>!
		<a href="login.jsp"><img alt="" width="25px" height="25px"
			src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSNIm87sCGNKXfp5Jz7S2R28JDRyzXCveXNxw&usqp=CAU"></a>
	</h4>
	<form action="entry.jsp" style="padding-left:10px;">
		<button type="submit" class="btn btn-primary form-control-sm">Upload
			Employee Details</button>
		<button type="submit" formaction="report" class="btn btn-primary form-control-sm">Download
			Employee Details</button>
		<br>
		<br>
	</form>
	<p>Employee Listings</p>
	<table border=1>
		<tr>
			<th width="170px">Employee Code</th>
			<th width="250px">Employee Name</th>
			<th width="350px">Location</th>
			<th width="200px">Email</th>
			<th width="180px">Date Of Birth</th>
			<th width="130px">Action</th>
		</tr>
		<%
			if (request.getAttribute("list") != null) {
				List<Employee> al = (List<Employee>) request.getAttribute("list");
				for (Employee e : al) {
		%>
		<tr>
			<td><%=e.getEmployeeCode()%></td>
			<td><%=e.getEmployeeName()%></td>
			<td><%=e.getLocation()%></td>
			<td><%=e.getEmail()%></td>
			<td><%=e.getDateofbirth()%></td>
			<td><form action="edit">
					<button type="submit" class="btn btn-primary form-control-sm">Edit</button>
					<input type="hidden" name="idtodel"
						value="<%=e.getEmployeeCode()%>">
				</form></td>
		</tr>

		<%
			}
			}
		%>

	</table>
</body>
</html>