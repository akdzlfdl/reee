<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>login</h1>

<form method="post" action="/security/login">
	id: <input type="text" name="username" />
	pw: <input type="password" name="password" />
	자동로그인 : <input type="checkbox" name="remember-me" />
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		<input type="submit" value="로그인">

</form>