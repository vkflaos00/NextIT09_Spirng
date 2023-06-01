package di.step1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.step1.dao.DataBaseDriver;
import di.step1.dao.MysqlDriver;
import di.step1.dao.OracleDriver;
import di.step1.service.FreeBoardService;

public class NextITProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DataBaseDriver driver = new OracleDriver();
		//DataBaseDriver driver = new MysqlDriver();
		
		 ApplicationContext context 
		 	=  new ClassPathXmlApplicationContext("spring/step1.xml");
		
		 DataBaseDriver driver
		 	= (DataBaseDriver) context.getBean("driver");
		 	//= (DataBaseDriver) context.getBean("driver", DataBaseDriver.class);
		
		//글쓰기처리
		FreeBoardService free = new FreeBoardService(driver);
		free.insertBoard();
		
		
	}

}
