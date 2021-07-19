<%-- 
    Document   : logout
    Created on : Apr 19, 2021, 7:38:03 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <script type = "text/javascript" >
   function preventBack(){window.history.forward();}
    setTimeout("preventBack()", 0);
    window.onunload=function(){null};
    </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            .button {
    text-decoration: none;
    display: block;
    width: 110px;
    height: 25px;
    background: #4E9CAF;
    padding: 10px;
    text-align: center;
    border-radius: 5px;
    color: white;
    font-weight: bold;
    line-height: 25px;
    margin-top: 5px;
    margin-left: 30px;
}
        </style>   
        
    </head>
    <body>
    <center>
        <h1>Successfully Logged Off</h1>
        <%
         response.setHeader("Pragma","no-cache"); 
         response.setHeader("Cache-Control","no-store");
         response.setHeader("Expires","0");
         response.setDateHeader("Expires",-1);
         session.invalidate();
       
        %>
        <a class=button href="index.html">HOME PAGE </a>
    </center>
    </body>
</html>

