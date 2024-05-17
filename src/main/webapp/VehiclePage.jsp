<%@ page import="com.youssef_ayman.prototypedesignpattern.Models.Car" %>
<%@ page import="com.youssef_ayman.prototypedesignpattern.Models.Truck" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Vehicle Registry</title>
</head>
<body>
<h1><%= "Vehicle Servlet Prototype Pattern" %></h1>
<br/>
<ul>
    <%Car car =(Car) request.getAttribute("car");%>
    <%Truck truck =(Truck) request.getAttribute("truck");%>
    <li>
        <h2>Truck Model: <%=truck.getModel()%></h2>
        <h3>Truck Cargo Capacity: <%=truck.getCargoCapacity()%></h3>
    </li>
    <br/>
    <li>
        <h2>Car Model: <%=car.getModel()%></h2>
        <h3>Car Seats: <%=car.getSeats()%></h3>
    </li>
</ul>
</body>
</html>