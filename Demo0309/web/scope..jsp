<%--
  Created by IntelliJ IDEA.
  User: 13212
  Date: 2021/3/9
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>当前页面为scope</h1>
<% pageContext.setAttribute("key"," pageContext");%>
<%request.setAttribute("key","request"); %>,
<%session.setAttribute("key","session");%>
<% application.setAttribute("key","appliocation");%>
pageContext的值：<%=pageContext.getAttribute("key")%><br>
request的值：<%=request.getAttribute("key")%><br>
session的值：<%=session.getAttribute("key")%><br>
application的值：<%=application.getAttribute("key")%>
<%request.getRequestDispatcher("/scope2.jsp").forward(request,response);%>
</body>
</html>
