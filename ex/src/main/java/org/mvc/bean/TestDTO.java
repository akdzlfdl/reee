package org.mvc.bean;

import java.util.Date;

public class TestDTO {
	
	private String name;
	private int num;
	private Date day;
	
	public TestDTO() {
		System.out.println("기본생성자");
	}
	public TestDTO(String name) {
		System.out.println("TestDTO(String name)");
	}
	public TestDTO(String name , int num) {
		System.out.println("TestDTO(String name , int num)");
	}
	public TestDTO(Date day , String name) {
		System.out.println("참조형 매개변수=="+day);
		System.out.println("참조형 매개변수=="+name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("setName()=="+name);
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
		System.out.println("setNum()=="+num);
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
		System.out.println("setDay()=="+day);
	}
	
	
}








