<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="loginServlet" method="get">
	<table>
		<tr>
			<td>
				<label>Usuario:</label>
			</td>
			<td>
				<input type="text" id="usuario">
			</td>
		</tr>
		<tr>
			<td>
				<label>Contraseña:</label>
			</td>
			<td>
				<input type="password" id="contrasena">
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="Aceptar">
			</td>
		</tr>
	</table>	
</form>
</body>
</html>