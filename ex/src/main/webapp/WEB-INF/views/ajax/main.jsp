<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="/resources/jquery/jquery-3.6.0.min.js"></script>
    <script>
     
    	$(document).ready(function(){
    		$('#btn').click(function () {
   
    		day = window.setInterval('myDate()' , 10000);
    			
    		});
    		$('#btn2').click(function () {
    			   
        	 window.clearInterval(day);
        			
        		});
    		
    	});
    	function myDate(){
    		$.ajax({
				type:"post",
				url : "/test/realTime",
				success : function (data) {
					$("#result").html(data);
					
				}
			});
    	}
    </script>
    <h1>/ajax/main.jsp..페이지!</h1>
    
    <h1>전체 회원수 : <label id="result">${count}</label></h1>