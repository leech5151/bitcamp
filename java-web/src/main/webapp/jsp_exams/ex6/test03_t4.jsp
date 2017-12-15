<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>
<h1>jsp:useBean 테스트 2</h1>
type 과 class 구분하기.

<jsp:useBean id="list" type="java.util.ArrayList" class="java.util.ArrayList"/>
<%--
java.util.ArrayList<String>list = pageContext.getAttribute("list");
if (list==null ){
    list = new java.util.ArrayList<String>();
    pageContext.setAttribute("list",list);
}
 --%>
 <p>
 리스트 크기 : <%=list.size() %>
 </p>

</body>
</html>






