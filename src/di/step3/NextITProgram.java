package di.step3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.step2.dao.DataBaseDriver;
import di.step2.dao.MysqlDriver;
import di.step2.dao.OracleDriver;
import di.step2.service.FreeBoardService;

public class NextITProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DataBaseDriver driver = new OracleDriver();
		//DataBaseDriver driver = new MysqlDriver();
		
		ApplicationContext context 
			= new ClassPathXmlApplicationContext("spring/step2.xml");
	
		//글쓰기처리
		//FreeBoardService free = new FreeBoardService(driver);
		FreeBoardService free
			= (FreeBoardService) context.getBean("free");
		free.insertBoard();
		
		
	}

}
