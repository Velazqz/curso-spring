package microservices.book.multiplicacion.entities;

import org.springframework.stereotype.Component;

@Component
public class RedSox implements Team{

	@Override
	public String getName() {
		return "Boston Red Sox";
	}

}
