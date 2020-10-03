<%-- 
    Document   : editnote
    Created on : Oct 2, 2020, 11:04:27 PM
    Author     : 832465
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form method="POST" action="note">
        <h3>Title:</h3>
        <input type="text" name="editT" value="${title}">
        <h3>Contents:</h3>
        <textarea name="contentE" name="editC">${content}"</textarea>
        <br>
        <input type="submit" value="Save File" nmae="submit">
        </form>
    </body>
</html>
