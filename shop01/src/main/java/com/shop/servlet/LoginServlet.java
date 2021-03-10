package com.shop.servlet;

import com.shop.dao.impl.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/loginservlet.do")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String username = request.getParameter("username");
      String password = request.getParameter("password");
        System.out.println("username"+username);
        System.out.println("password"+password);
        UserDaoImpl userDao=new UserDaoImpl();
       String loginPassword = userDao.queryUserByUsername(username).getPassword();
        System.out.println("loginPassword"+loginPassword);
     if (loginPassword.equals(password)){
         request.getRequestDispatcher("/pages/user/login_success.html").forward(request,response);
         System.out.println("值相同");
     }else{
         System.out.println("值不同");
     }
    }
}
