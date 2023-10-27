<%@ page import="vn.edu.iuh.fit.respository.CandidateRespository" %>
<%@ page import="java.util.List" %>
<%@ page import="vn.edu.iuh.fit.models.Candidate" %><%--
  Created by IntelliJ IDEA.
  User: Leon
  Date: 10/27/2023
  Time: 8:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>candidate</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
            crossorigin="anonymous">
    <script
            src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
            integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
            crossorigin="anonymous"></script>
    <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js"
            integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz"
            crossorigin="anonymous"></script>
</head>
<%
    CandidateRespository candidateRespository = new CandidateRespository();
    List<Candidate> candidates = candidateRespository.getAll();
%>
<body>
<table class="table">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">ten</th>
        <th scope="col">mail</th>
        <th scope="col">phone</th>
    </tr>
    </thead>
    <tbody>
    <%for (Candidate cd:candidates){%>
    <tr>
        <th scope="row"><%=cd.getId()%></th>
        <td><%=cd.getFullName()%></td>
        <td><%=cd.getEmail()%></td>
        <td><%=cd.getPhone()%></td>
        <td><a href=<%="hello-servlet?action="+cd.getId()%>>View</a></td>
    </tr>
    <%}%>

    </tbody>
</table>
</body>
</html>
