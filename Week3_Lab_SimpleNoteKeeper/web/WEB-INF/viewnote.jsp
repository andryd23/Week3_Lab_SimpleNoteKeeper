<%-- 
    Document   : viewnote
    Created on : Oct 2, 2020, 11:04:39 PM
    Author     : 832465
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <h3>Title:</h3>
        <p>${title}</p>
        <h3>Content:</h3>
        <p>${content}</p>
        <br>
        <br>
        <a href="note?edit">Edit the file:</a>
    </body>
</html>
