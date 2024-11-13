package microservices.book.multiplicacion.service;

public class Cajero {
    private Impresora impresora;

	public Impresora getImpresora() {
		return impresora;
	}

	public void setImpresora(Impresora impresora) {
		this.impresora = impresora;
	}


	public void imprimirBalance(String numeroCuenta) {
		getImpresora().imprimirBalance(numeroCuenta);
	} 

}
