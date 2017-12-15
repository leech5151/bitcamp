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
<h1>지시부(directive element)</h1>
서블릿 클래스에 특별한 작업을 지시할 때 사용한다.<br>

<h2>JSP 코드 - taglib 테스트</h2>
JSTL 태그 라이브러리를 가져와서 사용해보자<br>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:forTokens var='name' items="홍길동,임꺽정,유관순,안중근,윤봉길" delims=",">
    <p>${name}</p>>
</c:forTokens>

</body>
</html>






