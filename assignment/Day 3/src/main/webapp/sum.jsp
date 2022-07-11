<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%! 
 int n1=10,n2=20,sum=0; 
 %>
 
 <%
 sum=n1+n2;
 %>
 
 <%="sum of n1+n2 =" + sum%> 
 
</body>
</html>