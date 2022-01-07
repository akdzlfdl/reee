<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<h1>userInfo.jsp .. 페이지..!!</h1>

<img src="/resources/member/img/${memberDTO.img}" width="100" />
<input type="button" value="사진변경" onclick="window.location='/member/imgUpdate'" />
<br />

id : ${memberDTO.id} <br />
pw : ${memberDTO.pw} <br />	
name : ${memberDTO.name} <br />	
birth : <fmt:formatDate value="${memberDTO.birth}" type="date" /> <br />
regdate : <fmt:formatDate value="${memberDTO.regdate}" type="date" /> <br />

<input type="button" value="탈퇴" onclick="window.location='/member/delete'" />