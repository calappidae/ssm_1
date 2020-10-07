<%--
  Created by IntelliJ IDEA.
  User: wanyuan
  Date: 2020/10/7
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        .head{
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="head">
        <c:forEach items="${requestScope.accoutList}" var="accout">
            <p>${accout.name}___${accout.money}</p>
        </c:forEach>
    </div>
</body>
</html>
