
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> --%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>


<%-- <sql:query var="rs" dataSource="jdbc/spring"> --%>
<!-- select id, name, email, text from offers -->
<%-- </sql:query> --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- 	Hi there! -->
<%-- 	<c:out value="${name}"></c:out> --%>
<!-- 	</p> -->
<!-- 	<h2>Results</h2> -->

<%-- 	<c:forEach var="row" items="${rs.rows}"> --%>
<!--     <p> -->
<%--     name ${row.name}<br /> --%>
<%--     email ${row.email}<br /> --%>
<%--     text ${row.text}<br /> --%>
<!--     </p> -->
<%-- 	</c:forEach> --%>
Hi there!
<p><a href="${pageContext.request.contextPath}/offers">Show current offers</a> </p>
<p><a href="${pageContext.request.contextPath}/createoffer">Create new offer</a> </p>
<p><a href="${pageContext.request.contextPath}/test">TEST</a> </p>

</body>
</html>
