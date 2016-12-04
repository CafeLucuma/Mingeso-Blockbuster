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
        <h1>Información de Usuario</h1>
        <form action="./UsuarioServlet" method="POST">
            <table>
                <tr>
                    <td>ID de Usuario</td>
                    <td><input type="text" name="userId" value="${user.userid}"/></td>
                </tr>
                <tr>
                    <td>Nombre de Usuario</td>
                    <td><input type="text" name="userName" value="${user.username}"/></td>
                </tr>
                <tr>
                    <td>Contrasena</td>
                    <td><input type="text" name="password" value="${user.password}"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Add" />
                        <input type="submit" name="action" value="Search" />
                    </td>
                </tr>
            </table>
            
        </form>
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
