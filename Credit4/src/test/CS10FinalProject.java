package test;

import java.awt.EventQueue;

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
		
		JPanel hpbar = new JPanel();
		hpbar.setBackground(SystemColor.menu);
		hpbar.setBounds(30, 50, 100, 10);
		scrn.add(hpbar);
		hpbar.setLayout(null);
		
		JPanel hp1 = new JPanel();
		hp1.setBackground(SystemColor.menu);
		hp1.setBounds(0, 0, 10, 10);
		hpbar.add(hp1);
		
		JPanel hp2 = new JPanel();
		hp2.setBackground(SystemColor.menu);
		hp2.setBounds(10, 0, 10, 10);
		hpbar.add(hp2);
		
		JPanel hp3 = new JPanel();
		hp3.setBackground(SystemColor.menu);
		hp3.setBounds(20, 0, 10, 10);
		hpbar.add(hp3);
		
		JPanel hp4 = new JPanel();
		hp4.setBackground(SystemColor.menu);
		hp4.setBounds(30, 0, 10, 10);
		hpbar.add(hp4);
		
		JPanel hp5 = new JPanel();
		hp5.setBackground(SystemColor.menu);
		hp5.setBounds(40, 0, 10, 10);
		hpbar.add(hp5);
		
		JPanel hp6 = new JPanel();
		hp6.setBackground(SystemColor.menu);
		hp6.setBounds(50, 0, 10, 10);
		hpbar.add(hp6);
		
		JPanel hp7 = new JPanel();
		hp7.setBackground(SystemColor.menu);
		hp7.setBounds(60, 0, 10, 10);
		hpbar.add(hp7);
		
		JPanel hp8 = new JPanel();
		hp8.setBackground(SystemColor.menu);
		hp8.setBounds(70, 0, 10, 10);
		hpbar.add(hp8);
		
		JPanel hp9 = new JPanel();
		hp9.setBackground(SystemColor.menu);
		hp9.setBounds(80, 0, 10, 10);
		hpbar.add(hp9);
		
		JPanel hp10 = new JPanel();
		hp10.setBackground(SystemColor.menu);
		hp10.setBounds(90, 0, 10, 10);
		hpbar.add(hp10);
		
		JPanel hpbar_1 = new JPanel();
		hpbar_1.setLayout(null);
		hpbar_1.setBackground(SystemColor.menu);
		hpbar_1.setBounds(287, 207, 100, 10);
		scrn.add(hpbar_1);
		
		JPanel hp1_1 = new JPanel();
		hp1_1.setBackground(SystemColor.menu);
		hp1_1.setBounds(0, 0, 10, 10);
		hpbar_1.add(hp1_1);
		
		JPanel hp2_1 = new JPanel();
		hp2_1.setBackground(SystemColor.menu);
		hp2_1.setBounds(10, 0, 10, 10);
		hpbar_1.add(hp2_1);
		
		JPanel hp3_1 = new JPanel();
		hp3_1.setBackground(SystemColor.menu);
		hp3_1.setBounds(20, 0, 10, 10);
		hpbar_1.add(hp3_1);
		
		JPanel hp4_1 = new JPanel();
		hp4_1.setBackground(SystemColor.menu);
		hp4_1.setBounds(30, 0, 10, 10);
		hpbar_1.add(hp4_1);
		
		JPanel hp5_1 = new JPanel();
		hp5_1.setBackground(SystemColor.menu);
		hp5_1.setBounds(40, 0, 10, 10);
		hpbar_1.add(hp5_1);
		
		JPanel hp6_1 = new JPanel();
		hp6_1.setBackground(SystemColor.menu);
		hp6_1.setBounds(50, 0, 10, 10);
		hpbar_1.add(hp6_1);
		
		JPanel hp7_1 = new JPanel();
		hp7_1.setBackground(SystemColor.menu);
		hp7_1.setBounds(60, 0, 10, 10);
		hpbar_1.add(hp7_1);
		
		JPanel hp8_1 = new JPanel();
		hp8_1.setBackground(SystemColor.menu);
		hp8_1.setBounds(70, 0, 10, 10);
		hpbar_1.add(hp8_1);
		
		JPanel hp9_1 = new JPanel();
		hp9_1.setBackground(SystemColor.menu);
		hp9_1.setBounds(80, 0, 10, 10);
		hpbar_1.add(hp9_1);
		
		JPanel hp10_1 = new JPanel();
		hp10_1.setBackground(SystemColor.menu);
		hp10_1.setBounds(90, 0, 10, 10);
		hpbar_1.add(hp10_1);
		
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
				HP.setText("rawr");
			}
		});
		
		on.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// sets background to fight scene 1
				bg.setIcon(bg1);
				// sets all hp bars to full
				hp1.setBackground(Color.green);
				hp2.setBackground(Color.green);
				hp3.setBackground(Color.green);
				hp4.setBackground(Color.green);
				hp5.setBackground(Color.green);
				hp6.setBackground(Color.green);
				hp7.setBackground(Color.green);
				hp8.setBackground(Color.green);
				hp9.setBackground(Color.green);
				hp10.setBackground(Color.green);
				// sets all enemy hp bars to full
				hp1_1.setBackground(Color.green);
				hp2_1.setBackground(Color.green);
				hp3_1.setBackground(Color.green);
				hp4_1.setBackground(Color.green);
				hp5_1.setBackground(Color.green);
				hp6_1.setBackground(Color.green);
				hp7_1.setBackground(Color.green);
				hp8_1.setBackground(Color.green);
				hp9_1.setBackground(Color.green);
				hp10_1.setBackground(Color.green);
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
				// makes hp bars invisible
				hp1.setBackground(Color.black);
				hp2.setBackground(Color.black);
				hp3.setBackground(Color.black);
				hp4.setBackground(Color.black);
				hp5.setBackground(Color.black);
				hp6.setBackground(Color.black);
				hp7.setBackground(Color.black);
				hp8.setBackground(Color.black);
				hp9.setBackground(Color.black);
				hp10.setBackground(Color.black);
				// makes enemy hp bars invisible
				hp1_1.setBackground(Color.black);
				hp2_1.setBackground(Color.black);
				hp3_1.setBackground(Color.black);
				hp4_1.setBackground(Color.black);
				hp5_1.setBackground(Color.black);
				hp6_1.setBackground(Color.black);
				hp7_1.setBackground(Color.black);
				hp8_1.setBackground(Color.black);
				hp9_1.setBackground(Color.black);
				hp10_1.setBackground(Color.black);
				// sets buttons to respective values
				HP.setText("Yes");
				run.setText("No");
				// changes buttons as needed
				ft.setVisible(false);
				quit.setVisible(false);
				enemy.setIcon(null);
				Char.setIcon(null);
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
						// sets all hp bars to full
						hp1.setBackground(Color.green);
						hp2.setBackground(Color.green);
						hp3.setBackground(Color.green);
						hp4.setBackground(Color.green);
						hp5.setBackground(Color.green);
						hp6.setBackground(Color.green);
						hp7.setBackground(Color.green);
						hp8.setBackground(Color.green);
						hp9.setBackground(Color.green);
						hp10.setBackground(Color.green);
						// sets all enemy hp bars to full
						hp1_1.setBackground(Color.green);
						hp2_1.setBackground(Color.green);
						hp3_1.setBackground(Color.green);
						hp4_1.setBackground(Color.green);
						hp5_1.setBackground(Color.green);
						hp6_1.setBackground(Color.green);
						hp7_1.setBackground(Color.green);
						hp8_1.setBackground(Color.green);
						hp9_1.setBackground(Color.green);
						hp10_1.setBackground(Color.green);
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
