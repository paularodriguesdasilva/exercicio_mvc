package mvcEndereco;

public class EnderecoView {
	
	public void imprimeEndereco(int fkCliente, String rua, String numero, String bairro, String cidade, String estado) {
		System.out.println("Endere�o: ");
		System.out.println("\nC�digo do Cliente: " + fkCliente);
		System.out.print("Rua: " + rua);
		System.out.print(", numero: " + numero);
		System.out.println(" - Bairro: " + bairro);
		System.out.println("Cidade: " + cidade);
		System.out.println("Estado: " + estado);
	}
}
