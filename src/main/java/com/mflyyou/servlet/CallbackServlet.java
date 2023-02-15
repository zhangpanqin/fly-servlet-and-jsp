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
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "myServletDemo", urlPatterns = {"/web/demo2"})
public class CallbackServlet extends HttpServlet {

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name1");
        String callback = request.getParameter("callback");
        Map ret = new HashMap();
        ret.put("name", "测试");
        String s = JSON.toJSONString(ret);
        s = callback + "(" + s + ")";
        out.print(s);
    }
}
