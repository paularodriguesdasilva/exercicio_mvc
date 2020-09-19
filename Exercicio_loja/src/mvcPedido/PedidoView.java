package mvcPedido;

public class PedidoView {
	public void imprimePedido(int fkCliente, int notaFiscal, String dataEmissao, double valorTotal, String statusPedido) {
		System.out.println("Pedido do Cliente: ");
		System.out.println("\nCódigo do Cliente: " + fkCliente);
		System.out.println("Nota Fiscal n°: " + notaFiscal);
		System.out.println("Data de emissão: " + dataEmissao);
		System.out.println("Valor total do pedido: " + valorTotal);
		System.out.println("Status do pedido: " + statusPedido);
		
}
	
}
