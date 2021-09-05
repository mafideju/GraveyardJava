<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE>
<html>
	<head>
	<meta charset="UTF-8">
	    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/styles.css">
		<title>Spring MVC based on Fedora OS</title>
	</head>
	<body class="backdrop">
		<main class="container">
			<div>
				<h1>Spring MVC based on Fedora 33 OS</h1>
			</div>
			
			<hr>
			
			<div class="results">
				<div style="display: flex; align-items: center;">
					<p>Estudante: </p>
					<h2>${student.firstName} ${student.lastName}, ${student.age} anos</h2>
				</div>
				<div style="display: flex; align-items: center;">
					<p>País: </p>
					<h2>${student.country} - ${student.postalCode}</h2>
				</div>
				<div style="display: flex; align-items: center;">
					<p>Programa em: </p>
					<h2>${student.favoriteLanguage}</h2>
				</div>
				
				<div style="display: flex; align-items: center;">
					<p>Sistema Operacional: </p>
					<ul>
						<c:forEach var="os" items="${student.os}">
							<li>${os}</li>
						</c:forEach>
					</ul>
				</div>
			</div>
			
		</main>
	</body>
</html>