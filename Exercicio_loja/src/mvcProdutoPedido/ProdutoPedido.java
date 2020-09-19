package mvcProdutoPedido;

public class ProdutoPedido {
	private int fkCliente;
	private int fkPedido;
	private String qtdeProduto;
	
	public int getFkCliente() {
		return fkCliente;
	}
	
	public void setFkCliente(int fkCliente) {
		this.fkCliente = fkCliente;
	}
	
	public int getFkPedido() {
		return fkPedido;
	}
	
	public void setFkPedido(int fkPedido) {
		this.fkPedido = fkPedido;
	}
	
	public String getQtdeProduto() {
		return qtdeProduto;
	}
	
	public void setQtdeProduto(String qtdeProduto) {
		this.qtdeProduto = qtdeProduto;
	}
	

}
