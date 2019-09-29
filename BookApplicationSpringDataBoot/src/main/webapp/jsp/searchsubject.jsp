<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
<script>
function goBack() {
  window.history.back();
}
</script>
<title>Subject search result</title>
</head>
<body>
	<table border="1">
		<tr><td>Id: </td><td>${subject.subjectId} </td></tr>
		<tr><td>Subtitle: </td><td>${subject.subtitle} </td></tr>
		<tr><td>Duration: </td><td>${subject.durationInHours} </td></tr>
		<tr><td>Id: </td><td>${subject.subjectId} </td></tr>
		<tr><td>References:</td>
			<td>
				<table border="1">
					<c:forEach items="${subject.references}" var="b">
						<tr><td>Id: </td><td>${b.bookId}</td></tr>
						<tr><td>Title: </td><td>${b.title}</td></tr>
						<tr><td>Price: </td><td>${b.price}</td></tr>
						<tr><td>Volume: </td><td>${b.volume}</td></tr>
						<tr><td>Publish Date: </td><td>${b.publishDate}</td></tr>
					</c:forEach>
				</table>
			</td>
		</tr>		
		<tr><td><button onclick="goBack()">Go Back</button></td></tr>
	</table>
</body>
</html>