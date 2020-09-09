<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"%>


<html>
<body>
<h2>Hello World!</h2>
<a href="account/findAll">查询所有</a>


<h2>添加账户</h2>
<form action="account/save">
    姓名: <input type="text" name="name"><br>
    金额:  <input type="text" name="money"></input>

    <input type="submit" value="提交">
</form>
</body>
</html>
