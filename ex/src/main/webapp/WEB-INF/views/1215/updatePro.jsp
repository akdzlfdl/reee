<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>updatePro.jsp 페이지..!!</h1>

<c:if test="${result == 1}">
	<script>
		alert("수정 완료");
		window.location="/1215/content?bno=${WorkDTO.bno}";
	</script>
</c:if>
    