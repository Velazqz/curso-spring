package microservices.book.multiplicacion.service;

public class Impresora {

	private String mensaje;

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public void imprimirBalance(String numeroCuenta) {
	System.out.println(mensaje + ", cuenta: " + numeroCuenta);
	}


}
