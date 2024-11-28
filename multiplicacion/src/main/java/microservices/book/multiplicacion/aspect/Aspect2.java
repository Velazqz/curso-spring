package microservices.book.multiplicacion.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aspect2 {
	
	//advice - before
	//pointcut - todos los metodos publicos en el paquete entities
	//desplegar la clase y el metodo que se atrapo y sus argumentos

	    @Before("execution(* microservices.book.multiplicacion.entities.*.*(..))")
	    public void logMethodDetails(JoinPoint joinPoint) {
	        String className = joinPoint.getTarget().getClass().getSimpleName();
	        String methodName = joinPoint.getSignature().getName();
	        Object[] args = joinPoint.getArgs();
	        System.out.println("Método interceptado: " + className + "." + methodName);
	        System.out.println("Argumentos:");
	        for (Object arg : args) {
	            System.out.println("--->" + arg);
	        }
	    }
	}


