package org.mvc.service;

import java.util.List;

import org.mvc.bean.BoardDTO;
import org.mvc.mybatis.WorkMapper;
import org.mvc.work.WorkDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Log4j
@Service
public class WorkServiceImpl implements WorkService{
	
	@Setter(onMethod_=@Autowired)  
	private WorkMapper mapper;
	
	@Override
	public List<WorkDTO> getList() {
		log.info("getList...............");
		return mapper.getList();
	}

	@Override
	public int WorkWrite(WorkDTO dto) {
		log.info("boardWrite...............");
		return mapper.insert(dto);
	}

	@Override
	public WorkDTO getBnoRead(Long bno) {
		log.info("getBnoRead...............");
		return mapper.read(bno);
	}

	@Override
	public int WorkUpdate(WorkDTO dto) {
		log.info("WorkUpdate...............");
		return mapper.update(dto);
	}

	@Override
	public int WorkDelete(Long bno) {
		log.info("WorkDelete...............");
		return mapper.delete(bno);
	}

	@Override
	public int WorkReadCount(Long bno) {
		log.info("WorkReadCount...............");
		return mapper.readCount(bno);
	}


	
}