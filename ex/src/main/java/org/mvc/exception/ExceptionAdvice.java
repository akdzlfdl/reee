package org.mvc.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice	// AOP 기능
@Slf4j
public class ExceptionAdvice {

	@ExceptionHandler(Exception.class)
	public String excet(Exception e , Model model) {
		log.error("Exception---"+e.getMessage());
		return "/error/error_page";
	}
}
