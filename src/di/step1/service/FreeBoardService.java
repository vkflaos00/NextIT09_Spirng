package di.step1.service;

import di.step1.dao.DataBaseDriver;
import di.step1.dao.MysqlDriver;
import di.step1.dao.OracleDriver;

public class FreeBoardService {

	//디비연결
	//DataBaseDriver driver = new OracleDriver();
	//DataBaseDriver driver = new MysqlDriver();
	
	private DataBaseDriver driver;

	
	public FreeBoardService() {}
	public FreeBoardService(DataBaseDriver driver) {
		this.driver = driver;
	}
	
	public void insertBoard() {
		driver.getConnection();
	}
	
}
