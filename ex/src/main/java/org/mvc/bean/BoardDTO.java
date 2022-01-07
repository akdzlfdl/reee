package org.mvc.bean;

import java.util.Date;

import lombok.Data;

@Data  // lombok - 생성자 / set/get/toSring 자동생성해준다. 
public class BoardDTO {
	private Long bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Date updateDate;
	private Long readcount;
}
