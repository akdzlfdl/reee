package org.mvc.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

// @RunWith() - 현재 테스트 코드가 스프링실행 역할 의미 
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class Ex00ControllerTests {

		@Test
		public void test() {
			log.info("test-");
		}
}





