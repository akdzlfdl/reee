package org.mvc.service;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import lombok.Setter;

public class SampleTxServiceImpl implements SampleTxService{
	
	@Setter(onMethod = @Autowired)
	private SampleMapper mapper1;

	@Setter(onMethod = @Autowired)
	private SampleMapper mapper2;
	
	@Transactional
	@Override
	public void addData(String value) {
		log.info("=====mapper1=======");
		mapper1.insertCol1(value);
		
	}
}
