<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script src="/resources/jquery/jquery-3.6.0.min.js"></script>    
<script>
	$(document).ready(function(){
		$("#btn").click(function(){
			$.ajax({
				type: "post" ,
				url : "/test/test" ,
				success : function(data){		
					$("#result").html(data);
				}
			});
		});
	});
</script>

<h1>ajaxDate.jsp </h1>
<input type="button" id="btn" value="시 작" />
<div id="result"></div>






