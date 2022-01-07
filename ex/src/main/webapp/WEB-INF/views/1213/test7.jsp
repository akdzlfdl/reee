<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
	$(function () {
		a =$("#msg").val();
		$("div").text(a);
		$("#msg").val("");
		});
	});
</script>

<body>
	<input type="text" id="msg"/>
	<input type="button" id="btn" value="버튼"/>
	<div></div>
</body>