package mvcProdutoPedido;

public class Programa {
	public static void main(String[] args) {
		
		ProdutoPedido produtoPedido = new ProdutoPedido();
		ProdutoPedidoView ppv = new ProdutoPedidoView();
		
		ProdutoPedidoController ppc = new ProdutoPedidoController(produtoPedido, ppv);
		
		ppc.setFkCliente(1);
		ppc.setfkPedido(2020000001);
		ppc.setQtdeProduto("1");
		
		ppc.atualizarView();
		
	}
}
