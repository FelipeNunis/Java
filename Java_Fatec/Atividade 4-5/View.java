package Recurso;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View implements ActionListener {
	
	private JFrame tela;
	
	private JButton botao;
	
	private JPanel panel;
	private JLabel label;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	
	private JTextField campo;
	private JTextField campo2;
	private JTextField campo3;
	private JTextField campo4;
	private JTextField campo5;
	


	public View() {
		
		tela = new JFrame();
		
		botao = new JButton("Monte o seu sapato");
		botao.addActionListener(this);
		
		label  = new JLabel ("Tamanho");
		label2 = new JLabel ("Cor");
		label3 = new JLabel ("Marca");
		label4 = new JLabel ("Tipo");
		label5 = new JLabel ("Material");
		
		campo  = new JTextField();
		campo2 = new JTextField();
		campo3 = new JTextField();
		campo4 = new JTextField();
		campo5 = new JTextField();
		
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
		panel.setLayout(new GridLayout(0,2));
		panel.add(label);
		panel.add(campo);
		panel.add(label2);
		panel.add(campo2);
		panel.add(label3);
		panel.add(campo3);
		panel.add(label4);
		panel.add(campo4);
		panel.add(label5);
		panel.add(campo5);

		panel.add(botao);
		
		
		tela.add(panel, BorderLayout.CENTER);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Sapatos");
		tela.pack();
		tela.setVisible(true);
		tela.setLocationRelativeTo(null);
		
	}
	
	public static void main(String[] args) {
	
		new View();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null, "Seu sapato montado \n" + "Tamanho: " + campo.getText() + "\n" + "Cor: " + campo2.getText() + "\n"  + "Marca: " + campo3.getText() + "\n"  + "Tipo: " + campo4.getText() + "\n" + "Material: " + campo5.getText());
		System.exit(0);
	}

}
