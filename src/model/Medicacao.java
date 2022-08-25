package model;

public class Medicacao {
	private String nome;
	private Doenca doenca;
	private String hora_medicacao;
	
	//construtor
	public Medicacao(String n, Doenca d, String h) {
		nome = n;
		doenca = d;
		hora_medicacao = h;
	}
	
	//GETs e SETs
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Doenca getDoenca() {
		return doenca;
	}
	public void setDoenca(Doenca d) {
		this.doenca = d;
	}
	public String getHoraMedicacao() {
		return hora_medicacao;
	}
	public void setHoraMedicacao(String h) {
		this.hora_medicacao = h;
	}
	public void definir_hora_medicacao() {
		
	}
}
