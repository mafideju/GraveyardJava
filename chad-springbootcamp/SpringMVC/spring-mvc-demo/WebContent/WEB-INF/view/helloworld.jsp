<!DOCTYPE html>

<html>
	<head>
		<title>Hello Java World!!! Processed Data</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/styles.css">
	    <script src="${pageContext.request.contextPath}/resources/js/script.js"></script>
	</head>
	<body class="container">
		<div>
			<h1>Spring Butcher</h1>
		</div>
		<hr>
		<div>
			<p>Dado passado: ${param.studentName}</p>
		</div>
		<div>
			<p>Dado passado via Model: ${result}</p>
		</div>
		<div>
			<p>Dado via @RequestParams: ${gritodois} </p>
		</div>
	</body>
</html>