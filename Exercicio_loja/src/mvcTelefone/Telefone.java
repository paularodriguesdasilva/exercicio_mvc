package mvcTelefone;

public class Telefone {
	private int fkCliente;
	private int dddTelefone;
	private String numeroTelefone;
	
	public int getFkCliente() {
		return fkCliente;
	}
	
	public void setFkCliente(int fkCliente) {
		this.fkCliente = fkCliente;
	}
	
	public int getDddTelefone() {
		return dddTelefone;
	}
	
	public void setDddTelefone(int dddTelefone) {
		this.dddTelefone = dddTelefone;
	}
	
	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	
	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	
}
