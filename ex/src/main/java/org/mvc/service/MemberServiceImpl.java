package org.mvc.service;

import java.util.List;
import org.mvc.bean.BoardDTO;
import org.mvc.bean.MemberDTO;
import org.mvc.mybatis.BoardMapper;
import org.mvc.mybatis.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Log4j
@Service
public class MemberServiceImpl implements MemberService{
	
	@Setter(onMethod_=@Autowired)  
	private MemberMapper mapper;
	
	@Override
	public int memberInsert(MemberDTO memberDTO) {
		return mapper.input(memberDTO);
	}

	@Override
	public int memberImgUpdate(MemberDTO memberDTO) {		
		return mapper.imgUpdate(memberDTO);
	}

	@Override
	public int memberLoginCheck(MemberDTO memberDTO) {
		return mapper.loginCheck(memberDTO);
	}

	@Override
	public MemberDTO memberUserInfo(String id) {
		return mapper.userInfo(id);
	}

	@Override
	public int memberStatusChange(String id) {
		return mapper.statusChange(id);
	}	
}






