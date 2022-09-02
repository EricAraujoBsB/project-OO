package model;

public class Dor_de_Cabeca extends Doenca {
	private int intensidade;
	private String local;
	private String causa_provavel;
	

	//sobrecarga do construtor
	public Dor_de_Cabeca(String n, String s, String t, String m, int i, String l, String c) {
		nome = n;
		sintomas = s;
		tratamento = t;
		medicacao = m;
		intensidade = i;
		local = l;
		causa_provavel = c;
		
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
	public int getIntensidade() {
		return intensidade;
	}
	public void setIntensidade(int intensidade) {
		this.intensidade = intensidade;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getCausa_provavel() {
		return causa_provavel;
	}
	public void setCausa_provavel(String causa) {
		this.causa_provavel = causa;
	}
	
	//metodos
	public void definir_dor() {
		
	}
}
