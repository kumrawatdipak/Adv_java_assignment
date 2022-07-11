<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="CalculateScoreServlet">
<%
Question question = (Question) session.getAttribute("currentQs");
%>

<h3>Q. <%= question.getQuestion() %></h3>

<%
	List<Option> options = question.getOptions();
	for(int i=0; i<options.size(); i++) {
		Option option = options.get(i);
%>	
		<div>
		<input type="radio" name="op" value="<%= i %>" />
		<%= option.getOption() %>
	   </div>
<%
}
%>
<br />
<button type="submit">Next</button>
</form>

<button type="submit">Next</button>
</body>
</html>