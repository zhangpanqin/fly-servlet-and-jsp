<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户注册成功，用户信息</title>
</head>
<body>
<jsp:useBean id="person" class="com.mflyyou.service.Person"/>
<jsp:setProperty name="person" property="*"/>
<jsp:useBean id="storage" class="com.mflyyou.service.StorageService" scope="application"/>

<%
    storage.add(person);
%>
<h1>用户注册成功，用户信息</h1>
<p>Following person has been added to storage: </p>
<p>First name: <%=person.getFirstName()%>
</p>
<p>Year of birth:
    <jsp:getProperty name="person" property="yob"></jsp:getProperty>
</p>
<p>
    <a href="showAllPersons.jsp">Show all persons</a>
</p>
</body>
</html>