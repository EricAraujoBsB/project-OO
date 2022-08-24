package viewer;
import javax.swing.*;

public class Telas {

	public Telas(){
		JFrame tela = new JFrame("Dor de Cabe�a");
		
		JLabel total=new JLabel("Total de Entradas");
		total.setBounds(150, 10, 100, 50);
		tela.add(total);
		
		JLabel duracao=new JLabel("Dura��o M�dia da Dor");
		duracao.setBounds(140, 150, 150, 50);
		tela.add(duracao);
		
		JLabel intensidade=new JLabel("Intensidade M�dia da Dor");
		intensidade.setBounds(130, 310, 150, 50);
		tela.add(intensidade);
		
		JButton reg=new JButton("Registrar");
		reg.setBounds(150, 550, 100, 50);
		tela.add(reg);
				
		tela.setSize(450,700);
		tela.setLayout(null);
		tela.setVisible(true);
		
		JFrame tela2 = new JFrame("Registrar");
		tela2.setSize(450,700);
		tela2.setLayout(null);
		
		JLabel data = new JLabel("Data");
		JTextField data_in = new JTextField(" ");
		JLabel hora = new JLabel("Hora");
		JLabel tempo = new JLabel("Tempo de Dura��o");
		JLabel inten = new JLabel("Intensidade da Dor");
		JLabel local = new JLabel("Local da Dor");
		JLabel causa = new JLabel("Prov�vel Causa");
		JLabel med = new JLabel("Medica��o");
		data.setBounds(50,8, 100, 100);
		data_in.setBounds(50, 100, 100, 15);
		hora.setBounds(250,8, 100, 100);
		tempo.setBounds(120, 110, 120, 100);
		inten.setBounds(120, 210, 120, 100);
		local.setBounds(130, 310, 120, 100);
		causa.setBounds(120, 410, 120, 100);
		med.setBounds(130, 510, 120, 100);
		tela2.add(data);
		tela2.add(hora);
		tela2.add(tempo);
		tela2.add(inten);
		tela2.add(local);
		tela2.add(causa);
		tela2.add(med);
		tela2.add(data_in);

		tela2.setVisible(true);

	}
	public static void main(String[] args) {
		new Telas();		
	}
}
