<%--
  Created by IntelliJ IDEA.
  User: s
  Date: 2020/9/8
  Time: 19:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>查询所有</h4>
<c:forEach items="${list}" var="account">
    ${account.name}<br>
    ${account}<br>
</c:forEach>

</body>
</html>
