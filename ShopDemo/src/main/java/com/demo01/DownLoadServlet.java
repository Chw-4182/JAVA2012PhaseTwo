package com.demo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "DownLoadServlet", urlPatterns = "/download.do")
public class DownLoadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             //获取响应对象的字节输出流
        OutputStream outputStream = response.getOutputStream();
        //用来表示传送给浏览器的文件
        File file=new File("E:\\11111.jpg");
        //设置响应头   告诉浏览器要下载的文件
        response.setHeader("content-disposition","attachment;fileName="+"110.png");
        InputStream inputStream = new FileInputStream(file);
        byte [] bytes = new byte[1024];
        int length=0;
        while((length=inputStream.read(bytes))!=-1){
            outputStream.write(bytes);
            outputStream.flush();
        }
        outputStream.close();
        inputStream.close();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
