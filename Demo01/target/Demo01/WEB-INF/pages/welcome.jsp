<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/12/23
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
// 获得本项目的地址(例如: http://localhost:8080/MyApp/)赋值给basePath变量
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
// 将 "项目路径basePath" 放入pageContext中，待以后用EL表达式读出。
  pageContext.setAttribute("basePath",basePath);
%>
<html>
<head>
  <title>Title</title>
</head>
<body>
<p>Welcome ,</p>
<p> ${user.getUsername()} 用户</p>
<p> 你的密码是:${user.getPassword()}</p>
</body>
</html>