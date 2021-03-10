<%@ page import="java.util.ArrayList" %>
<%@ page import="com.demo.bean.Student" %><%--
  Created by IntelliJ IDEA.
  User: 13212
  Date: 2021/3/9
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table >
    <% ArrayList<Student>arrayList= (ArrayList) request.getAttribute("students");
        for (int i = 0; i <arrayList.size() ; i++) {

    %>
    <tr >
        <td >
            <%= arrayList.get(i).getId()%>
        </td>
        <td>
            <%= arrayList.get(i).getName()%>
        </td>
        <td>
            <%= arrayList.get(i).getAge()%>
        </td>
    </tr>
    <%
        }
    %>

</table>


</body>
</html>
