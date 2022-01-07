package org.mvc.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Academy {
	
	@Setter(onMethod_=@Autowired)
	private Student student;
}







