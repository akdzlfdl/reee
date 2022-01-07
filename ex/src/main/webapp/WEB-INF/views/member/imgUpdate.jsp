<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <h1>imgUpdate.jsp.. 페이지.</h1>
    
    <form action="/member/imgUpdatePro" method="post" enctype="multipart/form-data">
    		  <input type="hidden" name="id" value="${sessionScope.memId}" />
    	사진 : <input type="file" name="save" /> <br />
    		  <input type="submit" value="전송" />
    </form>