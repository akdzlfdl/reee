package org.mvc.service;

import java.util.List;
import org.mvc.bean.BoardDTO;
import org.mvc.mybatis.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Log4j
@Service
public class BoardServiceImpl implements BoardService{

	@Setter(onMethod_=@Autowired)  // lombok 활용 의존성 주입 
	private BoardMapper mapper;
	
	@Override
	public List<BoardDTO> getList() {
		log.info("getList...............");
		return mapper.getList();
	}

	@Override
	public int boardWrite(BoardDTO dto) {
		log.info("boardWrite...............");
		return mapper.insert(dto);
	}

	@Override
	public BoardDTO getBnoRead(Long bno) {
		log.info("getBnoRead...............");
		return mapper.read(bno);
	}

	@Override
	public int boardUpdate(BoardDTO dto) {
		log.info("boardUpdate...............");
		return mapper.update(dto);
	}

	@Override
	public int boardDelete(Long bno) {
		log.info("boardDelete...............");
		return mapper.delete(bno);
	}

	@Override
	public int boardReadCount(Long bno) {
		log.info("boardReadCount...............");
		return mapper.readCount(bno);
	}
}






