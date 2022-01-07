package org.mvc.aop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class SessionCheckAdvice {

	public Object around(ProceedingJoinPoint jp)throws Throwable {
		// 현재 실행중인 servlet 설정 정보를 모두 가져온다.
		RequestAttributes ra = RequestContextHolder.currentRequestAttributes();
		  // servlet 설정 정보에서 Request 를 꺼내기위해 타입변경
		ServletRequestAttributes sra = (ServletRequestAttributes)ra;
	    // 타입변경된 객체에서 Request 객체 획득
	      HttpServletRequest request = sra.getRequest();
	      // Request 에서 session 객체 획득
	      HttpSession session = request.getSession();
	      
	      if(session.getAttribute("memId") == null) {
	    	  return "member/login";
	      }
		return jp.proceed();
	}
}
