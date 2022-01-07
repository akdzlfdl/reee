<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <form action="/file/uploadPro" method="post" enctype="multipart/form-data">
    	작성자 : <input type="text" name="name" /> <br />
    	파 일 : <input type="file" name="save" /> <br />
    		   <input type="submit" value="업로드" />
    </form>