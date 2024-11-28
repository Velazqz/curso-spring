package microservices.book.multiplicacion;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class InfrastructureConfig {
	
	@Bean
	DataSource dataSource() {
		return new DriverManagerDataSource();
	}
}
