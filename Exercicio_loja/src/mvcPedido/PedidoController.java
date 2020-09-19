package mvcPedido;

public class PedidoController {
	private Pedido model;
	private PedidoView view;
	
	public PedidoController(Pedido model, PedidoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setFkCliente(int fkCliente) {
		model.setFkCliente(fkCliente);
	}
	
	public int getFkCliente() {
		return model.getFkCliente();
	}
	
	public void setNotaFiscal(int notaFiscal) {
		model.setNotaFiscal(notaFiscal);
	}
	
	public int getNotaFiscal() {
		return model.getNotaFiscal();
	}
	
	public void setDataEmissao(String dataEmissao) {
		model.setDataEmissao(dataEmissao);
	}
	
	public String getDataEmissao() {
		return model.getDataEmissao();
	}
	
	public void setValorTotal(double valorTotal) {
		model.setValorTotal(valorTotal);
	}
	
	public double getValorTotal() {
		return model.getValorTotal();
	}
	
	public void setStatusPedido(String statusPedido) {
		model.setStatusPedido(statusPedido);
	}
	
	public String getStatusPedido() {
		return model.getStatusPedido();
	}
	
	public void atualizarView() {
		view.imprimePedido(model.getFkCliente(), model.getNotaFiscal(), model.getDataEmissao(), model.getValorTotal(), model.getStatusPedido());
	}
	
}
