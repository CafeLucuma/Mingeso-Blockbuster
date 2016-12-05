<%-- 
    Document   : userinfo
    Created on : Nov 30, 2016, 10:09:48 PM
    Author     : oscar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Information</title>
    </head>
    <body>
        <h1>Login Usuario</h1>
        <div>
            <form action="main" method="post">
                Nombre: <input type="text" name="userName"><br>
                Contraseña: <input type="password" name="password">
                <input type="submit" name="submit" value="submit">
            </form>
        </div>
        <br>
        <table border="1">
            <th>ID</th>
            <th>Nombre</th>
            <th>Contrasena</th>
            <c:forEach items="${allUsuarios}" var="us">
                <tr>
                    <td>${us.userid}</td>
                    <td>${us.username}</td>
                    <td>${us.password}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
