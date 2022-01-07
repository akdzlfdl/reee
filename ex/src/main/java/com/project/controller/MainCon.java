package com.project.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.bean.MainDTO;

@Controller
@RequestMapping("/com/")
public class MainCon {

	
	@RequestMapping("main")
		public String main(MainDTO dto, String id , HttpServletRequest request) {
			String rid = request.getParameter("name");
			return "1215/main";
	}
}
