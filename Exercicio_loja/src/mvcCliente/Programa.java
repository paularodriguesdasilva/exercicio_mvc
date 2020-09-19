package mvcCliente;

public class Programa {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		ClienteView cv = new ClienteView();
		
		ClienteController cc = new ClienteController(cliente, cv);
		
		cc.setIdCliente(1);
		cc.setNome("João da Silva");
		cc.setCpf("524.628.674-52");
		cc.setRg("25.623.184-12");
		cc.setDataNascimento("25/03/1985");
		cc.setEmail("jsilva96@gmail.com");
			
		cc.atualizarView();
	}
}
