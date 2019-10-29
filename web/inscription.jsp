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
<form method="post" action="inscription">
    <input type="hidden" name="actionType" value="add">
    <label for="firstname">Prenom : </label> <input name="firstname" id="firstname" type="input"><br>
    <label for="lastname">Nom : </label> <input name="lastname" id="lastname" type="input"><br>
    <label for="email">Email : </label> <input name="email" id="email" type="input"><br>

    <input type="reset">
    <input type="submit">
</form>

</body>
</html>
