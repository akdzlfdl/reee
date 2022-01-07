package org.mvc.work;

import java.util.Date;

import lombok.Data;

@Data
public class WorkDTO {
	private Long bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Date updateDate;
	private Long readcount;
}
