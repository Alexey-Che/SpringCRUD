<%--
  Created by IntelliJ IDEA.
  User: lexa
  Date: 23.07.2021
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
<%@page import="somePackage.Cart" %>
<% Cart cart = (Cart) session.getAttribute("cart"); %>
    <p><%= cart.getName()%>
</p>
    <p><%= cart.getQuantity() %>
</p>

</body>
</html>
