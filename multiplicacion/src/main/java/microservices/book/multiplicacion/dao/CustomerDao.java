package microservices.book.multiplicacion.dao;

import org.springframework.stereotype.Component;

@Component
public class CustomerDao implements IUserDao {

	@Override
	public void result() {
		System.out.println("Customer DAO Implementation");
	}

}
