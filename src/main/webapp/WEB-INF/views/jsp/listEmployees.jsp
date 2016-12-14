<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>Spring MVC example -- List Employees</title>
</head>
<body>
	<h1>All Employees</h1>

	<c:choose>
		<c:when test="${empty employees}">
			<div>
				<strong>No employees on record</strong>
			</div>
		</c:when>
		<c:otherwise>
			<div>
				<table class="table table-striped">
					<thead>
						<tr>
							<th>Id</th>
							<th>Name</th>
							<th>City</th>
						</tr>
					</thead>

					<c:forEach var="employee" items="${employees}">
						<tr>
							<td>${employee.id}</td>
							<td>${employee.name}</td>
							<td>${employee.city}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</c:otherwise>
	</c:choose>
	<spring:url value="/addEmployee" var="urlAddEmployee" />
	<div style="margin-top: 30px">
		<a href="${urlAddEmployee}">Add Employee</a>
	</div>
</body>
</html>