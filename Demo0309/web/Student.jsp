<%@ page import="com.demo.bean.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 13212
  Date: 2021/3/9
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <% List<Student> students = new ArrayList<Student>();
     Student student=new Student(1,10,"小1");
     Student student2=new Student(2,11,"小2");
     Student student3=new Student(3,12,"小3");
     Student student4=new Student(4,13,"小4");
     Student student5=new Student(4,13,"小5");
     students.add(student);
     students.add(student2);
     students.add(student3);
     students.add(student4);
     students.add(student5);



 %>

 <table >
     <%for (int i = 0; i <students.size() ; i++) {

     %>
     <tr >
         <td >
             <%= students.get(i).getId()%>
         </td>
         <td>
             <%= students.get(i).getName()%>
         </td>
         <td>
             <%= students.get(i).getAge()%>
         </td>
     </tr>
     <%
     }
     %>

 </table>
</body>
</html>
