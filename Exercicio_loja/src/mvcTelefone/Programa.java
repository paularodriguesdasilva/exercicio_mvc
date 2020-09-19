package mvcTelefone;

public class Programa {
	public static void main(String[] args) {
		
		Telefone telefone = new Telefone();
		TelefoneView tv = new TelefoneView();
		
		TelefoneController tc = new TelefoneController(telefone, tv);
		
		tc.setFkCliente(1);
		tc.setDddTelefone(25);
		tc.setNumeroTelefone("9 8845-7125");
		
		tc.atualizarView();
	}
}
