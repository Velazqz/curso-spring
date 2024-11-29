package microservices.book.multiplicacion.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspect4 {
	
	@AfterThrowing(pointcut="execution (* microservices.book.multiplicacion.entities.*.*(..))",throwing ="exception" )
	public void doProcessToEntities(JoinPoint joinPoint,Exception exception){
		String className=joinPoint.getSignature().getDeclaringTypeName();
        String methodName=joinPoint.getSignature().getName();
        System.out.println("Aspect 4: className - "+className+"."+"methodName:"+methodName+"exeption:"+exception.getMessage());
	}
}
