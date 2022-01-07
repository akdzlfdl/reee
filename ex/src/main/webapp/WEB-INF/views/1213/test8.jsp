<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
	$(function () {
		$("#city1").change(function () {
			a = $(this).val();
			alert(a);
		});
	});
</script>

<body>
	<select id="city1">
		<option value="seoul">서울</option>
		<option>경기도</option>
		<option>기타</option>
	</select>
	<div></div>
</body>