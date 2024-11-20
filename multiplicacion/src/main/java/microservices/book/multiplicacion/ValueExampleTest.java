package microservices.book.multiplicacion;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ValueExampleTest {
    public static void main(String[] args) {
        // Crear el contexto
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Iniciar el contexto
        context.start(); // Esto activará el ContextStartedEvent

        // Lógica de la aplicación aquí
        System.out.println("Application is running...");

        // Detener el contexto
        context.stop(); // Esto activará el ContextStoppedEvent

        // Cerrar el contexto y liberar recursos
        int exitCode = SpringApplication.exit(context, () -> 0);
        System.exit(exitCode);
    }

}