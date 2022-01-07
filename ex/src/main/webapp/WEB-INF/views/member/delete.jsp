<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <form action="/member/deletePro" method="post">
    		 <input type="hidden" name="id" value="${sessionScope.memId}" />
    	pw : <input type="password" name="pw" /> <br />
    		 <input type="submit" value="탈퇴" />
    </form>