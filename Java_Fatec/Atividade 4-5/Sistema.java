package recurso;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Sistema extends JFrame {
	
	ImageIcon solar = new ImageIcon(getClass().getResource("solar.jpg"));
	JLabel sol = new JLabel();
	JLabel mer = new JLabel();
	JLabel ven = new JLabel();
	JLabel ter = new JLabel();
	JLabel mar = new JLabel();
	JLabel jup = new JLabel();
	JLabel sat = new JLabel();
	JLabel ura = new JLabel();
	JLabel net = new JLabel();

	
	public Sistema() {
		tela();
		
		//
		sol.setBounds(0, 120, 66, 125);
		sol.addMouseListener(new MouseListener() {
			@Override
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "O Sol\nmassa: 1,9891 × 10^30 kg\nTemperatura: 5504.85 C\nPeríodo de rotação: 25,38 dias\nDistância: 149 Milhões de KM\nIdade: 4.6 Bilhões de anos");
			}
		});
		//
		mer.setBounds(90, 185, 30, 27);
		mer.addMouseListener(new MouseListener() {
			@Override
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Mercurio\nmassa: 3,3011 × 10^23 kg\nTemperatura média: 166,85 C\nPeríodo de rotação: 58,646 dias\nDistância: 116.44 Milhões de KM\nIdade: 4.5 Bilhões de anos");
			}
		});
		//
		ven.setBounds(120, 175, 43, 43);
		ven.addMouseListener(new MouseListener() {
			@Override
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Vênus\nmassa: 4.867 × 10^24 kg\nTemperatura: 482° C\nPeríodo de rotação: 243 dias\nDistância: 173.43 Milhões de KM\nIdade: 4.5 Bilhões de anos");
			}
		});
		//
		ter.setBounds(165, 175, 50, 50);
		ter.addMouseListener(new MouseListener() {
			@Override
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Terra\nmassa: 5.972 × 10^24 kg\nTemperatura média: 14 C \nPeríodo de rotação: 1 dia\nDistância: 0 m\nIdade: 4.5 Bilhões de anos");
			}
		});
		//
		mar.setBounds(225, 180, 40, 40);
		mar.addMouseListener(new MouseListener() {
			@Override
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Marte\nmassa: 6.418 x 10^23 kg\nTemperatura média: −63 C \nPeríodo de rotação: 1 dia\nDistância: 63.954 Milhões de KM\nIdade: 4.6 Bilhões de anos");
			}
		});
		//
		jup.setBounds(275, 160, 80, 80);
		jup.addMouseListener(new MouseListener() {
			@Override
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Jupiter\nmassa: 1.898 × 10^27 kg\nTemperatura média: -110 C \nPeríodo de rotação: 9,8 horas\nDistância: 757.74 Milhões de KM\nIdade: 4.5 Bilhões de anos");
			}
		});
		//
		sat.setBounds(375, 160, 75, 75);
		sat.addMouseListener(new MouseListener() {
			@Override
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Saturno\nmassa: 5.683 × 10^26 kg\nTemperatura média: -139 C \nPeríodo de rotação: 10h 34min\nDistância: 1.4738 Bilhões de KM\nIdade: 4.5 Bilhões de anos");
			}
		});
		//
		ura.setBounds(480, 180, 45, 45);
		ura.addMouseListener(new MouseListener() {
			@Override
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Urano\nmassa: 8.681 × 10^25 kg\nTemperatura média: -220 C \nPeríodo de rotação: 17h 14 min\nDistância: 2.8172 Bilhões de KM\nIdade: 4.5 Bilhões de anos");
			}
		});
		//
		net.setBounds(578, 180, 45, 45);
		net.addMouseListener(new MouseListener() {
			@Override
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Netuno\nmassa: 1.024 × 10^26  kg\nTemperatura média: −223,15 C \nPeríodo de rotação: 16 h 6 min\nDistância: 4.3 Bilhões de KM\nIdade: 4.5 Bilhões de anos");
			}
		});
		//
		
		
	}
	
	public void tela () {
		
		
		setTitle("Sistema Solar");
		add(sol);
		add(mer);
		add(ven);
		add(ter);
		add(mar);
		add(jup);
		add(sat);
		add(ura);
		add(net);
		setSize(640,455);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		Panel painel = new Panel();
		painel.setLayout(new BorderLayout());
		add(painel);
		
		
	}

	
	
	public static void main(String[] args) {
		 new Sistema();

	}
   
	public class Panel extends JPanel {
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Image img = solar.getImage();
			g.drawImage(img,0,0, this);
		}
		
	}
}
