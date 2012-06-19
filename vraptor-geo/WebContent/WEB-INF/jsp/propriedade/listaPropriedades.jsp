<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Propriedades</title>
</head>
<body>
	<h3>Lista de propriedades....</h3>
	
	<a href="<c:url value='/propriedades/cadastrar/'/>">Adicionar uma nova</a>
	
	<table border="1" style="width: 60%;">
		<tr>
			<th>ID</th>
			<th>Nome</th>
			<th>Localização</th>
		</tr>
		<c:forEach var="p" items="${propriedades}">
			<tr>
				<td>
					${p.id}
				</td>
				<td>
					${p.nome}
				</td>
				<td>
					${p.localizacao.x}/${p.localizacao.y}
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>