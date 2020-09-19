package mvcEndereco;

public class Programa {
	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		EnderecoView ev = new EnderecoView();
		
		EnderecoController ec = new EnderecoController(endereco, ev);
		
		ec.setFkCliente(1);
		ec.setRua("Travessa Rio Tietê");
		ec.setNumero("27");
		ec.setBairro("Jardim Santa Luzia");
		ec.setCidade("Passos");
		ec.setEstado("Minas Gerais");
		
		ec.atualizarView();
	}
}
