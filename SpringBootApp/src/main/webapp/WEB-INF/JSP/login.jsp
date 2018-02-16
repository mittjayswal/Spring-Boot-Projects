<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First Web App</title>
</head>
<body>

	<%-- My first JSP  ${name} --%>
	<font color=red>${errorMessage}</font>
	<pre>
		<form method="post">
			Name: <input type="text" name ="name"/>
			Password: <input type="password" name="password"/>
			<input type="submit" value = "submit">
			
		</form>
	</pre>
</body>
</html>