<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>writePro.jsp 페이지..!!</h1>

<c:if test="${result == 1}">
	<script>
		alert("글쓰기 완료");
		window.location="/board/list";
	</script>
</c:if>

