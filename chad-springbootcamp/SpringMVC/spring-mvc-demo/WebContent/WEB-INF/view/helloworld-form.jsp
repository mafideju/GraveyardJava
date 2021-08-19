<!DOCTYPE html>

<html>
	<head>
		<title>Hello Java World!!! Form Lesson</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/styles.css">
	</head>
	<body class="container">
		<div>
			<h1>Spring Butcher</h1>
		</div>
		<hr>
		<form action="processFormV2V3" method="GET">
			<input type="text" name="studentName" placeholder="Qual é o seu nome?" required />
			<input type="submit" />
		</form>
	</body>
</html>