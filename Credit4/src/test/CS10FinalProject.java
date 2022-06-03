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
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

public class CS10FinalProject {

	private JFrame frame;

	ImageIcon bg1 = new ImageIcon("C:\\Users\\drago\\git\\CS10\\Credit5\\src\\bg1.png");
	ImageIcon quit1 = new ImageIcon("C:\\Users\\drago\\git\\CS10\\Credit5\\src\\quit1.png");
	ImageIcon quit2 = new ImageIcon("C:\\Users\\drago\\git\\CS10\\Credit5\\src\\quit2.png");
	ImageIcon dead =  new ImageIcon("C:\\Users\\drago\\git\\CS10\\Credit5\\src\\dead.jpg");
	ImageIcon win =  new ImageIcon("C:\\Users\\drago\\git\\CS10\\Credit5\\src\\win.png");
	ImageIcon run = new ImageIcon("C:\\Users\\drago\\git\\CS10\\Credit5\\src\\run.png");
	ImageIcon char1 = new ImageIcon("C:\\Users\\drago\\git\\CS10\\Credit5\\src\\char.png");
	ImageIcon enemy1 =  new ImageIcon("C:\\Users\\drago\\git\\CS10\\Credit5\\src\\enemy.png");
	ImageIcon slash = new ImageIcon("C:\\Users\\drago\\git\\CS10\\Credit5\\src\\slash.png");
	ImageIcon BlueBullet = new ImageIcon("C:\\Users\\drago\\git\\CS10\\Credit5\\src\\BlueBullet.png");
	
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
		health.setValue(100);
		health.setStringPainted(true);
		health.setBackground(Color.RED);
		health.setForeground(Color.GREEN);
		health.setBounds(55, 50, 146, 14);
		health.setVisible(false);
		scrn.add(health);
		
		JProgressBar health2 = new JProgressBar();
		health2.setValue(100);
		health2.setStringPainted(true);
		health2.setBackground(Color.RED);
		health2.setForeground(Color.GREEN);
		health2.setBounds(237, 198, 146, 14);
		health2.setVisible(false);
		scrn.add(health2);
		
		JProgressBar mana = new JProgressBar();
		mana.setValue(50);
		mana.setBackground(Color.LIGHT_GRAY);
		mana.setForeground(Color.CYAN);
		mana.setBounds(55, 63, 146, 5);
		mana.setVisible(false);
		scrn.add(mana);
		
		JLabel BBeffect = new JLabel("");
		BBeffect.setBounds(127, 11, 180, 222);
		scrn.add(BBeffect);
		
		JLabel Char = new JLabel("");
		Char.setBounds(10, 28, 211, 225);
		scrn.add(Char);
		
		JLabel effect = new JLabel("");
		effect.setBounds(110, 37, 180, 222);
		scrn.add(effect);
		
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
		
		JButton ab3 = new JButton("Spells");
		ab3.setBounds(311, 505, 120, 120);
		frame.getContentPane().add(ab3);
		
		JButton rtrn = new JButton("Return");
		rtrn.setBounds(180, 575, 120, 120);
		frame.getContentPane().add(rtrn);
		
		JButton sp1 = new JButton("Spell 1");
		sp1.setBounds(180, 435, 120, 120);
		frame.getContentPane().add(sp1);
		
		JButton sp2 = new JButton("Spell 2");
		sp2.setBounds(50, 505, 120, 120);
		frame.getContentPane().add(sp2);
		
		JButton sp3 = new JButton("Spell 3");
		sp3.setBounds(311, 505, 120, 120);
		frame.getContentPane().add(sp3);
		
		JButton rtrn2 = new JButton("Return");
		rtrn2.setBounds(180, 575, 120, 120);
		frame.getContentPane().add(rtrn2);
		
		JButton HP = new JButton("HP Potion");
		HP.setBounds(50, 505, 120, 120);
		frame.getContentPane().add(HP);
		
		JButton ft = new JButton("Fight");
		ft.setBounds(180, 435, 120, 120);
		frame.getContentPane().add(ft);
		
		JButton rn = new JButton("Run");
		rn.setBounds(311, 505, 120, 120);
		frame.getContentPane().add(rn);
		
		JButton on = new JButton("ON");
		on.setBounds(356, 363, 90, 23);
		frame.getContentPane().add(on);
		
		JButton qt = new JButton("Quit");
		qt.setBounds(180, 575, 120, 120);
		frame.getContentPane().add(qt);

		JButton usedHP = new JButton("HP Potion");
		usedHP.setBackground(Color.LIGHT_GRAY);
		usedHP.setBounds(50, 505, 120, 120);
		frame.getContentPane().add(usedHP);
		
		yes.setVisible(false);
		ab1.setVisible(false);
		ab2.setVisible(false);
		ab3.setVisible(false);
		no.setVisible(false);
		ft.setVisible(false);
		HP.setVisible(false);
		usedHP.setVisible(false);
		rn.setVisible(false);
		qt.setVisible(false);
		rtrn.setVisible(false);
		sp1.setVisible(false);
		sp2.setVisible(false);
		sp3.setVisible(false);
		rtrn2.setVisible(false);
		
		on.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// makes health bar visible
				health.setVisible(true);
				health2.setVisible(true);
				mana.setVisible(true);
				// sets background to fight scene 1
				bg.setIcon(bg1);
				// makes characters appear
				Char.setIcon(char1);
				enemy.setIcon(enemy1);
				// gets rid of on button
				on.setVisible(false);
				//makes other buttons visible
				ft.setVisible(true);
				rn.setVisible(true);
				qt.setVisible(true);
				HP.setVisible(true);
				usedHP.setVisible(true);
			}
		});
		
		rn.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e) 
			{
				bg.setIcon(run);
				HP.setVisible(false);
				usedHP.setVisible(false);
				rn.setVisible(false);
				ft.setVisible(false);
				qt.setVisible(false);
				enemy.setIcon(null);
				Char.setIcon(null);
				health.setVisible(false);
				health2.setVisible(false);
				mana.setVisible(false);
				Timer timer = new Timer();					
				TimerTask task = new TimerTask() 
				{
					public void run() 
					{
						int hp = health.getValue();
						hp = hp - 50;
						health.setValue(hp);
						// sets background to fight scene 1
						bg.setIcon(bg1);
						// makes characters appear
						Char.setIcon(char1);
						enemy.setIcon(enemy1);
						// makes main buttons visible
						ft.setVisible(true);
						qt.setVisible(true);
						HP.setVisible(true);
						usedHP.setVisible(true);
						rn.setVisible(true);
						// makes hp bars visible
						health.setVisible(true);
						health2.setVisible(true);
						
						int hp1 = health.getValue();
						
						if (hp1 <= 0)
						{
							bg.setIcon(dead);
							HP.setVisible(false);
							usedHP.setVisible(false);
							rn.setVisible(false);
							ft.setVisible(false);
							qt.setVisible(false);
							enemy.setIcon(null);
							Char.setIcon(null);
							effect.setIcon(null);
							health.setVisible(false);
							health2.setVisible(false);
							ab1.setVisible(false);
							ab2.setVisible(false);
							ab3.setVisible(false);
							rtrn.setVisible(false);
							mana.setVisible(false);
							
							Timer deathtimer = new Timer();
							
							TimerTask death = new TimerTask() 
							{
								public void run() 
								{
									System.exit(0);
								}
							};
									
							deathtimer.schedule(death, 1500);
						}
					}
				};
				timer.schedule(task, 1500);	
				
			}
		});
		
		HP.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int hp1 = health.getValue();
				hp1 = hp1 + 40;
				health.setValue(hp1);
				frame.remove(HP);
			}
		});
		
		ft.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				// makes main buttons invisible
				HP.setVisible(false);
				usedHP.setVisible(false);
				rn.setVisible(false);
				ft.setVisible(false);
				qt.setVisible(false);
				// makes fight buttons visible
				ab1.setVisible(true);
				ab2.setVisible(true);
				ab3.setVisible(true);
				rtrn.setVisible(true);
			}
		});
		ab1.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e) 
			{	
				//sets damage range from 10 - 20%
				int dmg1 = 11 + (int)(Math.random()*10);
				int hp2 = health2.getValue();
				int mana1 = mana.getValue();
				
				mana1 = mana1 + 10;
				mana.setValue(mana1);
				
				hp2 = hp2 - dmg1;
				health2.setValue(hp2);
				
				effect.setIcon(slash);
				
				Timer timerWait = new Timer();					
				TimerTask taskWait = new TimerTask() 
				{
					public void run() 
					{
						int dmg2 = 11 + (int)(Math.random()*10);
						int hp1 = health.getValue();
						hp1 = hp1 - dmg2;
						health.setValue(hp1);
						BBeffect.setIcon(BlueBullet);
						
						if (hp1 <= 0)
						{
							bg.setIcon(dead);
							HP.setVisible(false);
							usedHP.setVisible(false);
							rn.setVisible(false);
							ft.setVisible(false);
							qt.setVisible(false);
							enemy.setIcon(null);
							Char.setIcon(null);
							BBeffect.setIcon(null);
							health.setVisible(false);
							health2.setVisible(false);
							ab1.setVisible(false);
							ab2.setVisible(false);
							ab3.setVisible(false);
							rtrn.setVisible(false);
							mana.setVisible(false);
							
							Timer deathtimer = new Timer();
							
							TimerTask death = new TimerTask() 
							{
								public void run() 
								{
									System.exit(0);
								}
							};
									
							deathtimer.schedule(death, 900);
						}
						
						Timer timer = new Timer();					
						TimerTask task = new TimerTask() 
						{
							public void run() 
							{
								BBeffect.setIcon(null);

								HP.setVisible(true);
								usedHP.setVisible(true);
								ft.setVisible(true);
								rn.setVisible(true);	
								qt.setVisible(true);
								
							}
						};
						//timer for enemy attack disappear		
						timer.schedule(task, 900);	
					}
				};
				
				rtrn.setVisible(false);
				ab1.setVisible(false);
				ab2.setVisible(false);
				ab3.setVisible(false);
				
				//Timer for enemy attack		
				timerWait.schedule(taskWait, 1600);			

				Timer timer = new Timer();					
				TimerTask task = new TimerTask() 
				{
					public void run() 
					{
						effect.setIcon(null);
						
					}
				};
				//timer for sprite attack disappear			
				timer.schedule(task, 900);
				
				if (hp2 <=0)
				{
					bg.setIcon(win);
					HP.setVisible(false);
					usedHP.setVisible(false);
					rn.setVisible(false);
					ft.setVisible(false);
					qt.setVisible(false);
					enemy.setIcon(null);
					Char.setIcon(null);
					effect.setIcon(null);
					health.setVisible(false);
					health2.setVisible(false);
					ab1.setVisible(false);
					ab2.setVisible(false);
					ab3.setVisible(false);
					rtrn.setVisible(false);
					mana.setVisible(false);
					
					Timer wintimer = new Timer();
					
					TimerTask win = new TimerTask() 
					{
						public void run() 
						{
							System.exit(0);
						}
					};
							
					wintimer.schedule(win, 1500);
				}
			}
			
			
		});
		
		ab3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				// makes fight buttons invisible
				ab1.setVisible(false);
				ab2.setVisible(false);
				ab3.setVisible(false);
				rtrn.setVisible(false);
				// makes spell buttons visible
				sp1.setVisible(true);
				sp2.setVisible(true);
				sp3.setVisible(true);
				rtrn2.setVisible(true);
			}
		});
		
		rtrn2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// makes spell buttons invisible
				sp1.setVisible(false);
				sp2.setVisible(false);
				sp3.setVisible(false);
				rtrn2.setVisible(false);
				// makes fight buttons visible
				ab1.setVisible(true);
				ab2.setVisible(true);
				ab3.setVisible(true);
				rtrn.setVisible(true);
			}
		});
		
		rtrn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// makes main buttons visible
				ft.setVisible(true);
				qt.setVisible(true);
				HP.setVisible(true);
				usedHP.setVisible(true);
				rn.setVisible(true);
				// makes fight buttons invisible
				ab1.setVisible(false);
				ab2.setVisible(false);
				ab3.setVisible(false);
				rtrn.setVisible(false);
			}
		});
		
		qt.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// sets bg to quit screen
				bg.setIcon(quit1);
				// changes buttons as needed
				HP.setVisible(false);
				usedHP.setVisible(false);
				rn.setVisible(false);
				ft.setVisible(false);
				qt.setVisible(false);
				enemy.setIcon(null);
				Char.setIcon(null);
				health.setVisible(false);
				health2.setVisible(false);
				no.setVisible(true);
				yes.setVisible(true);
				mana.setVisible(false);
			}
		});
		
		yes.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				bg.setIcon(quit2);
				Timer timer = new Timer();
				
				TimerTask task = new TimerTask() 
				{
					public void run() 
					{
						System.exit(0);
					}
				};
						
				timer.schedule(task, 1500);	
			}
		});
		
		no.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// sets background to fight scene
				bg.setIcon(bg1);
				// makes characters appear
				Char.setIcon(char1);
				enemy.setIcon(enemy1);
				// makes main buttons visible
				ft.setVisible(true);
				qt.setVisible(true);
				HP.setVisible(true);
				usedHP.setVisible(true);
				rn.setVisible(true);
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