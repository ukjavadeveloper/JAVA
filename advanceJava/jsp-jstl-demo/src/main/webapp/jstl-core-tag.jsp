<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j" %>
<%
	int a =37;
	out.print("Square : " + (a*a));
	
	int i=10;
	if(i>=10){
		out.print("<h4>hello</h4>");
	}
	
	for(int r=1; r<=10; r++){
		out.print(r + "<br>");
	}
%>
<%
	String code ="201";
	switch(code){
		case "201" : 
			out.print("<h4 style='color:green'>Data save successfully, Please signin</h4>");
			break;
		case "401":
			out.print("<h4 style='color:red;'>Your session is expire... Please login again.</h4>");
			break;	
		case "403" :
			out.print("<h4 style='color:red'>invalid Login Details</h4>");
			break;
		case "500" : 
			out.print("<h4 style='color:red'>Somthing went wrong,try after some time</h4>");
			break;
	}			
%>
<%
	String skills[] = {"Core Java", "Jsp", "Servlet", "HTML", "CSS", "JS"};
	for(String s : skills){
		out.print(s + "<br>");
	}
%>
<h3>=========================JSTL===============================</h3>
<j:set var="a" value="21"></j:set><!--variable declaration -->
<j:out value="square = ${a*a}"></j:out>

<j:if test="${a>10}">
	<h4>hello</h4>
</j:if>

<j:forEach var="i" begin="1" end="10" step="1">
	<j:out value="${i}"></j:out>
	<br>
</j:forEach>
<j:set var="msgcode" value="500"></j:set>
<j:choose>
	<j:when test="${msgcode eq '201'}">
		<h4 style='color:green'>Data save successfully, Please signin</h4>
	</j:when>
	<j:when test="${msgcode eq '401'}">
		<h4 style='color:red;'>Your session is expire... Please login again.</h4>
	</j:when>
	<j:when test="${msgcode eq '403'}">
		<h4 style='color:red'>invalid Login Details</h4>
	</j:when>
	<j:when test="${msgcode eq '500'}">
		<h4 style='color:red'>Somthing went wrong,try after some time</h4>
	</j:when>
	<j:otherwise>
		<h4>No Cases Matched</h4>
	</j:otherwise>
</j:choose>

<j:set var="skills" value="Core Java, Jsp, Servlet,HTML,CSS, JS"></j:set>
<j:forEach var="s" items="${skills}">
	<j:out value="${s}"></j:out>
	<br>
</j:forEach>
