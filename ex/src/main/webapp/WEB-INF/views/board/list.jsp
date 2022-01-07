<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<h1>list.jsp.. 페이지.!!</h1>

<a href="/board/write">글쓰기</a> 
<br />

<c:forEach items="${list}" var="boardDTO" >
	${boardDTO.bno} |
	<a href="/board/readcount?bno=${boardDTO.bno}">${boardDTO.title}</a> |
	${boardDTO.writer} |
	${boardDTO.regdate} |
	${boardDTO.readcount} 
	<br />
</c:forEach>






