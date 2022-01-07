package org.mvc.service;
import java.util.List;
import org.mvc.bean.BoardDTO;
import org.mvc.bean.MemberDTO;

public interface MemberService {
	
	public int memberInsert(MemberDTO memberDTO);
	
	public int memberImgUpdate(MemberDTO memberDTO);
	
	public int memberLoginCheck(MemberDTO memberDTO);
	
	public MemberDTO memberUserInfo(String id);
	
	public int memberStatusChange(String id);
}







