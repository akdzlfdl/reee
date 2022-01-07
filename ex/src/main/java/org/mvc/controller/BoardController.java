package org.mvc.controller;

import java.util.List;

import org.mvc.bean.BoardDTO;
import org.mvc.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@Log4j
@RequestMapping("/board/")
public class BoardController {
	
	@Autowired   // controller.xml 에서 객체를 대입받는다. (의존성 주입)
	private BoardService service;  //  BoardServiceImpl 객체가 컨트롤에서 대입된다.
	
	@RequestMapping("list")
	public String list(Model model) {
		List<BoardDTO> list = service.getList();
		log.info(""+list);
		model.addAttribute("list",list); // View 데이터 전달 
		return "board/list";
	}
	
	@RequestMapping("write")
	public String write() {
		log.info("===========/board/write");
		return "board/write";
	}
	
	@RequestMapping("writePro")
	public String writePro(BoardDTO dto , Model model ) {
		log.info("===========/board/writePro");
		model.addAttribute("result", service.boardWrite(dto));	
		return "board/writePro";
	}
	
	@RequestMapping("readcount")
	public String readcount(Long bno , RedirectAttributes rttr) {
		log.info("===========/board/readcount?bno="+bno);
		service.boardReadCount(bno);
		rttr.addAttribute("bno",bno);
		return "redirect:/board/content";
	}
	
	@RequestMapping("content")
	public String content(Long bno , Model model) {
		log.info("===========/board/content?bno="+bno);	
		model.addAttribute("boardDTO", service.getBnoRead(bno));
		return "board/content";
	}
	
	
	
	@RequestMapping("update")
	public String update(BoardDTO boardDTO) {
		log.info("===========/board/update?bno="+boardDTO.getBno());
		return "board/update";
	}
	
	@RequestMapping("updatePro")
	public String updatePro(BoardDTO dto , Model model ) {
		log.info("===========/board/updatePro");
		model.addAttribute("result", service.boardUpdate(dto));	
		return "board/updatePro";
	}
	
	@RequestMapping("delete")
	public String delete(@ModelAttribute("bno") Long bno) {
		log.info("===========/board/delete?bno="+bno);
		return "board/delete";
	}
	
	@RequestMapping("deletePro")
	public String deletePro(Long bno, Model model ) {
		log.info("===========/board/deletePro?bno="+bno);
		model.addAttribute("result", service.boardDelete(bno));	
		return "board/deletePro";
	}
}
















