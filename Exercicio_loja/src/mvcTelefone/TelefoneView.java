package mvcTelefone;

public class TelefoneView {
	
	public void imprimeTelefone(int fkCliente, int dddTelefone, String numeroTelefone) {
		System.out.println("Telefone do Cliente: ");
		System.out.println("\nC�digo do Cliente: " + fkCliente);
		System.out.print("DDD: " + dddTelefone);
		System.out.println(" - Telefone: " + numeroTelefone);
	}

}
