<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <h1>main</h1>
    
<c:if test="${sessionScope.memId == null}">
	<script>
		alert("로그인후 사용가능합니다.!!");
		window.location="/member/login";
	</script>
</c:if>
<c:if test="${sessionScope.memId != null}">
	${sessionScope.memId}님 어서오세요!!
	<input type="button" value="로그아웃" onclick="window.location='/member/logout'" />
	<input type="button" value="회원정보" onclick="window.location='/member/userInfo'" />
</c:if>
    
     
     
     
     
     
     
     