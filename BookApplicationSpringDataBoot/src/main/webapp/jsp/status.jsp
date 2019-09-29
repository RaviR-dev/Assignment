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
<title>Status</title>
</head>
<body>
	<table border="1">
		<tr><td>Status: </td><td>${status}</td></tr>
		<tr><td><button onclick="goBack()">Go Back</button></td></tr>
	</table>
</body>
</html>