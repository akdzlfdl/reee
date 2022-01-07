package org.mvc.mybatis;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mvc.bean.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Setter(onMethod_=@Autowired)
	private BoardMapper mapper;		// 테스트 객체 
	
	@Test
	public void testGetList() {		// 테스트 진행 메서드 
		List<BoardDTO> list = mapper.getList();
		for(BoardDTO dto : list) {
			log.info(dto);
		}
	}
	
	@Test
	public void testInsert() {
		BoardDTO dto = new BoardDTO();
		dto.setTitle("새로 작성하는 제목");
		dto.setContent("새로 작성하는 내용");
		dto.setWriter("newJava");
		
		mapper.insert(dto);
		
		log.info(dto);
	}
	
	@Test
	public void testRead() {
		BoardDTO dto = mapper.read(5L);
		log.info(dto);
	}
	
	@Test
	public void testDelete() {
		log.info("delete count : "+mapper.delete(5L));
	}
	
	@Test
	public void testUpdate() {
		BoardDTO dto = new BoardDTO();
		dto.setTitle("수정 제목");
		dto.setBno(4L);
		
		log.info("update count : "+mapper.update(dto));
	}
}

























