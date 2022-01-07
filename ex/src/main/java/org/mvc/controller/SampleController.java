package org.mvc.controller;

import org.mvc.mybatis.Sample1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Log4j

public class SampleController {

	@Autowired
	private SampleService service;
	
	
		@RequestMapping("main")
		public String aopMain()throws {
			log.info("=====[aopmain]=====");
			log.info(null);
			
			return "1214/main";
		}
}
