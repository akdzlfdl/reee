package org.mvc.mybatis;

import org.apache.ibatis.annotations.Insert;

public class Sample1Mapper {
	
	@Insert("insert into tbl_sample1 values(#{data})")
	public int insertCol1(String data);

}
