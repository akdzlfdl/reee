package org.mvc.mybatis;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import org.mvc.work.WorkDTO;

public interface WorkMapper {

	public List<WorkDTO>	getList();	
	public int insert(WorkDTO board);	
	public WorkDTO read(Long bno);	
	public int delete(Long bno);	
	public int update(WorkDTO board);
	
	public int readCount(Long bno);
	
	public void readcountUpdate(int num);
	public BoardDataBean
}