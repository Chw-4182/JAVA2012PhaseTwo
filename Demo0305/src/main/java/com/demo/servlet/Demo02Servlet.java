package com.demo.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Demo02Servlet extends HttpServlet {
    ServletContext context = null;

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init初始化方法调用");
        //1.获取Servlet程序的别名<servlet-name>
        System.out.println("别名是" + config.getServletName());
        //2.获取初始化参数init-param
        System.out.println("初始化参数username的值是" + config.getInitParameter("username"));
        System.out.println("初始化参数url的值是" + config.getInitParameter("url"));
        //3.获取ServletContext对象
        context = config.getServletContext();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //ServletContext类的四个作用
        //1.获取web.xml中配置的上下文参数context-param
        //ServletContext对象在整个工程中只有一个，所以不同类中调用getServletContext()方法
        //获取到的对象都是同一个
        String username = context.getInitParameter("username");
        String password = context.getInitParameter("password");
        System.out.println("username:" + username + ",password:" + password);
        //2.获取当前的工程路径，格式:/工程路径
        System.out.println("当前工程路径：" + context.getContextPath());
        //3.获取工程部署后在服务器硬盘上的绝对路径
        System.out.println("工程部署的路径:" + context.getRealPath("/"));
        System.out.println("login.html的路径:" + context.getRealPath("/login.html"));
        //4.像Map一样存取数据
    }
}
