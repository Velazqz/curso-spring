package microservices.book.multiplicacion.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aspect3 {
	
	// advice - afterReturnnig 
	// todos los metodos de las clases en el paquete entities
	// desplegar clase y nombre de metodo y el valor de retorno del metodo
	
	
    @AfterReturning(
        pointcut = "execution(* microservices.book.multiplicacion.entities..*(..))",
        returning = "returnValue"
    )
    public void logReturnValue(JoinPoint joinPoint, Object returnValue) {
        String className = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        System.out.println(String.format("Aspect 3: Metodo Ejecutado - %s.%s, Return Value: %s",
        		className, methodName, returnValue
        ));
    }

}
