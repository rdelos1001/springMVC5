<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ include file="include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title><fmt:message key="title"/></title>
		<style>
			.error{ color:red; }
		</style>
	</head>
	<body>
		<h1><fmt:message key="priceincrease.heading"/></h1>
		<form:form method="post" modelAttribute="priceIncrease">
			<table>
				<tr>
					<td align="right" width="20%">Increase (%):</td>
					<td width="20%">
						<form:input path="percentage"/>
					</td>
					<td width="60%">
						<form:errors path="percentage" cssClass="error"/>
					</td>
				</tr>
			</table>
			<br>
			<input type="submit" value="Execute">
		</form:form>
		<a href="<c:url value='hello.html'/>">Home</a>
	</body>
</html>