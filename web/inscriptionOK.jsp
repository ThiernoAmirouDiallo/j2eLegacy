<%--
  Created by IntelliJ IDEA.
  User: tdiallo
  Date: 2019-10-29
  Time: 3:01 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Inscription page</title>
</head>
<body>
<h3>Vous avez été inscrit avec succès</h3>
<p>
    Prénom : ${person.firstname} <br>
    Nom : ${person.lastname} <br>
    Email : ${person.email} <br>
</p>

<a href="index">Retour à la page d'accueil</a>
</body>
</html>
