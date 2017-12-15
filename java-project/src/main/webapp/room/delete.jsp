<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.domain.Room"%>
<%@page import="java100.app.dao.RoomDao"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>



<!DOCTYPE html>
<html>
<head>
<title>강의실관리</title>
<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
</head>
<body>
<div class='container'>
<jsp:include page="/header.jsp"></jsp:include>
<h1>강의실 삭제 결과</h1>
<%
RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(
        RoomDao.class);
PrintWriter out2 = new PrintWriter(out);
try {
    
    int no = Integer.parseInt(request.getParameter("no"));
    
    if (roomDao.delete(no) > 0) {
        %>
        <p>삭제했습니다.</p>
        <%
    } else {
        %>
        <p>'<%=no %>'의 강의실 정보가 없습니다.</p>
        <%
    }
    
} catch (Exception e) {
    e.printStackTrace(); // for developer
    out.println(e.getMessage()); // for user
}
%>
<p><a href='list.jsp' class='btn btn-primary btn-sm'>목록</a></p>
<jsp:include page="/footer.jsp"></jsp:include>
</div>
<%@ include file="../jslib.txt" %>
</body>
</html>


    
