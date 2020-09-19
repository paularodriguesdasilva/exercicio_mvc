package mvcProdutoPedido;

public class ProdutoPedidoController {
	private ProdutoPedido model;
	private ProdutoPedidoView view;
	
	public ProdutoPedidoController(ProdutoPedido model, ProdutoPedidoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setFkCliente(int fkCliente) {
		model.setFkCliente(fkCliente);
	}
	
	public int getFkCliente() {
		return model.getFkCliente();
	}
	
	public void setfkPedido(int fkPedido) {
		model.setFkPedido(fkPedido);
	}
	
	public int getfkPedido() {
		return model.getFkPedido();
	}
	
	public void setQtdeProduto(String qtdeProduto) {
		model.setQtdeProduto(qtdeProduto);
	}
	
	public String getQtdeProduto() {
		return model.getQtdeProduto();
	}
	
	public void atualizarView() {
		view.imprimeProdutoPedido(model.getFkCliente(), model.getFkPedido(), model.getQtdeProduto());
	}
}
