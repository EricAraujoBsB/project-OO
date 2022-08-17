package model;

public class Dashboard {
	private int total_entradas;
	private int duracao_media;
	private int espacamento;
	private float intensidade_media;
	private int rel_mensal;
	private Dor_de_Cabeca dor_de_cabeca;
	
	//construtor
	public Dashboard(int t, int d, int e, float a, int r, Dor_de_Cabeca h) {
		total_entradas = t;
		duracao_media = d;
		espacamento = e;
		intensidade_media = a;
		rel_mensal = r;
		dor_de_cabeca = h;
	}
	//GETs e SETs
	public int getTotalEntradas() {
		return total_entradas;
	}
	public void setTotalEntradas(int total) {
		this.total_entradas = total;
	}
	public int getDuracaoMedia() {
		return duracao_media;
	}
	public void setDuracaoMedia(int duracao) {
		this.duracao_media = duracao;
	}
	public int getEspacamento() {
		return espacamento;
	}
	public void setEspacamento(int espacamento) {
		this.espacamento = espacamento;
	}
	public float getIntensidadeMedia() {
		return intensidade_media;
	}
	public void setIntensidadeMedia(float intensidade) {
		this.intensidade_media = intensidade;
	}
	public int getRelMensal() {
		return rel_mensal;
	}
	public void setRelMensal(int rel) {
		this.rel_mensal = rel;
	}
	public Dor_de_Cabeca getDorDeCabeca() {
		return dor_de_cabeca;
	}
	public void setDorDeCabeca(Dor_de_Cabeca dor) {
		this.dor_de_cabeca = dor;
	}
	
	//metodos
	public int cal_duracao_media() {
		return 0;
	}
	public int cal_intensidade_media() {
		return 0;
	}
	public int contabilizar_total() {
		return 0;
	}
}
