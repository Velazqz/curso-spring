package microservices.book.multiplicacion;

import org.springframework.stereotype.Component;

import microservices.book.multiplicacion.service.BeanInterface;

@Component
public class Bean2 implements BeanInterface {

	@Override
	public String getName() {
		return "bean 2";
	}

}
