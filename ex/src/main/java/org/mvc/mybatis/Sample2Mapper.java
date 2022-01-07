package org.mvc.mybatis;

import org.apache.ibatis.annotations.Insert;

public class Sample2Mapper {
	@Insert("insert into tbl_sample2 values(#{data})")
	public int insertcol2(String data);

}
