<%@ page import="vn.edu.iuh.fit.models.Candidate" %>
<%@ page import="vn.edu.iuh.fit.models.Experience" %><%--
  Created by IntelliJ IDEA.
  User: Leon
  Date: 10/27/2023
  Time: 8:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    Candidate candidate = (Candidate) request.getAttribute("candidate");

%>
<body>
<h1><%=candidate.getId()%></h1>
<h1><%=candidate.getPhone()%></h1>
<h1><%=candidate.getEmail()%></h1>
<h1><%=candidate.getFullName()%></h1>
<%
    for (Experience experience: candidate.getExperiences()){%>
            <p><%=experience%></p>
    <%}%>
</body>
</html>
