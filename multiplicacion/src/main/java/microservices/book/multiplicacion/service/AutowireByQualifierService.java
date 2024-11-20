package microservices.book.multiplicacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import microservices.book.multiplicacion.dao.IDao;

@Component
public class AutowireByQualifierService {
	
	@Autowired
	@Qualifier("address")
	private IDao addressDao;
	
	@Autowired
	//@Qualifier("contact")    // Es opcional
	@Qualifier("address")   // @Qualifier tiene mas precedencia que resolucion por nombre
	private IDao contactDao;
	
	
	
	public void printResult() {
		System.out.println("\n------- Autowire by Qualifier");
		addressDao.result();
		contactDao.result();
	}

}
