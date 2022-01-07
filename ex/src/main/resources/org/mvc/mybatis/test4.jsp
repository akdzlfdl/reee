<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
	$(function () {
		$("h1").css("color","red");
		$("#aa").css("color","blue");
	});

</script>

<body>
	<h1>hello</h1>
	<h2 id="aa">id는 단일요소 지정시 사용</h2>
	<h3 class="bb">class는 복수요소 지정시 사용</h3>
</body>