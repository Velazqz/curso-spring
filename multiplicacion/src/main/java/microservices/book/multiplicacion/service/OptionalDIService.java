package microservices.book.multiplicacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OptionalDIService {
	
    @Autowired(required=false)
	//@Autowired
	private ExerciseService exerciseService;
    
    public void doStuff() {
    	System.out.println("\n----Autowiring optional dependecy injection");
    	if(exerciseService != null)
    		exerciseService.execute();
    }

}
