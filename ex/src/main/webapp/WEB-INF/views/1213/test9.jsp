<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
	$(function () {
		$("form").submit(function () {
		 if($("#id").val()==){
			 $("#id").css("border","1px solid red");
			 $("#id").after("<label>id를 입력해</label>");
			 $("label").css("color","red");
			 return false;
		 	}
		 if($("#pw").val()==){
			 $("#pw").css("border","1px solid red");
			 $("#pw").after("<label>pw를 입력해</label>");
			 $("label").css("color","red");
			 return false;
		 	}
		});
	});
</script>

<body>
	<form action="loginPro.jsp">
		<input type="text" id="id"></input >
		<input type="password" id="pw"></input >
		<input type="submit" value="로그인"></input >
	</form>
	<div></div>
</body>