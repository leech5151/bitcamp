<%@page import="java100.app.domain.Board"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.List"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<!DOCTYPE html>
<html>
<head>
<title>게시판</title>
<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
</head>
<body>
<div class='container'>
<jsp:include page="/header.jsp"></jsp:include>
<h1>게시물 삭제 결과</h1>
<%
BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(
        BoardDao.class);
List<Board> list = boardDao.selectList();
try {
    
    int no = Integer.parseInt(request.getParameter("no"));
    
    if (boardDao.delete(no) > 0) {
        %>
        <p>삭제했습니다.</p>
        <%
    } else {
        %>
        <p>'<%=no %>'번의 게시물 정보가 없습니다.</p>
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

