<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First Web App</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
</head>
<body>
	<div class=container>
	<table class="table">
		<thead>
			<th>Description</th>
			<th>Target Date</th>
			<th>Is it done?</th>
			<th></th>
			<th></th>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
			<tr>
				<td>${todo.desc}</td>
				<td>${todo.targetDate}</td>
				<td>${todo.isDone}</td>
				<td><a type="button" class="btn btn-success" href="/update-todo?id=${todo.id}" }>UPdate</a></td>
				<td><a type="button" class="btn btn-warning" href="/delete-todo?id=${todo.id}" }>Delete</a></td>
 			</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	
	Your name is : ${name}
	<br>
	<a href="/add-todo">Click here</a> to add TODO
	
	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>