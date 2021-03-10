package com.demo.servlet;

import com.demo.bean.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "StudentServlet",urlPatterns = "/demo05.do")
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> students = new ArrayList<Student>();
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

        request.setAttribute("students",students);
        request.getRequestDispatcher("/demo05.jsp").forward(request,response);
    }
}
