<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
</head>
<body>
<div>
    <h1>Alunos</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Nome</th>
        </tr>
        <c:forEach var="pessoa" items="${alunos}">
            <tr>
                <td></td>
                <td>${pessoa.nome}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>