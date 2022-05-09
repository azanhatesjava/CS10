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
				// sets buttons to respective values
				HP.setText("Yes");
				run.setText("No");
				ft.setVisible(false);
				quit.setVisible(false);
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
						System.exit(0);
					}
				});
				run.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e)
					{
						
					}
				});
			}
		});
		quit.setBounds(180, 575, 120, 120);
		frame.getContentPane().add(quit);
	}
}
