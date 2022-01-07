<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <h1>update.jsp 페이지..!!</h1>
    
    <form action="/board/updatePro" method="post">
    			<input type="hidden" name="bno" value="${boardDTO.bno}" />
    	작성자 : <input type="text" name="writer" value="${boardDTO.writer}" /> <br />
    	제 목 : <input type="text" name="title" value="${boardDTO.title}" /> <br />
    	내 용 : <textarea rows="10" cols="20" name="content">${boardDTO.content}</textarea> <br />
    		   <input type="submit" value="글수정" />
    </form>