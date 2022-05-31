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
		
		JProgressBar health2 = new JProgressBar();
		health2.setBackground(Color.RED);
		health2.setForeground(Color.GREEN);
		health2.setBounds(237, 198, 146, 14);
		scrn.add(health2);
		
		JLabel Char = new JLabel("");
		Char.setBounds(10, 28, 211, 225);
		scrn.add(Char);
		
		JLabel enemy = new JLabel("");
		enemy.setBounds(275, 10, 73, 169);
		scrn.add(enemy);
		
		JLabel bg = new JLabel("");
		bg.setBounds(5, 5, 410, 290);
		scrn.add(bg);
		
		JButton yes = new JButton("Yes");
		yes.setBounds(50, 505, 120, 120);
		frame.getContentPane().add(yes);
		
		JButton no = new JButton("No");
		no.setBounds(311, 505, 120, 120);
		frame.getContentPane().add(no);

		JButton ab1 = new JButton("Slash");
		ab1.setBounds(180, 435, 120, 120);
		frame.getContentPane().add(ab1);
		
		JButton ab2 = new JButton("Shield");
		ab2.setBounds(50, 505, 120, 120);
		frame.getContentPane().add(ab2);
		
		JButton ab3 = new JButton("New button");
		ab3.setBounds(311, 505, 120, 120);
		frame.getContentPane().add(ab3);
		
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
		
		JButton rtrn = new JButton("Return");
		rtrn.setBounds(180, 575, 120, 120);
		frame.getContentPane().add(rtrn);
		
		health.setVisible(false);
		health2.setVisible(false);
		yes.setVisible(false);
		ab1.setVisible(false);
		ab2.setVisible(false);
		ab3.setVisible(false);
		no.setVisible(false);
		ft.setVisible(false);
		HP.setVisible(false);
		run.setVisible(false);
		quit.setVisible(false);
		rtrn.setVisible(false);
		
		int hp = 100;
		int hp2 = 100;
		
		on.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// makes health bar visible
				health.setVisible(true);
				health.setValue(hp);
				health2.setVisible(true);
				health2.setValue(hp2);
				// sets background to fight scene 1
				bg.setIcon(bg1);
				// makes characters appear
				Char.setIcon(char1);
				enemy.setIcon(enemy1);
				// gets rid of on button
				on.setVisible(false);
				//makes other buttons visible
				ft.setVisible(true);
				run.setVisible(true);
				quit.setVisible(true);
				HP.setVisible(true);
			}
		});
		
		ft.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				// makes main buttons invisible
				HP.setVisible(false);
				run.setVisible(false);
				ft.setVisible(false);
				quit.setVisible(false);
				// makes fight buttons visible
				ab1.setVisible(true);
				ab2.setVisible(true);
				ab3.setVisible(true);
				rtrn.setVisible(true);
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
				
			}
		});
		
		rtrn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// makes main buttons visible
				ft.setVisible(true);
				quit.setVisible(true);
				HP.setVisible(true);
				run.setVisible(true);
				// makes fight buttons invisible
				ab1.setVisible(false);
				ab2.setVisible(false);
				ab3.setVisible(false);
				rtrn.setVisible(false);
			}
		});
		
		quit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// sets bg to quit screen
				bg.setIcon(quit1);
				// changes buttons as needed
				HP.setVisible(false);
				run.setVisible(false);
				ft.setVisible(false);
				quit.setVisible(false);
				enemy.setIcon(null);
				Char.setIcon(null);
				health.setVisible(false);
				health2.setVisible(false);
				no.setVisible(true);
				yes.setVisible(true);
			}
		});
		
		yes.addActionListener(new ActionListener() 
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
		
		no.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// sets background to fight scene 1
				bg.setIcon(bg1);
				// makes characters appear
				Char.setIcon(char1);
				enemy.setIcon(enemy1);
				// makes main buttons visible
				ft.setVisible(true);
				quit.setVisible(true);
				HP.setVisible(true);
				run.setVisible(true);
				// makes hp bars visible
				health.setVisible(true);
				health2.setVisible(true);
				// makes confirmation buttons invisible
				no.setVisible(false);
				yes.setVisible(false);
			}
		});
		
	}
}