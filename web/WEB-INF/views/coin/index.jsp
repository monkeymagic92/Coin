<%--
  Created by IntelliJ IDEA.
  User: Jaee
  Date: 2021-09-09
  Time: 오후 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${list}" var="item">
        <div>${item.i_num}</div>
        <div>${item.title}</div>
    </c:forEach>
    <h1>${name}</h1>
</body>
</html>
