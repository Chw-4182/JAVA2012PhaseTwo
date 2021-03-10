<%--
  Created by IntelliJ IDEA.
  User: 13212
  Date: 2021/3/9
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

   for (int i=1;i<=9;i++){
       for (int j=1;j<=i;j++){
           %><%=i%>*<%=j%>=<%=i*j%></h1>
<%
            }

            %>
<br/>
<%
   }

%>

</body>
</html>
