package controller;
import model.*;

public class Tela_1_Controller {
	public boolean registrarEntrada(String data, String hora, int duracao, int intensidade, String local, String causa, String medicacao) {
		if(data != null && data.length() > 0 && hora != null && hora.length() >0 && duracao > 0 && intensidade > 0 && local != null && local.length()  > 0 && causa != null && causa.length() > 0 && medicacao != null && medicacao.length() > 0)) {
			/* Dor_de_Cabeca dor_de_Cabeca = new Dor_de_Cabeca */
			Dor_de_Cabeca.definir_dor(intensidade, local, causa, medicacao);
			
		}
	}
}
