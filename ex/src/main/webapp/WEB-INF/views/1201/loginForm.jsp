<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <h1>loginForm.jsp 페이지..!!</h1>
    
    <form action="/ex00/loginPro" method="post">
    	id : <input type="text" name="id" /> <br />
    	pw : <input type="password" name="pw" /> <br />
		생일 :  <input type="date" name="birth" /> <br />    
		이름	: <input type="text" name="name" /> <br />	
    		 <input type="submit" value="로그인" />
    </form>