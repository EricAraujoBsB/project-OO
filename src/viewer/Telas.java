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
		String[] n_inten = {"1","2","3","4","5","6","7","8","9","10"};
		JList list_intens = new JList<>(n_inten);
		list_intens.setBounds(115, 270, 120, 30);
		tela2.add(inten);
		tela2.add(list_intens);

		JLabel local = new JLabel("Local da Dor");
		local.setBounds(130, 310, 120, 100);
		String[] locals = {};
		JList list_locals = new JList<>(locals);
		list_locals.setBounds(115, 370, 120, 30);
		tela2.add(local);
		tela2.add(list_locals);

		JLabel causa = new JLabel("Provável Causa");
		causa.setBounds(120, 410, 120, 100);
		String[] causes ={};
		JList list_causes = new JList<>(causes);
		list_causes.setBounds(115, 470, 120, 30);
		tela2.add(causa);
		tela2.add(list_causes);

		JLabel med = new JLabel("Medicação");
		med.setBounds(130, 510, 120, 100);
		String[] medicines ={};
		JList list_medicines = new JList<>(medicines);
		list_medicines.setBounds(115, 570, 120, 30);
		tela2.add(med);
		tela2.add(list_medicines);

		tela2.setVisible(true);

	}
	public static void main(String[] args) {
		new Telas();		
	}
}
