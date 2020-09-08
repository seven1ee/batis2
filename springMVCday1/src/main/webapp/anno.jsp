<%--
  Created by IntelliJ IDEA.
  User: s
  Date: 2020/9/8
  Time: 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/anno/testRequsetParam?username=haha">testRequsetParam</a>


<form action="/anno/testRequsetBody" method="post">
    用户姓名: <input type="text" name="name"><br>
    用户年龄: <input type="text" name="age"><br>
    <input type="submit" value="提交">

</form>

<a href="/anno/testPathVariable/3">testPathVariable</a>

</body>
</html>
