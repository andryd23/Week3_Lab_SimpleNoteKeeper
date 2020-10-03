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
        <form>
        <p>Title:<p>
            <input type="text" name="title" value="${titleEdit}">
        <p>content:</p>
        <input type="text" name="content" value="${contentEdit}">
        <input type="submit" name="submit" value="Submit File">
         </form>
      
    </body>
</html>
