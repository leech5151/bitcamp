<%@page import="java100.app.domain.Room"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<title>강의실관리</title>
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>
<div class='container'>

<jsp:include page="../header.jsp"/>

<h1>강의실 목록</h1>


<div class="toolbar">
<a href='form' class='btn btn-primary btn-sm'>추가</a>
<form action="list" method="get" class="searchbox" >
<input type="text" name="word">
<button>검색</button>
</form>
</div>

<table class='table table-hover'>
<thead>
<tr>
<th>번호</th><th>지역</th><th>강의실명</th><th>수용인원</th><th>삭제</th>
</tr>
</thead>
<tbody>

<c:forEach items="${list}" var="room">
        <tr>
        <td>${room.no}</td>
        <td>${room.location}</td>
        <td>${room.name}</td>
        <td>${room.capacity}</td>
        <td><a href='delete?no=${room.no}' class='btn btn-danger btn-sm'>삭제</a></td>
        </tr>
</c:forEach>

</tbody>
</table>
<c:set var="prePageDisabled" value="${(pageNo > 1) ? '':'disabled'}"/>
<c:set var="prePageTabIndex" value="${(pageNo > 1) ? 0 : -1}"/>
<c:set var="nextPageDisabled" value="${(pageNo < lastPageNo) ? '':'disabled' }"/>
<c:set var="nextPageTabIndex" value="${(pageNo < lastPageNo) ? 0 : -1}"/>

<nav aria-label="Page navigation">
  <ul class="pagination justify-content-center">
    <li class="page-item ${prePageDisabled }"><a class="page-link" 
        href="list?pn=${pageNo - 1}"
        tabindex="${prePageTabIndex}">이전</a></li>
        
    <li class="page-item"><a class="page-link" href="#">${pageNo }</a></li>
    
    <li class="page-item ${nextPageDisabled}"><a class="page-link"
         href="list?pn=${pageNo + 1}"
         tabindex="${nextPageTabIndex}">다음</a></li>
  </ul>
</nav>
<jsp:include page="../footer.jsp"/>

</div>

<jsp:include page="../jslib.jsp"/>

</body>
</html>
