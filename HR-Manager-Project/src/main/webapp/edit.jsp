<%@page import="com.nagarro.model.*"%>
<%@page import="com.nagarro.services.HomeServices"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<style>
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
	<%
	     Employee e = (Employee)request.getAttribute("emp");
	     
	%>
	<h2>Edit Employee Details</h2>
	<form class="enter" action="update">
		<div class="input-group input-group-sm mb-3">
			<span style="width: 120px;" class="input-group-text"
				id="inputGroup-sizing-sm">Employee Code</span> <input type="text"
				class="form-control" aria-label="Sizing example input"
				aria-describedby="inputGroup-sizing-sm" name="code" value="<%=e.getEmployeeCode()%>" readonly>
		</div>
		<div class="input-group input-group-sm mb-3">
			<span style="width: 120px;" class="input-group-text"
				id="inputGroup-sizing-sm">Employee Name</span> <input type="text"
				class="form-control" aria-label="Sizing example input"
				aria-describedby="inputGroup-sizing-sm" size="100" name="name" value="<%=e.getEmployeeName()%>" required>
		</div>
		<div class="input-group input-group-sm mb-3">
			<span style="width: 120px;" class="input-group-text"
				id="inputGroup-sizing-sm">Location</span>
			<textarea class="form-control" name="loc"><%=e.getLocation() %></textarea>
		</div>
		<div class="input-group input-group-sm mb-3">
			<span style="width: 120px;" class="input-group-text"
				id="inputGroup-sizing-sm">Email</span> <input type="email"
				class="form-control" aria-label="Sizing example input"
				aria-describedby="inputGroup-sizing-sm" size="100" name="email" value="<%=e.getEmail()%>">
		</div>
		<div class="input-group input-group-sm mb-3">
			<span style="width: 120px;" class="input-group-text"
				id="inputGroup-sizing-sm">Date Of Birth</span> <input type="text"
				class="form-control" aria-label="Sizing example input"
				aria-describedby="inputGroup-sizing-sm" name="dateofbirth" value="<%=e.getDateofbirth()%>">
		</div>
		<div>
			<button type="submit" class="btn btn-primary form-control-sm">Save</button>
			<button type="submit" class="btn btn-primary form-control-sm">Cancel</button>
		</div>
	</form>
</body>
</html>