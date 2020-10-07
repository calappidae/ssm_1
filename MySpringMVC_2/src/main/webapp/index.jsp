<%--
  Created by IntelliJ IDEA.
  User: wanyuan
  Date: 2020/10/7
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p><a href="account/findAll">findAll</a></p>
    <hr/>
    <form action="account/saveAccount" method="post">
        <p>name:<input type="text" name="name"></p>
        <p>money:<input type="text" name="money"></p>
        <input type="submit" value="submit"/>
    </form>
</body>
</html>
