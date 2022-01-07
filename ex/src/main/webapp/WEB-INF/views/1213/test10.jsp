<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<<style>
	div{
		width: 200px; height : 200px
		background: red;
		display: none;
	
	}


</style>


<script>
	$(function () {
		$("#on").click(function(){
			$("div").show();
		});
		$("#off").click(function(){
			$("div").hide();
		});
	});
	</script>
	<body>
		<input type="button" id="on" value="on"/>
		<input type="button" id="off" value="off"/> <br />
		<div></div>
	</body>