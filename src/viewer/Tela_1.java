package viewer;
import javax.swing.*;

public class Tela_1 extends JFrame {
	
	
	public Tela_1(){
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
	}
	public static void main(String[] args) {
		new Tela_1();		
	}
	
}
