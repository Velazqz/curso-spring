package microservices.book.multiplicacion.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDao implements IUserDao {

	@Override
	public void result() {
		System.out.println("User DAO Implementation");
	}

}
