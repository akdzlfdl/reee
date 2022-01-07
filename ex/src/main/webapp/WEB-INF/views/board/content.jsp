<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>content.jsp..페이지..</h1>

글번호 : ${boardDTO.bno} <br />
작성자 : ${boardDTO.writer} <br />
제 목 : ${boardDTO.title} <br />
내용 : ${boardDTO.content} <br />
작성일 : ${boardDTO.regdate} <br />
<a href="/board/update?bno=${boardDTO.bno}&writer=${boardDTO.writer}&title=${boardDTO.title}&content=${boardDTO.content}">글수정</a>
<a href="/board/delete?bno=${boardDTO.bno}">글삭제</a>