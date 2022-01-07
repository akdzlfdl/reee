package org.mvc.aop;

import org.aspectj.lang.ProceedingJoinPoint;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Log4j
public class LogXmlAdvice {

	public void before() {
		System.out.println("===[aop before]===");
	}
	
	public void after() {
		System.out.println("===[aop after]===");
	}
	
	public Object around(ProceedingJoinPoint jp)throws Throwable {
		log.info("==Target=="+jp.getTarget());
		log.info("==Kind=="+jp.getKind());
		log.info("==Signature=="+jp.getSignature());
		log.info("==SourceLocation=="+jp.getSourceLocation());
		log.info("==StaticPart=="+jp.getStaticPart());
		log.info("==This=="+jp.getThis());
		log.info("==Args=="+jp.getArgs()+"===args="+jp.getArgs().length);
		
		
		Object obj = jp.proceed(); // 타켓메서드로 이동
		
		return "1214/form";
	}
}
