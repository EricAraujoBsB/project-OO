package model;

public abstract class Doenca {
	protected String nome;
	protected String sintomas;
	protected String tratamento;
	protected String medicacao;
	
	//chamada de um contrutor super
	public Doenca() {
		super();
	}
	
	//GETs e SETs
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSintomas() {
		return sintomas;
	}
	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	public String getTratamento() {
		return tratamento;
	}
	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}
	public String getMedicacao() {
		return medicacao;
	}
	public void setMedicacao(String medicacao) {
		this.medicacao = medicacao;
	}
}
