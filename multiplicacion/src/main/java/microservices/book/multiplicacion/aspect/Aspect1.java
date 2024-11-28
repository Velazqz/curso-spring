package microservices.book.multiplicacion.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aspect1 {
	
	//advice - around
	//execution(...) -pointcut
    @Around("execution (* microservices.book.multiplicacion.entities.BaseBallGame.playGame(..))")
    public Object doLogProcessGame(ProceedingJoinPoint joinPoint) throws Throwable{
    	Long t1=System.currentTimeMillis();
        Object returnValue= joinPoint.proceed();
        Long t2=System.currentTimeMillis();
        Long execution= t2-t1;
        String className=joinPoint.getSignature().getDeclaringTypeName();
        String methodName=joinPoint.getSignature().getName();
        System.out.println("Aspect 1: Tiempo - " + className + "." + methodName + "." + "time execution:" + execution);
        return returnValue;
    }

}
