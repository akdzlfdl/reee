<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="/resources/jquery/jquery-3.6.0.min.js"></script>
    <script>
     
    	$(document).ready(function(){
    		$("#btn").click(function)(){
    			$.ajax({
    			type:"post",
				url : "/test/idCheck",
				data : { id : $("#id").val() , pw : '1234' } ,
				success : function (data) {
					$("#result").html(data);
					
    		}
    			});
    	});
    	
    });
    	</script>
    	
    	
    	<form action="/ajax/formPro" method="post">
    	 id: <input type="text" name="id" id="mymymy"/> 
    	  	<input type="button" value="중복확인" id="my"/> 
   			<label id="result"></label>	
   				<br />
   				
   				<input type="subimt" value="전송" />
    
    </form>