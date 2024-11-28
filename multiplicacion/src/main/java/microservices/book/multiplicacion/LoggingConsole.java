package microservices.book.multiplicacion;

public class LoggingConsole implements Logging{

	@Override
	public void log(String str) {
		System.out.println(str);	
	}

}
