package org.mvc.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/file/")
public class UploadController {

	private static int count=0;
	
	@RequestMapping("uploadForm")
	public String form() {
		return "/1203/uploadForm";
	}
	
	@RequestMapping("uploadPro")
	public String pro(String name , MultipartFile save , Model model) {
		String type = save.getContentType().split("/")[0]; 
		String orgName = save.getOriginalFilename();
		if(type.equals("image")) {
			File folder = new File("d://fileSave//");
			String [] list = folder.list();	
			for(String fileName : list) {
				if(fileName.equals(orgName)) {
					orgName = (++count)+orgName;
				}
			}
			File f = new File("d://fileSave//"+orgName);
			try {
				save.transferTo(f); // 업로드
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return "/1203/uploadPro";
	}
	
	// http://localhost:8080/file/test?str=100
	// http://localhost:8080/file/test?str=hello
	@RequestMapping("test")
	public String test(String str) {
		System.out.println(Integer.parseInt(str));
		return "/1203/uploadForm";
	}
}









