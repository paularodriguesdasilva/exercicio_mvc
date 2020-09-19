package mvcEndereco;

public class EnderecoController {
	
	private Endereco model;
	private EnderecoView view;
	
	public EnderecoController(Endereco model, EnderecoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setFkCliente(int fkCliente) {
		model.setFkCliente(fkCliente);
	}
	
	public int getFkCliente() {
		return model.getFkCliente();
	}
	
	public void setRua(String rua) {
		model.setRua(rua);
	}
	
	public String getRua() {
		return model.getRua();
	}
	
	public void setNumero(String numero) {
		model.setNumero(numero);
	}
	
	public String getNumero() {
		return model.getNumero();
	}
	
	public void setBairro(String bairro) {
		model.setBairro(bairro);
	}
	
	public String getBairro() {
		return model.getBairro();
	}
	
	public void setCidade(String cidade) {
		model.setCidade(cidade);
	}
	
	public String getCidade() {
		return model.getCidade();
	}
	
	public void setEstado(String estado) {
		model.setEstado(estado);
	}
	
	public void atualizarView() {
		view.imprimeEndereco(model.getFkCliente(), model.getRua(), model.getNumero(), model.getBairro(), model.getCidade(), model.getEstado());
	}
}
