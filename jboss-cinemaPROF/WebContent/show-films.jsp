<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cinema</title>
</head>
<body>
 <fmt:setLocale value = "fr_FR"/>
<h2>${titre }</h2>
<table>
	<tr><th>Titre</th><th>Prix HT</th></tr>
	<c:forEach items="${films }" var="film">
		<tr><td>${film.titre }</td><td><fmt:formatNumber value = "${film.prixHT}" type = "currency"/></td>
	</c:forEach>
</table>
</body>
</html>