package com.demo.servlet;

import com.shop.bean.User;
import com.shop.dao.impl.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegistServlet",urlPatterns = "/registServlet")
public class RegistServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email =request.getParameter("email");
        User user= new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setUsername(username);
        UserDaoImpl userDao= new UserDaoImpl();

        //获取到之后调用添加到数据库的方法 UserService中的添加用户方法

        //假设成功
        request.getRequestDispatcher("/pages/user/regist_success.html").forward(request,response);
        userDao.add(user);
    }
}
