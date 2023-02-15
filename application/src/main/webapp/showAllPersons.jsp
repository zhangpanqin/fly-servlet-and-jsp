<%@page import="com.mflyyou.service.Person" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>展示用户列表</title>
</head>
<body>
<h1>展示用户列表</h1>
<jsp:useBean id="storage" class="com.mflyyou.service.StorageService" scope="application"/>
<%
    for (Person person : storage.getAllPersons()) {
        out.println("<p>First name: " + person.getFirstName() + "; Year of birth: " + person.getYob() + "</p>");
    }
%>
<p>
    <a href="register.jsp">Add another person</a>
</p>

</body>
</html>