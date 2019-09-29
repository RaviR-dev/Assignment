<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<script>
function goBack() {
  window.history.back();
}
</script>
<title>Book search result</title>
</head>
<body>
	<table border="1">
		<tr><td>Id: </td><td>${book.bookId}</td></tr>
		<tr><td>Title: </td><td>${book.title}</td></tr>
		<tr><td>Price: </td><td>${book.price}</td></tr>
		<tr><td>Volume: </td><td>${book.volume}</td></tr>
		<tr><td>Publish Date: </td><td>${book.publishDate}</td></tr>
		<tr><td><button onclick="goBack()">Go Back</button></td></tr>
	</table>
</body>
</html>