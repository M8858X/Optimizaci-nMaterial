import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI{
	private JFrame win;
	private JTextField volumen,area;
	private JLabel vol,are;
	
	public GUI() {
		win = new JFrame("Optimizacion");
		win.setDefaultCloseOperation(win.EXIT_ON_CLOSE);
		win.setLocationRelativeTo(null);
		win.setSize(new Dimension(600,400));
		win.setResizable(false);
		
		JPanel d = new JPanel();
		JPanel i = new JPanel(new GridLayout(2,2));
		
		i.setPreferredSize(new Dimension(300,400));
		d.setPreferredSize(new Dimension(300,400));
		
		are = new JLabel("Area");
		area = new JTextField();
		area.setSize(new Dimension(20,5));
		
		vol = new JLabel("Volumen:");
		volumen = new JTextField();
		volumen.setSize(new Dimension(20,5));
		
		i.add(are);
		i.add(area);
		
		i.add(vol);
		i.add(volumen);
		
		win.add(i,BorderLayout.WEST);
		win.add(d,BorderLayout.EAST);
		
		win.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUI();
	}
}
