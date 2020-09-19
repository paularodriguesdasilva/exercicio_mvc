package mvcPedido;

public class Programa {
	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		PedidoView pv = new PedidoView();
		
		PedidoController pc = new PedidoController(pedido, pv);
		
		pc.setFkCliente(1);
		pc.setNotaFiscal(2020000001);
		pc.setDataEmissao("22-02-2020");
		pc.setValorTotal(20810.00);
		pc.setStatusPedido("pendente");
		
		pc.atualizarView();
	}
}
