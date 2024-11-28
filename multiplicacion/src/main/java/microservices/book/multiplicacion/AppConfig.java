package microservices.book.multiplicacion;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import jakarta.annotation.Resource;
import microservices.book.multiplicacion.entities.BaseBallGame;
import microservices.book.multiplicacion.entities.Game;
import microservices.book.multiplicacion.entities.Team;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages="microservices.book.multiplicacion")
public class AppConfig {

	@Autowired
	public DataSource datasource;
	
	@Resource
	private Team redSox;
	
	
	@Resource
	private Team cubs;
	
	@Bean
	Game game() {
		BaseBallGame baseBallGame = new BaseBallGame(redSox,cubs);
		baseBallGame.setDatasource(datasource);
		return baseBallGame;
	}
}
