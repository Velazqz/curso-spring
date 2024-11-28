package microservices.book.multiplicacion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import microservices.book.multiplicacion.entities.Game;
import microservices.book.multiplicacion.entities.Team;

//@SpringBootApplication
public class MultiplicacionApplication {

	public static void main(String[] args) throws Exception {
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Game game1 = context.getBean("game", Game.class);
		Team favoriteTeam = context.getBean("redSox", Team.class);
		game1.setAwayTeam(favoriteTeam);
		System.out.println("****** | Game | ****** \n " + game1.playGame());
	}

}
