<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <h1>write.jsp 페이지..!!</h1>
    
    <form action="/board/writePro" method="post">
    	작성자 : <input type="text" name="writer" /> <br />
    	제 목 : <input type="text" name="title" /> <br />
    	내 용 : <textarea rows="10" cols="20" name="content"></textarea> <br />
    		   <input type="submit" value="글쓰기" />
    </form>