package org.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.mvc.work.WorkDTO;
import org.mvc.service.WorkService;
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
@RequestMapping("/1215/")
public class WorkController {
	
	private WorkService service;  
	
	@RequestMapping("list")
	public String list(Model model) {
		List<WorkDTO> list = service.getList();
		log.info(""+list);
		model.addAttribute("list",list); 
		return "1215/list";
	}
	
	@RequestMapping("write")
	public String write(BoardDateBean dto) {
		log.info("===========/1215/write");
		return "1215/write";
	}
	
	@RequestMapping("writePro")
	public String writePro(BoardDateBean dto , HttpServletRequest,) {	
		return "1215/writePro";
	}
	
	@RequestMapping("readcount")
	public String readcount(Long bno , RedirectAttributes rttr) {
		log.info("===========/1215/readcount?bno="+bno);
		service.WorkReadCount(bno);
		rttr.addAttribute("bno",bno);
		return "redirect:/1215/content";
	}
	
	@RequestMapping("content")
	public String content(Long bno , Model model) {
		log.info("===========/1215/content?bno="+bno);	
		model.addAttribute("WorkDTO", service.getBnoRead(bno));
		return "1215/content";
	}
	
	
	
	@RequestMapping("update")
	public String update(WorkDTO WorkDTO) {
		log.info("===========/1215/update?bno="+WorkDTO.getBno());
		return "1215/update";
	}
	
	@RequestMapping("updatePro")
	public String updatePro(WorkDTO dto , Model model ) {
		log.info("===========/1215/updatePro");
		model.addAttribute("result", service.WorkUpdate(dto));	
		return "1215/updatePro";
	}
	
	@RequestMapping("delete")
	public String delete(@ModelAttribute("bno") Long bno) {
		log.info("===========/1215/delete?bno="+bno);
		return "1215/delete";
	}
	
	@RequestMapping("deletePro")
	public String deletePro(Long bno, Model model ) {
		log.info("===========/1215/deletePro?bno="+bno);
		model.addAttribute("result", service.WorkDelete(bno));	
		return "1215/deletePro";
	}
	
	@RequestMapping("content")
	public String content(int num, String pageNum , Model model) {
		 
		return "1215/content";
	}
	
	@RequestMapping("updateForm")
	public String updateForm(int num, String pageNum , Model model) {
		 
		model.addAttribute("articel", service.getArticle(num));
		model.addAttribute("pageNum", pageNum);
		
		return "1215/updateForm";
	}
	
	@RequestMapping("updatePro")
	public String updatePro(WorkDTO dto) {
		return "1215/updatePro";
	}
	
	@RequestMapping("updatePro")
	public String updatePro(BoardDataBean dto) {
		String passwd = service.passwdCheck(dto.getNum());
		int check = 0;
		if(passwd.equals(dto.getPassswd())) {
			service.updateArticle(dto);
			check = 1;
			
		}
		model.addAttribute("check",check);
		model.addAttribute("pageNum",pageNum);
		return "1215/updatePro";
	}
}
