<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>
<script>
function goBack() {
  window.history.back();
}
</script>
<title>Add Book</title>
</head>
<body>
	<form:form name="addbookform" method="post" modelAttribute="book" action="addbook">
		<table border="1">
			<tr><td>Id: </td><td> <form:input path="bookId"/></td></tr>
			<tr><td>Title: </td><td><form:input path="title"/></td></tr>
			<tr><td>Price: </td><td><form:input path="price" /></td></tr>
			<tr><td>Volume: </td><td><form:input path="volume" /></td></tr>
			<tr><td>Publish Date(yyyy-mm-dd): </td><td><form:input path="publishDate"/></td></tr>
			<tr><td><input type="submit" value="Add"/></td>
				<td><button onclick="goBack()">Go Back</button></td></tr>
		</table>
	</form:form>
</body>
</html>