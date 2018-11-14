import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI{
	private JFrame win;
	private JTextField volumen,ancho, largo, side, ratio;
	private JLabel vol,anch, lar, lado, radio;
	private JButton solve1, solve2, solve3;
	
	public GUI() {
		win = new JFrame("Optimizacion");
		win.setDefaultCloseOperation(win.EXIT_ON_CLOSE);
		win.setLocationRelativeTo(null);
		win.setSize(new Dimension(600,400));
		win.setResizable(false);
		win.setLayout(new GridLayout(2,3));
		
		
		JPanel uno = new JPanel();
		JPanel dos = new JPanel();
		JPanel tres = new JPanel();
		PanelDibujo cuatro = new PanelDibujo();
		PanelDibujo cinco = new PanelDibujo();
		PanelDibujo seis = new PanelDibujo();
		
		
		
		uno.setBackground(Color.LIGHT_GRAY);
		dos.setBackground(Color.LIGHT_GRAY);
		tres.setBackground(Color.LIGHT_GRAY);
		cuatro.setBackground(Color.WHITE);
		cinco.setBackground(Color.WHITE);
		seis.setBackground(Color.WHITE);
		
		
		uno.setPreferredSize(new Dimension(30,30));
		dos.setPreferredSize(new Dimension(30,40));
		tres.setPreferredSize(new Dimension(30,40));
		cuatro.setPreferredSize(new Dimension(30,40));
		cinco.setPreferredSize(new Dimension(30,40));
		seis.setPreferredSize(new Dimension(30,40));
		
		
		anch = new JLabel("Ancho:");
		anch.setFont(new Font(anch.getFont().getFontName(),Font.ITALIC,20));
		ancho = new JTextField();
		ancho.setPreferredSize(new Dimension(150,30));
		
		lar = new JLabel("Largo :");
		lar.setFont(new Font(lar.getFont().getFontName(),Font.ITALIC,20));
		largo = new JTextField();
		largo.setPreferredSize(new Dimension(150,30));
		
		vol = new JLabel("Volumen:");
		vol.setFont(new Font(vol.getFont().getFontName(),Font.ITALIC,20));
		volumen = new JTextField();
		volumen.setPreferredSize(new Dimension(150,30));
		
		lado = new JLabel("Lado:");
		lado.setFont(new Font(lado.getFont().getFontName(),Font.ITALIC,18));
		side = new JTextField();
		side.setPreferredSize(new Dimension(150,30));
		
		radio = new JLabel("Radio:");
		radio.setFont(new Font(radio.getFont().getFontName(),Font.ITALIC,18));
		ratio = new JTextField();
		ratio.setPreferredSize(new Dimension(150,30));
		
		solve1 = new JButton("Calcular");
		solve1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				try {
				PrimerReto.NewtonRaphson(Double.parseDouble(volumen.getText()));
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(solve1, "Entrada de datos invalida", "Error", 0);
				}
				
			}
			
		});
		
		solve2 = new JButton("Calcular");
		solve2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				try {
					PrimerReto.quadraticFormula(Double.parseDouble(ancho.getText()), Double.parseDouble(largo.getText()));
					}
					catch(Exception e) {
						JOptionPane.showMessageDialog(solve2, "Entrada de datos invalida", "Error", 0);
					}
				
			}
			
		});
		
		solve3 = new JButton("Calcular");
		solve3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				try {
					PrimerReto.NewtonRaphson(Double.parseDouble(side.getText()), Double.parseDouble(ratio.getText()));
					}
					catch(Exception e) {
						JOptionPane.showMessageDialog(solve2, "Entrada de datos invalida", "Error", 0);
					}
				
			}
			
		});
		
		
		uno.add(vol);
		uno.add(volumen);
		uno.add(solve1);
		
		dos.add(anch);
		dos.add(ancho);
		dos.add(lar);
		dos.add(largo);
		dos.add(solve2);
		
		tres.add(lado);
		tres.add(side);
		tres.add(radio);
		tres.add(ratio);
		tres.add(solve3);
		
		win.add(uno);
		win.add(dos);
		win.add(tres);
		win.add(cuatro);
		win.add(cinco);
		win.add(seis);
		
		win.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUI();
	}
	
	class PanelDibujo extends JPanel{
		
		PanelDibujo(){
			
			
		}
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			
		}
	}
}
