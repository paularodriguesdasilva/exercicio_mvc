package mvcProdutoPedido;

public class ProdutoPedidoView {
	public void imprimeProdutoPedido(int fkCliente, int fkPedido, String qtdeProduto) {
		System.out.println("Produto/Pedido do Cliente: ");
		System.out.println("\nC�digo do Cliente: " + fkCliente);
		System.out.println("C�digo do Pedido: " + fkPedido);
		System.out.println("Quantidade de Produtos do Pedido: " + qtdeProduto);
	}
}
