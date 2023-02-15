package com.mflyyou.servlet;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serial;

@WebServlet(name = "helloWorldServlet", urlPatterns = {"/hello"})
public class HelloWorldServlet extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html><body><h2>Hello World! Today is " + new java.util.Date() + "</h2></body></html>");
        } catch (IOException exception) {
            response.setStatus(500);
        }
    }
}
