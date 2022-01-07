package org.mvc.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Log4j
@Component

public class LogAdvice {

	@Before( "execution(* org.mvc.controller.Sample*.aop*.*(..))")
	private void logBefore() {
		
		log.info("=====before======");


	}
		
}
