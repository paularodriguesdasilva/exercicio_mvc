package mvcCliente;

public class ClienteView {
	
	public void imprimeDetalhesDoCliente(int id_cliente, String nome, String cpf, String rg, String dataNascimento, String email) {
		System.out.println("Cliente: ");
		System.out.println("\nId: " + id_cliente);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("RG: " + rg);
		System.out.println("Data de Nascimento: " + dataNascimento);
		System.out.println("Email: " + email);
	}

}
