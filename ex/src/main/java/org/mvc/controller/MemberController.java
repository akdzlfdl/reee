package org.mvc.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mvc.bean.FileInfo;
import org.mvc.bean.MemberDTO;
import org.mvc.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@Log4j
@RequestMapping("/member/")
public class MemberController {
	
	@Autowired
	private MemberService service; 
	
	@Autowired
	private FileInfo fileInfo;

	@RequestMapping("main")
	public String main() {
		return "member/main";
	}
	
	@RequestMapping("input")
	public String input() {
		return "member/input";
	}
	
	@RequestMapping("inputPro")
	public String inputPro(MemberDTO dto , MultipartFile save , Model model , HttpServletRequest req) { 
		log.info("======/member/inputPro="+dto);
		model.addAttribute("result", service.memberInsert(dto));
		
		if(save != null) {
			if(fileInfo.fileTypeCheck(save, "image")){
				String orgName = save.getOriginalFilename(); 
				String ext = orgName.substring(orgName.lastIndexOf(".")); 
				String fileName = dto.getId()+ext;  
				String path = req.getSession().getServletContext().getRealPath("/resources/member/img"); 
				File f = new File(path+"//"+fileName);
				try {
					save.transferTo(f);
				} catch (Exception e) {
					e.printStackTrace();
				} 
				
				dto.setImg(fileName);
				service.memberImgUpdate(dto);
			}
		}		
		return "member/inputPro";
	}
	
	@RequestMapping("login")
	public String memberlogin() {
		return "member/login";
	}
	
	@RequestMapping("loginPro")
	public String memberloginPro(MemberDTO dto , HttpSession session) {
		if(service.memberLoginCheck(dto) == 1) {
			session.setAttribute("memId", dto.getId());
		}
		return "member/loginPro";
	}
	
	@RequestMapping("logout")
	public String memberlogout(HttpSession session) {
		session.invalidate();
		return "member/logout";
	}
	
	@RequestMapping("userInfo")
	public String memberuserInfo(HttpSession session , Model model) {
		String id = (String)session.getAttribute("memId");
		model.addAttribute("memberDTO", service.memberUserInfo(id));
		return "member/userInfo";
	}
	
	@RequestMapping("imgUpdate")
	public String imgUpdate() {
		return "member/imgUpdate";
	}
	
	@RequestMapping("imgUpdatePro")
	public String imgUpdatePro(MemberDTO dto , MultipartFile save , Model model , HttpServletRequest req) {	
		if(save != null) {
			if(fileInfo.fileTypeCheck(save, "image")){
				String orgName = save.getOriginalFilename(); 
				String ext = orgName.substring(orgName.lastIndexOf(".")); 
				String fileName = dto.getId()+ext;  
				String path = req.getSession().getServletContext().getRealPath("/resources/member/img"); 
				File f = new File(path+"//"+fileName);
				try {
					save.transferTo(f);
				} catch (Exception e) {
					e.printStackTrace();
				} 
				dto.setImg(fileName);
				service.memberImgUpdate(dto);
			}
		}
		return "member/imgUpdatePro";
	}
	
	@RequestMapping("delete")
	public String memberdelete() {
		return "member/delete";
	}
	
	@RequestMapping("deletePro")
	public String memberdeletePro(MemberDTO dto , Model model , HttpSession session) {
		int result = service.memberLoginCheck(dto); 
		if(result == 1) {
			result= service.memberStatusChange(dto.getId());
			session.invalidate();
		}
		model.addAttribute("result" , result);
		return "member/deletePro";
	}
}














