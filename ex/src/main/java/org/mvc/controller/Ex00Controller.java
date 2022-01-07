package org.mvc.controller;

import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mvc.bean.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Controller  // 스프링 컨트롤과 연결된다는 표시
@Slf4j
@Log4j
@RequestMapping("ex00/")
public class Ex00Controller {
	
	//@Autowired  // 스프링 컨트롤 에서 객체를 주입받는다. (의존성주입)
	private MemberDTO dto;
	
	// http://localhost:8080/ex00/main
	@RequestMapping(value="main" , method=RequestMethod.POST)  
	public String main() {
		System.out.println(dto);	
		return "1201/main"; // 이동할 view경로 
	}
	
	// http://localhost:8080/ex00/login
	// @RequestMapping("login")
	@GetMapping("login")
	public String login() {
		return "/1201/loginForm";
	}
	
	@PostMapping("loginPro")
	public String loginPro(Model model ,RedirectAttributes rttr ,  MemberDTO dto ) {

		model.addAttribute("count", 88);
		rttr.addFlashAttribute("num", 100); // 일회성 데이터 전달 방법 - 화면에서 새로고침하면 적용할수없다. !! 
			
		//return "/1201/loginPro"; // forward
		 return "redirect:/ex00/index"; // redirect 이동 - 값 전달되지 않는다. 
	}
	
	@RequestMapping("index")
	public String index() {
		return "/1201/index";
	}
	

	//@RequestMapping("test")
	public String test(String id , MemberDTO dto) {
		return "/1203/main";
	}
	
	// http://localhost:8080/ex00/test
	@RequestMapping("test")
	public void test() {
		
	}
	
	// 객체타입 지정 JSON
	@RequestMapping("test2")
	public @ResponseBody MemberDTO test2() {
		System.out.println("test2");		
		return dto;
	}
	
	//  @ResponseBody - view이동하지않고 return "" 값이 그대로 화면에 출력한다. (영문/숫자 출력)
	//  script 에서 사용된다. 
	@RequestMapping("test3")
	public @ResponseBody String test3() {
		System.out.println("test3");		
		return "hello spring";
	}
	
	
	// 웹 시스템 프로그래밍
	// 웹 헤더정보를 활용한다. 
	@RequestMapping("test4")
	public ResponseEntity<String> test4(){
		String msg = "{\"name\" : \"java\"}";

		HttpHeaders header = new HttpHeaders(); // 브라우저 헤더정보 
		header.add("Content-Type", "application/json;charset=UTF-8");
		
		return new ResponseEntity<>(msg , header , HttpStatus.OK);
	}

}




















