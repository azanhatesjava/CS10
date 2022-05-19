package test;

import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JProgressBar;

public class CS10FinalProject {

	private JFrame frame;

	ImageIcon bg1 = new ImageIcon("C:\\Users\\16365506\\git\\CS10\\Credit5\\src\\bg1.png");
	ImageIcon quit1 = new ImageIcon("C:\\Users\\16365506\\git\\CS10\\Credit5\\src\\quit1.png");
	ImageIcon char1 = new ImageIcon("C:\\Users\\16365506\\git\\CS10\\Credit5\\src\\char.png");
	ImageIcon enemy1 =  new ImageIcon("C:\\Users\\16365506\\git\\CS10\\Credit5\\src\\enemy.png");
	
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
		
		JProgressBar health = new JProgressBar();
		health.setBackground(Color.RED);
		health.setForeground(Color.GREEN);
		health.setBounds(55, 50, 146, 14);
		scrn.add(health);
		health.setVisible(false);
		
		JLabel enemy = new JLabel("");
		enemy.setBounds(300, 15, 73, 169);
		scrn.add(enemy);
		
		JLabel Char = new JLabel("");
		Char.setBounds(10, 28, 211, 225);
		scrn.add(Char);
		
		JLabel bg = new JLabel("");
		bg.setBounds(5, 5, 410, 290);
		scrn.add(bg);
		
		JButton HP = new JButton("HP Potion");
		HP.setBounds(50, 505, 120, 120);
		frame.getContentPane().add(HP);
		
		JButton ft = new JButton("Fight");
		ft.setBounds(180, 435, 120, 120);
		frame.getContentPane().add(ft);
		
		JButton run = new JButton("Run");
		run.setBounds(311, 505, 120, 120);
		frame.getContentPane().add(run);
		
		JButton on = new JButton("ON");
		on.setBounds(356, 363, 90, 23);
		frame.getContentPane().add(on);
		
		JButton quit = new JButton("Quit");
		quit.setBounds(180, 575, 120, 120);
		frame.getContentPane().add(quit);
		
		
		
		ft.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				HP.setText("Ability");
				run.setText("Ability");
				ft.setText("Ability");
				quit.setText("Return");
				quit.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e)
					{
						HP.setText("HP Potion");
						run.setText("Run");
						ft.setText("Fight");
						quit.setText("Quit");
					}
				});
				
			}
		});
		

		run.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		
		HP.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				HP.setText("test");
			}
		});
		
		on.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// makes health bar visible
				health.setVisible(true);
				health.setValue(100);
				// sets background to fight scene 1
				bg.setIcon(bg1);
				// makes characters appear
				Char.setIcon(char1);
				enemy.setIcon(enemy1);
				// gets rid of on button
				on.setVisible(false);
			}
		});
		quit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// sets bg to quit screen
				bg.setIcon(quit1);
				// sets buttons to respective values
				HP.setText("Yes");
				run.setText("No");
				// changes buttons as needed
				ft.setVisible(false);
				quit.setVisible(false);
				enemy.setIcon(null);
				Char.setIcon(null);
				health.setVisible(false);
				HP.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e)
					{
						//puts program to sleep
						try 
						{
							Thread.sleep(1500);
						} catch (InterruptedException e1) 
						{
							e1.printStackTrace();
						}	
						System.exit(0); // ends program
					}
				});
				run.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e)
					{
						// sets background to fight scene 1
						bg.setIcon(bg1);
						// makes characters appear
						Char.setIcon(char1);
						enemy.setIcon(enemy1);
						// changes buttons as needed
						ft.setVisible(true);
						quit.setVisible(true);
						HP.setText("HP Potion");
						run.setText("Run");
					}
				});
			}
		});
	}
}