// finalizar metodos rel
package model;

import java.util.*;

public class Relatorio {
	private String data;
	private String hora;
	private float duracao;
	private Dor_de_Cabeca dor;
	
	//construtor
	public Relatorio(String d, String h, float dur, Dor_de_Cabeca dor ) {
		data = d;
		hora = h;
		duracao = dur;
		this.dor = dor;
	}
	
	//GETs e SETs
	public String getData() {
		return data;
	}
	public void setData(String d) {
		this.data = d;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String t) {
		this.hora = t;
	}
	public float getDuracao() {
		return duracao;
	}
	public void setDuracao(float f) {
		this.duracao = f;
	}
	public Dor_de_Cabeca getDor() {
		return dor;
	}
	public void setDor(Dor_de_Cabeca d) {
		this.dor = d;
	}
	
	//metodos
	public void registrar_entrada() {
		
	}
	public void editar_entrada() {
		
	}
	public void excluir_entrada() {
		
	}
}
