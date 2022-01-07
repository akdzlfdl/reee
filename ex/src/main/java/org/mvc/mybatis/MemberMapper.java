package org.mvc.mybatis;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import org.mvc.bean.BoardDTO;
import org.mvc.bean.MemberDTO;

public interface MemberMapper {

	public int input(MemberDTO memberDTO);
	
	public int imgUpdate(MemberDTO memberDTO);
	
	public int loginCheck(MemberDTO memberDTO);
	
	public MemberDTO userInfo(String id);
	
	public int statusChange(String id);
}










