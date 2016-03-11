<%--
  Created by IntelliJ IDEA.
  User: Temo
  Date: 3/11/2016
  Time: 5:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Handler Page</title>
</head>
<body>
<jsp:useBean id="user" class="beans.User" scope="session"/>
<jsp:setProperty name="user" property="*"/>

User name: <%= user.getUser() %>
Password: <%= user.getPassword() %>
</body>
</html>
