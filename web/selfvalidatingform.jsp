<%--
  Created by IntelliJ IDEA.
  User: Temo
  Date: 3/11/2016
  Time: 6:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Self Validating Form Page</title>
</head>
<body>
<jsp:useBean id="user1" class="beans.User" scope="session"/>
<jsp:setProperty name="user1" property="*"/>


<form action="selfvalidatingform.jsp" method="post">
    <input type="text" name="email" value="<jsp:getProperty name="user1" property="email"/>" title="User"/><br/>
    <input type="password" name="password" value="<jsp:getProperty name="user1" property="password"/>" title="Password"/><br/>
    <input type="submit" name="submitBtn" value="OK"/>
</form>
</body>
</html>
