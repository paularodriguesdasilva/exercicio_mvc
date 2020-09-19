package mvcPedido;

public class Pedido {
	private int fkCliente;
	private int notaFiscal;
	private String dataEmissao;
	private double valorTotal;
	private String statusPedido;
	
	public int getFkCliente() {
		return fkCliente;
	}
	
	public void setFkCliente(int fkCliente) {
		this.fkCliente = fkCliente;
	}
	
	public int getNotaFiscal() {
		return notaFiscal;
	}
	
	public void setNotaFiscal(int notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	
	public String getDataEmissao() {
		return dataEmissao;
	}
	
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public String getStatusPedido() {
		return statusPedido;
	}
	
	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}
	
}
