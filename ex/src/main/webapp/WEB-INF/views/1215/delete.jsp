<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>delete.jsp 페이지..</h1>

${bno} 글을 삭제 하시겠습니까?  <br />

<form action="/1215/deletePro" >
	<input type="hidden" name="bno" value="${bno}" />
	<input type="submit" value="글삭제" />
</form>