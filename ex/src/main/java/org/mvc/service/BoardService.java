package org.mvc.service;
import java.util.List;
import org.mvc.bean.BoardDTO;

public interface BoardService {
	
	// tbl_board 테이블의 전체 목록 
	public List<BoardDTO>	getList();
	
	// tbl_board 테이블에 데이터 추가
	public int boardWrite(BoardDTO dto);
	
	public BoardDTO getBnoRead(Long bno);
	
	public int boardUpdate(BoardDTO dto);
	
	public int boardDelete(Long bno);
	
	public int boardReadCount(Long bno);
}







