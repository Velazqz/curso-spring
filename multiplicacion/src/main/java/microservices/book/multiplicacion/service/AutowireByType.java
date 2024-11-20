package microservices.book.multiplicacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import microservices.book.multiplicacion.dao.IUserDao;

@Component
public class AutowireByType {
	//Autowire by type (default)
	//@Autowired
	//private IUserDao dao;
	//private IUserDao customerDao;
	
	// Autowire by name
	@Autowired
	private IUserDao userDao;
	@Autowired
	private IUserDao customerDao;
	
	
	/*
	public void printResult() {
		System.out.println("\n------Autowire By Type-------");
		dao.result();
	}
	*/
	
	/*
	public void printResult() {
		System.out.println("\n------Autowire By Type-------");
		customerDao.result();
	}
	*/
	
	
	
	
	public void printResult() {
		System.out.println("\n------Autowire By Name-------");
		userDao.result();
		customerDao.result();
	}
	
}
