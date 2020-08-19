<%-- 
    Document   : Confirmation
    Created on : Jul 30, 2020, 4:57:22 PM
    Author     : shameen karunanayake
--%>
<%@page import="Beans.OrderBean"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2> your order details are as below</h2>
        <% OrderBean orderBean =(OrderBean) session.getAttribute("order");%>
        Name:<%=orderBean.getName()%> <br>
        Address:<%=orderBean.getAddress()%> <br>
        Pizza Type:<%=orderBean.getFlavour()%> <br>
        Pizza Size:<%=orderBean.getSize()%> <br>
        Quantity:<%=orderBean.getQuantity()%> <br>
        Amount:<%=orderBean.calculateAmount()%> <br>
       
        



    </body>
</html>
