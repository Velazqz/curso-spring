package microservices.book.multiplicacion.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueExample {
	
	@Value("${value.from.file}")
	private String valueFormFile;
	
	@Value("${priority}")
	private String prioritySystemProperty;
	
	@Value("${listOfValues}")
	private String[] valuesArray;

	@Override
	public String toString() {
		return "ValueExample [valueFormFile=" + valueFormFile + ", prioritySystemProperty=" + prioritySystemProperty
				+ ", valuesArray=" + Arrays.toString(valuesArray) + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}


}
