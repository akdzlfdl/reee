package org.mvc.mybatis;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import org.mvc.bean.BoardDTO;

public interface BoardMapper {

	// @Select("select * from tbl_board where bno > 0")
	public List<BoardDTO>	getList();	
	public int insert(BoardDTO board);	
	public BoardDTO read(Long bno);	
	public int delete(Long bno);	
	public int update(BoardDTO board);
	
	public int readCount(Long bno);
	
}










