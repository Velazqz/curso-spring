package microservices.book.multiplicacion;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import microservices.book.multiplicacion.service.BeanInterface;

@Component
@Primary
public class Bean1 implements BeanInterface {

	@Override
	public String getName() {
		return "bean 1";
	}

}
