package microservices.book.multiplicacion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import microservices.book.multiplicacion.entities.Game;

//@SpringBootApplication
public class MultiplicacionApplication {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Game game1 = context.getBean("game",Game.class);
		System.out.println("****|Game|****");
		System.out.println(game1.playGame());

	}

}
