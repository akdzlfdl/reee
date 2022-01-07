package org.mvc.service;

import java.util.List;

import org.mvc.work.WorkDTO;


public interface WorkService {
	
	public List<WorkDTO>	getList();
	
	public int WorkWrite(WorkDTO dto);
	
	public WorkDTO getBnoRead(Long bno);
	
	public int WorkUpdate(WorkDTO dto);
	
	public int WorkDelete(Long bno);
	
	public int WorkReadCount(Long bno);
	

}



