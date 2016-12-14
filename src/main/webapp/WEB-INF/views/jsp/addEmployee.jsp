<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>Spring MVC example -- Add Employee</title>
</head>
<body>
	<form:form action="/addEmployee" method="post" modelAttribute="employeeForm">
		<form:input path="id" />
		<form:input path="name" />
		<form:input path="city" />
		<button type="submit">Add</button>
	</form:form>
</body>
</html>