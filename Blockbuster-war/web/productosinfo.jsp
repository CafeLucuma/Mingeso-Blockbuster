<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : productosinfo
    Created on : Dec 2, 2016, 8:31:27 PM
    Author     : oscar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <b>Bienvenido, ${sessionScope.welcome.username}</b>
        
        <h1>Productos Disponibles</h1>
        
        <table border="1">
            <th>ID</th>
            <th>Código</th>
            <th>Nombre Película</th>
            <th>Descripción</th>
            <th>Precio</th>
            <th>Foto</th>
            <th>Dispónible en</th>
            <th>Anunciante</th>
            <th>Teléfono Anunciante</th>
            <c:forEach items="${allProductos}" var="p">
                <tr>
                    <td>${p.productid}</td>
                    <td>${p.productcode}</td>
                    <td>${p.productname}</td>
                    <td>${p.productdescription}</td>
                    <td>${p.price}</td>
                    <td>${p.picture}</td>
                    <td>${p.availablecityproduct}</td>
                    <td>${p.advertisername}</td>
                    <td>${p.advertiserphone}</td>
                </tr>
            </c:forEach>
        </table>
        
        
    </body>
</html>
