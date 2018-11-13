import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI{
	private JFrame win;
	private JTextField volumen,area;
	private JLabel vol,are, empty1, empty2;
	private JButton solve;
	
	public GUI() {
		win = new JFrame("Optimizacion");
		win.setDefaultCloseOperation(win.EXIT_ON_CLOSE);
		win.setLocationRelativeTo(null);
		win.setSize(new Dimension(600,400));
		win.setResizable(false);
		
		JPanel d = new JPanel();
		JPanel i = new JPanel();
		
		i.setBackground(Color.LIGHT_GRAY);
		
		i.setPreferredSize(new Dimension(300,300));
		d.setPreferredSize(new Dimension(300,400));
		
		empty1 = new JLabel("");
		empty2 = new JLabel("");
		
		are = new JLabel("  Area:");
		are.setFont(new Font(are.getFont().getFontName(),Font.ITALIC,20));
		area = new JTextField();
		area.setPreferredSize(new Dimension(150,30));
		
		vol = new JLabel("Volumen:");
		vol.setFont(new Font(are.getFont().getFontName(),Font.ITALIC,20));
		volumen = new JTextField();
		volumen.setPreferredSize(new Dimension(150,30));
		
		solve = new JButton("Calcular");
		
		i.add(empty1);
		i.add(empty2);
		
		i.add(are);
		i.add(area);
		
		i.add(vol);
		i.add(volumen);
		
		i.add(solve);
		
		win.add(i,BorderLayout.WEST);
		win.add(d,BorderLayout.EAST);
		
		win.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUI();
	}
}
