package org.mvc.jdbc;
import static org.junit.Assert.fail;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class JDBCTests {

	@Setter(onMethod_=@Autowired)
	private DataSource dataSource;
	
	@Setter(onMethod_=@Autowired)
	private SqlSessionFactory sqlSessionFactory;
	
	
	@Test
	public void testJDBC() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@masternull.iptime.org:1521:orcl","scott","tiger");
			log.info(conn);
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void mybatisTest() {
		try {
			Connection conn = dataSource.getConnection();
			log.info("=====================================");
			log.info(conn);
			log.info(sqlSessionFactory);
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
}






















