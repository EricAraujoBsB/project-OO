package viewer;
import javax.swing.*;

public class Telas {

	public Telas(){
		JFrame tela = new JFrame("Dor de Cabeça");
		
		JLabel total=new JLabel("Total de Entradas");
		total.setBounds(150, 10, 100, 50);
		tela.add(total);
		
		JLabel duracao=new JLabel("Duração Média da Dor");
		duracao.setBounds(140, 150, 150, 50);
		tela.add(duracao);
		
		JLabel intensidade=new JLabel("Intensidade Média da Dor");
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
		data_in.setBounds(50, 70, 100, 25);
		data.setBounds(50,8, 100, 100);
		tela2.add(data);
		tela2.add(data_in);

		JLabel hora = new JLabel("Hora");
		JTextField hora_in = new JTextField(" ");
		hora_in.setBounds(250, 70, 100, 25);
		hora.setBounds(250,8, 100, 100);
		tela2.add(hora);
		tela2.add(hora_in);

		JLabel tempo = new JLabel("Tempo de Duração");
		JTextField duracao_in = new JTextField(" ");
		duracao_in.setBounds(130, 170, 100, 25);
		tempo.setBounds(125, 110, 120, 100);
		tela2.add(tempo);
		tela2.add(duracao_in);

		JLabel inten = new JLabel("Intensidade da Dor");
		inten.setBounds(120, 210, 120, 100);
		String[] n_inten = new String[10];
		n_inten[0] = "1";
		n_inten[1] = "2";
		n_inten[2] = "3";
		n_inten[3] = "4";
		n_inten[4] = "5";
		n_inten[5] = "6";
		n_inten[6] = "7";
		n_inten[7] = "8";
		n_inten[8] = "9";
		n_inten[9] = "10";
		JList intens = new JList<>(n_inten);
		intens.setBounds(115, 270, 120, 30);
		tela2.add(inten);
		tela2.add(intens);

		JLabel local = new JLabel("Local da Dor");
		local.setBounds(130, 310, 120, 100);
		tela2.add(local);

		JLabel causa = new JLabel("Provável Causa");
		causa.setBounds(120, 410, 120, 100);
		tela2.add(causa);

		JLabel med = new JLabel("Medicação");
		med.setBounds(130, 510, 120, 100);
		tela2.add(med);
		
		tela2.setVisible(true);

	}
	public static void main(String[] args) {
		new Telas();		
	}
}
