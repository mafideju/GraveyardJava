<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE>
<html>
	<head>
	    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/styles.css">
		<title>Spring MVC based on Fedora OS</title>
	</head>
	<body class="backdrop">
		<main class="container">
			<div>
				<h1>Spring MVC based on Fedora 33 OS</h1>
				<h5>Student's Registration Form</h5>
			</div>
			
			<hr>
			
			<div class="form">
				<form:form action="studentView" modelAttribute="student">
					<label for="firsName">Nome: 
						<form:input path="firstName" />
						<form:errors path="firstName" class="error" />
					</label>
					
					<label for="lastName">Sobrenome: 
						<form:input path="lastName" />
					</label>
					
					<label for="age">Idade: 
						<form:input path="age" type="number" />
						<form:errors path="age" class="error" />
					</label>
					
					<label for="postalCode">CEP: 
						<form:input path="postalCode" />
						<form:errors path="postalCode" class="error" />
					</label>
					
					<label for="country">País: 
						<form:select path="country">
							<form:options items="${student.countryOptions}" />
						</form:select>
					</label>
					
					<div class="mt16">
						<label for="java">
							<form:radiobutton path="favoriteLanguage" value="Java" id="java" />Java
						</label>
						<label for="c#">
							<form:radiobutton path="favoriteLanguage" value="C#" id="c#" />C#
						</label>
						<label for="javascript">
							<form:radiobutton path="favoriteLanguage" value="Javascript" id="javascript" />JavaScript
						</label>
						<label for="kotlin">
							<form:radiobutton path="favoriteLanguage" value="Kotlin" id="kotlin" />Kotlin
						</label>
					</div>
					
					<div class="mt16">
						<label for="fedora">
							<form:checkbox path="os" value="Fedora" id="fedora" />Fedora
						</label>
						<label for="ubuntu">
							<form:checkbox path="os" value="Ubuntu" id="ubuntu" />Ubuntu
						</label>
						<label for="windows">
							<form:checkbox path="os" value="Windows" id="windows" />Windows
						</label>
						<label for="osx">
							<form:checkbox path="os" value="OSX" id="osx" />OSX
						</label>
					</div>
					
					<div class="mt16">
						<input type="submit" value="Send Data"/>
					</div>
					
					
				</form:form>
			</div>
			
		</main>
	</body>
</html>