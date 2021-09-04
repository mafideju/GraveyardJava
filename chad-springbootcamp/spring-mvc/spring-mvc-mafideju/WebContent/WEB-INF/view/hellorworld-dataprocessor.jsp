<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
			
			<div class="results" style="display: inline">
				<h3 style="display: inline">Nome do Estudante: </h3>
				<h2 style="display: inline">${param.studentName}</h2>
			</div>
			
			<div class="results">
				<h2>${result}</h2>
			</div>
			
		</main>
	</body>
</html>