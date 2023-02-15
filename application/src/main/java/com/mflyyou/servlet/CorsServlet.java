package com.mflyyou.servlet;


import com.alibaba.fastjson2.JSON;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serial;
import java.util.Map;
import java.util.Optional;

@WebServlet(name = "myServletCorsDemo", urlPatterns = {"/web/cors"})
public class CorsServlet extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setContentType("application/json;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        String name = Optional.ofNullable(request.getParameter("name1")).orElse("默认name1");
        out.print(JSON.toJSONString(Map.of("name", "测试", "name1", name,"type","cors")));
    }
}
