package org.mvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test/")
public class TestController {
	
	@RequestMapping("ajaxDate")
	public String ajaxDate() {
		return "ajax/ajaxDate";
	}
	
	@RequestMapping("test")
	public String test() {
		return "ajax/test";
	}
}
