package viewer;
import javax.swing.*;

public class Tela_1 extends JFrame {
	
	public Tela_1(){
		JFrame tela = new JFrame("Dor de Cabeca");
		
		JLabel total=new JLabel("Total de Entradas");
		total.setBounds(150, 10, 100, 50);
		tela.add(total);
		
		
		JLabel t= new JLabel("10");
		t.setBounds(170, 70, 100, 50);
		tela.add(t);
		
		
		JLabel duracao=new JLabel("Duracao Media da Dor");
		duracao.setBounds(140, 150, 150, 50);
		tela.add(duracao);
		
		
		JLabel d= new JLabel("20 min");
		d.setBounds(140, 210, 150, 50);
		tela.add(d);
		
		
		JLabel intensidade=new JLabel("Intensidade Media da Dor");
		intensidade.setBounds(130, 310, 150, 50);
		tela.add(intensidade);
		
		
		JLabel i=new JLabel("7 pontos");
		i.setBounds(130, 370, 150, 50);
		tela.add(i);
		
		
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
