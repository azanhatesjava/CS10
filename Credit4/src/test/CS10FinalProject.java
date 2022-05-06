package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class CS10FinalProject {

	private JFrame frame;

	ImageIcon bg1 = new ImageIcon("C:\\Users\\16365506\\git\\CS10\\Credit5\\src\\bg1.png");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CS10FinalProject window = new CS10FinalProject();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CS10FinalProject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel scrn = new JPanel();
		scrn.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		scrn.setBounds(30, 52, 420, 300);
		frame.getContentPane().add(scrn);
		scrn.setLayout(null);
		
		JLabel bg = new JLabel("");
		bg.setBounds(5, 5, 410, 290);
		scrn.add(bg);
		
		JButton HP = new JButton("HP Potion");
		HP.setBounds(50, 505, 120, 120);
		frame.getContentPane().add(HP);
		
		JButton ft = new JButton("Fight");
		ft.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				bg.setIcon(bg1);
			}
		});
		ft.setBounds(180, 435, 120, 120);
		frame.getContentPane().add(ft);
		
		JButton run = new JButton("Run");
		run.setBounds(311, 505, 120, 120);
		frame.getContentPane().add(run);
		
		JButton quit = new JButton("Quit");
		quit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				bg.setIcon(bg1);
			}
		});
		quit.setBounds(180, 575, 120, 120);
		frame.getContentPane().add(quit);
	}
}
