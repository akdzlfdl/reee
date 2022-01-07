package org.mvc.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class) 
@WebAppConfiguration	// Servlet 사용하기위함 - 웹테스트 진행 가능 
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml" ,
					   "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@Log4j
public class BoardControllerTests {
	@Setter(onMethod_=@Autowired)
	private WebApplicationContext ctx;   // Servlet 요청객체 
	
	private MockMvc mockMvc; 	//  URL 실행하는것처럼 만들어주는 객체 (가짜 MVC)
	
	@Before						// 테스트 실행전에 가장먼저 실행되는 메서드 
	public void setUp() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build(); // 가짜 MVC환경 구성 
	}
	
	@Test
	public void testGetList() throws Exception{
		log.info("===============================");
		log.info(mockMvc.perform(MockMvcRequestBuilders
					.get("/board/list"))
					.andReturn()
					.getModelAndView()
					.getModelMap());
		log.info("===============================");
	}
}















