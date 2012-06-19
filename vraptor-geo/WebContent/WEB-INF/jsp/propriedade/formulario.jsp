<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Cadastro de propriedades</title>
</head>
<body>
	<form method="post" action="<c:url value='/propriedades/salvar/'/>">
		Nome: <input type="text" name="propriedade.nome"/>
		<br/>
		X: <input type="text" name="propriedade.x"/>
		<br/>
		Y: <input type="text" name="propriedade.y"/>
		<br/>
		<br/>
		<input type="submit" value="Salvar"/>
	</form>
</body>
</html>