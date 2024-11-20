package microservices.book.multiplicacion.dao;

import org.springframework.stereotype.Component;

@Component("address")
public class AddressDao implements IDao {

	@Override
	public void result() {
		System.out.println("Address Dao Implementation");
	}

}
