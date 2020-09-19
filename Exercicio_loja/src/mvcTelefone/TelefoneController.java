package mvcTelefone;

public class TelefoneController {
	private Telefone model;
	private TelefoneView view;
	
	public TelefoneController(Telefone model, TelefoneView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setFkCliente(int fkCliente) {
		model.setFkCliente(fkCliente);
	}
	
	public int getFkCliente() {
		return model.getFkCliente();
	}
	
	public void setDddTelefone(int dddTelefone) {
		model.setDddTelefone(dddTelefone);
	}
	
	public int getDddTelefone() {
		return model.getDddTelefone();
	}
	
	public void setNumeroTelefone(String numeroTelefone) {
		model.setNumeroTelefone(numeroTelefone);
	}
	
	public String getNumeroTelefone() {
		return model.getNumeroTelefone();
	}
	
	public void atualizarView() {
		view.imprimeTelefone(model.getFkCliente(), model.getDddTelefone(), model.getNumeroTelefone());
	}
}
