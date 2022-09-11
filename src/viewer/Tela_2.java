package viewer;

import javax.swing.*;

public class Tela_2 extends JFrame {

	public Tela_2() {
		JFrame tela2 = new JFrame("Registrar");
		tela2.setSize(450, 700);
		tela2.setLayout(null);

		JLabel data = new JLabel("Data");
		JTextField data_in = new JTextField(" ");
		data_in.setBounds(50, 70, 100, 25);
		data.setBounds(50, 8, 100, 100);
		tela2.add(data);
		tela2.add(data_in);

		JLabel hora = new JLabel("Hora");
		JTextField hora_in = new JTextField(" ");
		hora_in.setBounds(250, 70, 100, 25);
		hora.setBounds(250, 8, 100, 100);
		tela2.add(hora);
		tela2.add(hora_in);

		JLabel tempo = new JLabel("Tempo de Dura��o");
		JTextField duracao_in = new JTextField(" ");
		duracao_in.setBounds(50, 175, 100, 25);
		tempo.setBounds(50, 110, 120, 100);
		tela2.add(tempo);
		tela2.add(duracao_in);

		JLabel inten = new JLabel("Intensidade da Dor");
		JLabel num = new JLabel("(1 a 10)");
		inten.setBounds(250, 110, 120, 100);
		num.setBounds(280, 123, 120, 100);
		JTextField intens_in = new JTextField(" ");
		intens_in.setBounds(285, 185, 30, 30);
		tela2.add(inten);
		tela2.add(num);
		tela2.add(intens_in);

		JLabel local = new JLabel("Local da Dor");
		local.setBounds(60, 210, 120, 100);
		String[] locals = { "Ambas laterais", "Atras dos olhos", "Lado Direito", "Lado Esquerdo", "Nuca", "Testa" };
		JList list_locals = new JList<>(locals);
		list_locals.setBounds(50, 270, 120, 110);
		tela2.add(local);
		tela2.add(list_locals);

		JLabel causa = new JLabel("Provavel Causa");
		causa.setBounds(255, 210, 120, 100);
		String[] causes = { "Estresse", "Odores Fortes", "TPM", "Sono Irregular" };
		JList list_causes = new JList<>(causes);
		list_causes.setBounds(245, 270, 120, 100);
		tela2.add(causa);
		tela2.add(list_causes);

		 JLabel sint = new JLabel("Sintomas"); 
		 sint.setBounds(60, 350, 120, 100);
		 String[] sintomas = {"náusea", "febre", "cansaço", "desmaio", "tontura"};
		 JList list_sintomas = new JList<>(sintomas); 
		 list_sintomas.setBounds(50, 410, 120, 110); 
		 tela2.add(sint); 
		 tela2.add(list_sintomas);
		 
		 JLabel trat = new JLabel("Tratamento recomendavel"); 
		 trat.setBounds(255, 350, 120, 100); 
		 String[] tratamento ={"repouso", "compressa de água morna","tomou chás ou remedios caseiros", "Sono Irregular"};
		 JList list_tratamento = new JList<>(tratamento); 
		 list_tratamento.setBounds(245,410, 120, 100);
		 tela2.add(trat); 
		 tela2.add(list_tratamento);

		 
		 JLabel med = new JLabel("Medicacao"); med.setBounds(170, 480, 120, 100);
		 String[] medicines = { "Paracetamol", "Dipiroma" }; 
		 JList list_medicines = new JList<>(medicines); 
		 list_medicines.setBounds(145, 550, 120, 35);
		 tela2.add(med); tela2.add(list_medicines);
		 
		 
		JButton sub = new JButton("Submit");
		sub.setBounds(150, 620, 100, 50);
		tela2.add(sub);

		tela2.setVisible(true);
	}

	public static void main(String[] args) {
		new Tela_2();
	}
}
