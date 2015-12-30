<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Manager Home</title>
    </head>
    <body>
        <div align="center">
            <h1>Contact List</h1>
            <h3><a href="/newContact">New Contact</a></h3>
            <table border="1">
                <th>Player ID</th>
                <th>Player Name</th>
                <th>x</th>
                <th>x</th>
                <th>x</th>
                <th>x</th>

                <c:forEach var="player" items="${playerlist}" varStatus="status">
                    <tr>
                        <td>${status.index + 1}</td>
                        <td>${player.playerId}</td>
                        <td>${player.PlayerName}</td>
                        <td>${contact.address}</td>
                        <td>${contact.telephone}</td>
                        <td>
                            <a href="/editContact?id=${player.playerid}">Edit</a>
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            <a href="/deleteContact?id=${player.playerid}">Delete</a>
                        </td>

                    </tr>
                </c:forEach>             
            </table>
        </div>
    </body>
</html>