package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.JSlider;

public class CS10FinalProject 
{

	private JFrame frame;
	
	ImageIcon bg1 = new ImageIcon("C:/Users/16365506/git/CS10/Credit5/src/bg1.png");
	ImageIcon nmy1 = new ImageIcon("C:/Users/16365506/git/CS10/Credit5/src/Enemy.png");
	ImageIcon sprite = new ImageIcon("C:/Users/16365506/git/CS10/Credit5/src/Char.png");
	ImageIcon slash = new ImageIcon("C:/Users/16365506/git/CS10/Credit5/src/SLASH.png");
	ImageIcon quit = new ImageIcon("C:/Users/16365506/git/CS10/Credit5/src/quit1.png");
	ImageIcon BlueBullet = new ImageIcon("C:/Users/16365506/git/CS10/Credit5/src/BlueBullet.png");
	ImageIcon shield = new ImageIcon("C:/Users/16365506/git/CS10/Credit5/src/Shield.png");
	ImageIcon ShieldChar = new ImageIcon("C:/Users/16365506/git/CS10/Credit5/src/ShieldChar.png");
	ImageIcon Healing = new ImageIcon("C:/Users/16365506/git/CS10/Credit5/src/HealingEffect.png");
	ImageIcon Saiyan = new ImageIcon("C:/Users/16365506/git/CS10/Credit5/src/Saiyan.png");
	ImageIcon PowerChar = new ImageIcon("C:/Users/16365506/git/CS10/Credit5/src/PowerChar.png");
	ImageIcon win = new ImageIcon("C:/Users/16365506/git/CS10/Credit5/src/win.png");
	ImageIcon dead = new ImageIcon("C:/Users/16365506/git/CS10/Credit5/src/dead.jpg");
	ImageIcon run = new ImageIcon("C:/Users/16365506/git/CS10/Credit5/src/run.png");
	ImageIcon BlueStream = new ImageIcon("C:/Users/16365506/git/CS10/Credit5/src/BlueStream.png");
	ImageIcon FullSlash = new ImageIcon("C:/Users/16365506/git/CS10/Credit5/src/FullSlash.png");

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					CS10FinalProject window = new CS10FinalProject();
					window.frame.setVisible(true);
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CS10FinalProject() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton Start = new JButton("Start");
		Start.setBounds(364, 375, 89, 23);
		frame.getContentPane().add(Start);

		JButton fght = new JButton("Fight");
		fght.setBounds(174, 399, 125, 125);
		frame.getContentPane().add(fght);
		
		JButton hp = new JButton("HP");
		hp.setBounds(39, 463, 125, 125);
		frame.getContentPane().add(hp);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(33, 64, 420, 300);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		JLabel FullSlashIcon = new JLabel("");
		FullSlashIcon.setBounds(5, 5, 410, 290);
		panel_3.add(FullSlashIcon);
		
		JProgressBar mana = new JProgressBar();
		mana.setValue(50);
		mana.setBackground(Color.LIGHT_GRAY);
		mana.setForeground(Color.CYAN);
		mana.setBounds(20, 50, 146, 5);
		mana.setVisible(false);
		panel_3.add(mana);

		JProgressBar hpbar = new JProgressBar();
		hpbar.setValue(100);
		hpbar.setStringPainted(true);
		hpbar.setBackground(new Color(255, 0, 0));
		hpbar.setForeground(Color.GREEN);
		hpbar.setBounds(20, 37, 146, 14);
		panel_3.add(hpbar);
		
		JProgressBar hpbar1 = new JProgressBar();
		hpbar1.setValue(100);
		hpbar1.setStringPainted(true);
		hpbar1.setForeground(Color.GREEN);
		hpbar1.setBackground(Color.RED);
		hpbar1.setBounds(252, 201, 146, 14);
		panel_3.add(hpbar1);
		
		JLabel HealingEffect = new JLabel("");
		HealingEffect.setBounds(72, 97, 98, 107);
		panel_3.add(HealingEffect);
		
		JLabel BBeffect = new JLabel("");
		BBeffect.setBounds(128, 10, 180, 222);
		panel_3.add(BBeffect);

		JLabel Char = new JLabel("");
		Char.setBounds(10, 28, 211, 225);
		panel_3.add(Char);

		JLabel effect = new JLabel("");
		effect.setBounds(110, 37, 180, 222);
		panel_3.add(effect);

		JLabel ShieldEffect = new JLabel("");
		ShieldEffect.setBounds(86, 39, 117, 220);
		panel_3.add(ShieldEffect);
		
		JLabel Enemy = new JLabel("");
		Enemy.setBounds(296, 33, 65, 151);
		panel_3.add(Enemy);

		JLabel EnemyPowerUpAbility = new JLabel("");
		EnemyPowerUpAbility.setBounds(141, 66, 232, 165);
		panel_3.add(EnemyPowerUpAbility);
		
		JLabel EnemyPower = new JLabel("");
		EnemyPower.setBounds(193, -13, 239, 195);
		panel_3.add(EnemyPower);
		
		JLabel bg = new JLabel("");
		bg.setBounds(5, 5, 410, 290);
		panel_3.add(bg);
		
		JProgressBar powerup = new JProgressBar();
		powerup.setMaximum(2);
		powerup.setBounds(0, 0, 0, 0);
		panel_3.add(powerup);
		
		JProgressBar saiyan = new JProgressBar();
		saiyan.setMaximum(1);
		saiyan.setBounds(0, 0, 0, 0);
		panel_3.add(saiyan);
		
		JButton rn = new JButton("Run");
		rn.setBounds(309, 463, 125, 125);
		frame.getContentPane().add(rn);
		
		JButton yes = new JButton("Yes");
		yes.setBounds(39, 463, 125, 125);
		frame.getContentPane().add(yes);
		
		JButton no = new JButton("No");
		no.setBounds(309, 463, 125, 125);
		frame.getContentPane().add(no);
		
		JButton ab1 = new JButton("Slash");
		ab1.setBounds(39, 463, 125, 125);
		frame.getContentPane().add(ab1);
		
		JButton ab2 = new JButton("Shield");
		ab2.setBounds(309, 463, 125, 125);
		frame.getContentPane().add(ab2);
		
		JButton ab3 = new JButton("Power Up");
		ab3.setBounds(174, 399, 125, 125);
		frame.getContentPane().add(ab3);	
		
		JButton ab4 = new JButton("PowerSlash");
		ab4.setBounds(174, 399, 125, 125);
		frame.getContentPane().add(ab4);
		
		JButton ab3No = new JButton("No");
		ab3No.setBounds(309, 463, 125, 125);
		frame.getContentPane().add(ab3No);

		JButton qt = new JButton("Quit");
		qt.setBounds(174, 535, 125, 125);
		frame.getContentPane().add(qt);	

		JButton ab3Quit = new JButton("Quit");
		ab3Quit.setBounds(174, 535, 125, 125);
		frame.getContentPane().add(ab3Quit);
		
		JButton rtrn = new JButton("Return");
		rtrn.setBounds(174, 535, 125, 125);
		frame.getContentPane().add(rtrn);
		
		JButton FakeHp = new JButton("HP");
		FakeHp.setBackground(Color.GRAY);
		FakeHp.setForeground(SystemColor.inactiveCaptionText);
		FakeHp.setBounds(39, 463, 125, 125);
		frame.getContentPane().add(FakeHp);
				
		ab4.setVisible(false);
		FakeHp.setVisible(false);
		hp.setVisible(false);
		rn.setVisible(false);
		qt.setVisible(false);
		fght.setVisible(false);
		ab1.setVisible(false);
		ab2.setVisible(false);
		ab3.setVisible(false);
		yes.setVisible(false);
		no.setVisible(false);
		rtrn.setVisible(false);
		hpbar.setVisible(false);
		hpbar1.setVisible(false);
		powerup.setVisible(false);
		ab3Quit.setVisible(false);
		ab3No.setVisible(false);
		
		Start.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				bg.setIcon(bg1);
				Enemy.setIcon(nmy1);
				Char.setIcon(sprite);
				hp.setVisible(true);
				rn.setVisible(true);
				qt.setVisible(true);
				fght.setVisible(true);
				hpbar.setVisible(true);
				hpbar1.setVisible(true);
				Start.setVisible(false);
				FakeHp.setVisible(true);
				ab4.setVisible(true);
				ab3Quit.setVisible(false);
				ab3No.setVisible(false);
				mana.setVisible(true);

			}
		});	
		
		rn.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e) 
			{
				bg.setIcon(run);
				ab4.setVisible(false);
				FakeHp.setVisible(false);
				hp.setVisible(false);
				rn.setVisible(false);
				qt.setVisible(false);
				fght.setVisible(false);
				ab1.setVisible(false);
				ab2.setVisible(false);
				ab3.setVisible(false);
				yes.setVisible(false);
				no.setVisible(false);
				rtrn.setVisible(false);
				hpbar.setVisible(false);
				hpbar1.setVisible(false);
				powerup.setVisible(false);
				ab3Quit.setVisible(false);
				ab3No.setVisible(false);
				mana.setVisible(false);
				Enemy.setIcon(null);
				Char.setIcon(null);
				
				Timer timer = new Timer();					
				TimerTask task = new TimerTask() 
				{
					public void run() 
					{
						int hp1 = hpbar.getValue();
						hp1 = hp1 - 50;
						hpbar.setValue(hp1);
						// sets background to fight scene 1
						bg.setIcon(bg1);
						// makes characters appear
						Char.setIcon(sprite);
						Enemy.setIcon(nmy1);
						// makes main buttons visible
						fght.setVisible(true);
						qt.setVisible(true);
						hp.setVisible(true);
						rn.setVisible(true);
						// makes hp bars visible
						hpbar.setVisible(true);
						hpbar1.setVisible(true);
						mana.setVisible(true);
						
						
						
						if (hp1 <= 0)
						{
							ab4.setVisible(false);
							FakeHp.setVisible(false);
							hp.setVisible(false);
							rn.setVisible(false);
							qt.setVisible(false);
							fght.setVisible(false);
							ab1.setVisible(false);
							ab2.setVisible(false);
							ab3.setVisible(false);
							yes.setVisible(false);
							no.setVisible(false);
							rtrn.setVisible(false);
							hpbar.setVisible(false);
							hpbar1.setVisible(false);
							powerup.setVisible(false);
							ab3Quit.setVisible(false);
							ab3No.setVisible(false);
							Char.setVisible(false);
							mana.setVisible(false);
							Enemy.setVisible(false);
							effect.setVisible(false);
							BBeffect.setVisible(false);
							EnemyPowerUpAbility.setVisible(false);
							EnemyPower.setVisible(false);
							
							bg.setIcon(dead);
							
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
					}
				};
				timer.schedule(task, 1500);	
				
			}
		});
		
		rtrn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				rtrn.setBounds(174, 535, 125, 125);
				qt.setBounds(174, 535, 125, 125);
				// makes main buttons visible
				fght.setVisible(true);
				qt.setVisible(true);
				hp.setVisible(true);
				rn.setVisible(true);
				// makes fight buttons invisible
				ab1.setVisible(false);
				ab2.setVisible(false);
				ab3.setVisible(false);
				rtrn.setVisible(false);
				FakeHp.setVisible(true);
				ab4.setVisible(false);
			}
		});
	
		fght.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				rtrn.setBounds(174, 535, 125, 125);
				qt.setBounds(174, 535, 125, 125);
				ab4.setVisible(false);
				FakeHp.setVisible(false);
				hp.setVisible(false);
				yes.setVisible(false);
				no.setVisible(false);
				fght.setVisible(false);
				rn.setVisible(false);	
				qt.setVisible(false);
				rtrn.setVisible(true);
				ab1.setVisible(true);
				ab2.setVisible(true);
				ab3.setVisible(true);
			}
		});
		
		ab1.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e) 
			{	
				int man = mana.getValue();
				man = man + 5;
				mana.setValue(man);
				
				//sets damage range from 10 - 20%
				int dmg1 = 11 + (int)(Math.random()*10);
				int hp2 = hpbar1.getValue();
				hp2 = hp2 - dmg1;
				hpbar1.setValue(hp2);
				effect.setIcon(slash);
				
				Timer timerWait = new Timer();					
				TimerTask taskWait = new TimerTask() 
				{
					public void run() 
					{
						int hpe = saiyan.getValue();
						if (hpe == 1)
						{							
						int dmg2 = 26 + (int)(Math.random()*10);
						int hp1 = hpbar.getValue();
						hp1 = hp1 - dmg2;
							if (hp1 <= 0)
							{
								ab4.setVisible(false);
								FakeHp.setVisible(false);
								hp.setVisible(false);
								rn.setVisible(false);
								qt.setVisible(false);
								fght.setVisible(false);
								ab1.setVisible(false);
								ab2.setVisible(false);
								ab3.setVisible(false);
								yes.setVisible(false);
								no.setVisible(false);
								rtrn.setVisible(false);
								hpbar.setVisible(false);
								hpbar1.setVisible(false);
								powerup.setVisible(false);
								ab3Quit.setVisible(false);
								ab3No.setVisible(false);
								Char.setVisible(false);
								Enemy.setVisible(false);
								effect.setVisible(false);
								BBeffect.setVisible(false);
								mana.setVisible(false);
								EnemyPowerUpAbility.setVisible(false);
								EnemyPower.setVisible(false);
								
								bg.setIcon(dead);
								
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
							EnemyPowerUpAbility.setIcon(BlueStream);
							hpbar.setValue(hp1);
							Timer timer = new Timer();					
							TimerTask task = new TimerTask() 
							{
								public void run() 
								{
									EnemyPowerUpAbility.setIcon(null);

									FakeHp.setVisible(true);
									hp.setVisible(true);
									fght.setVisible(true);
									rn.setVisible(true);	
									qt.setVisible(true);
									
								}
							};
							//timer for enemy attack disappear		
							timer.schedule(task, 900);	
						}
						else
						{
						int dmg2 = 11 + (int)(Math.random()*10);
						int hp1 = hpbar.getValue();
						hp1 = hp1 - dmg2;
						if (hp1 <= 0)
						{
							ab4.setVisible(false);
							FakeHp.setVisible(false);
							hp.setVisible(false);
							rn.setVisible(false);
							qt.setVisible(false);
							fght.setVisible(false);
							ab1.setVisible(false);
							ab2.setVisible(false);
							ab3.setVisible(false);
							yes.setVisible(false);
							no.setVisible(false);
							rtrn.setVisible(false);
							hpbar.setVisible(false);
							hpbar1.setVisible(false);
							powerup.setVisible(false);
							ab3Quit.setVisible(false);
							ab3No.setVisible(false);
							Char.setVisible(false);
							Enemy.setVisible(false);
							effect.setVisible(false);
							BBeffect.setVisible(false);
							mana.setVisible(false);
							EnemyPowerUpAbility.setVisible(false);
							EnemyPower.setVisible(false);
							
							bg.setIcon(dead);
							
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
						
						//Characters power up
						int hps = hpbar1.getValue();
						if (hps <= 50)
						{
							saiyan.setValue(1);
						}
						int say = saiyan.getValue();
						if (say == 1)
						{
							Enemy.setIcon(null);
							Timer timer = new Timer();					
							TimerTask task = new TimerTask() 
							{
								public void run() 
								{
									//Check as to why the Icon doesn't function
									EnemyPower.setIcon(Saiyan);
									EnemyPowerUpAbility.setIcon(BlueStream);
									int dmg2 = 26 + (int)(Math.random()*10);
									int hp1 = hpbar.getValue();
									hp1 = hp1 - dmg2;
									if (hp1 <= 0)
									{
										ab4.setVisible(false);
										FakeHp.setVisible(false);
										hp.setVisible(false);
										rn.setVisible(false);
										qt.setVisible(false);
										fght.setVisible(false);
										ab1.setVisible(false);
										ab2.setVisible(false);
										ab3.setVisible(false);
										yes.setVisible(false);
										no.setVisible(false);
										rtrn.setVisible(false);
										hpbar.setVisible(false);
										hpbar1.setVisible(false);
										powerup.setVisible(false);
										ab3Quit.setVisible(false);
										ab3No.setVisible(false);
										Char.setVisible(false);
										Enemy.setVisible(false);
										effect.setVisible(false);
										BBeffect.setVisible(false);
										mana.setVisible(false);
										EnemyPowerUpAbility.setVisible(false);
										EnemyPower.setVisible(false);
										
										bg.setIcon(dead);
										
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
									hpbar.setValue(hp1);
									Timer timer = new Timer();					
									TimerTask task = new TimerTask() 
									{
										public void run() 
										{
											EnemyPowerUpAbility.setIcon(null);

											FakeHp.setVisible(true);
											hp.setVisible(true);
											fght.setVisible(true);
											rn.setVisible(true);	
											qt.setVisible(true);
											
										}
									};
									//timer for enemy attack disappear		
									timer.schedule(task, 900);	
								}
							};
							//timer for enemy attack disappear		
							timer.schedule(task, 900);	
						}
						//end of power up code
						
						hpbar.setValue(hp1);
						BBeffect.setIcon(BlueBullet);
						
						Timer timer = new Timer();					
						TimerTask task = new TimerTask() 
						{
							public void run() 
							{
								BBeffect.setIcon(null);

								FakeHp.setVisible(true);
								hp.setVisible(true);
								fght.setVisible(true);
								rn.setVisible(true);	
								qt.setVisible(true);
							}
						};
						//timer for enemy attack disappear		
						timer.schedule(task, 900);	
					}
					}
				
				};
				
				FakeHp.setVisible(false);
				hp.setVisible(false);
				yes.setVisible(false);
				no.setVisible(false);
				fght.setVisible(false);
				rn.setVisible(false);	
				qt.setVisible(false);
				rtrn.setVisible(false);
				ab1.setVisible(false);
				ab2.setVisible(false);
				ab3.setVisible(false);
				ab4.setVisible(false);
				
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
					ab4.setVisible(false);
					FakeHp.setVisible(false);
					hp.setVisible(false);
					rn.setVisible(false);
					qt.setVisible(false);
					fght.setVisible(false);
					ab1.setVisible(false);
					ab2.setVisible(false);
					ab3.setVisible(false);
					yes.setVisible(false);
					no.setVisible(false);
					rtrn.setVisible(false);
					hpbar.setVisible(false);
					hpbar1.setVisible(false);
					powerup.setVisible(false);
					ab3Quit.setVisible(false);
					ab3No.setVisible(false);
					Char.setVisible(false);
					Enemy.setVisible(false);
					effect.setVisible(false);
					BBeffect.setVisible(false);
					mana.setVisible(false);
					EnemyPowerUpAbility.setVisible(false);
					EnemyPower.setVisible(false);
					
					bg.setIcon(win);

					
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
		
		ab2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int mna = mana.getValue();
				if (mna >= 5)
				{
					
				int man = mana.getValue();
				man = man - 5;
				mana.setValue(man);
				
				ShieldEffect.setIcon(shield);
				Char.setIcon(ShieldChar);
				Char.setBounds(-35, 28, 211, 225);
				int hpe = saiyan.getValue();
				if (hpe == 1)
				{
					EnemyPowerUpAbility.setIcon(BlueStream);
					
					FakeHp.setVisible(false);
					hp.setVisible(false);
					yes.setVisible(false);
					no.setVisible(false);
					fght.setVisible(false);
					rn.setVisible(false);	
					qt.setVisible(false);
					rtrn.setVisible(false);
					ab1.setVisible(false);
					ab2.setVisible(false);
					ab3.setVisible(false);
					ab4.setVisible(false);
					Timer timer = new Timer();					
					TimerTask task = new TimerTask() 
					{
						public void run() 
						{
							EnemyPowerUpAbility.setIcon(null);
							Char.setIcon(sprite);
							Char.setBounds(10, 28, 211, 225);
							ShieldEffect.setIcon(null);

							hp.setVisible(true);
							yes.setVisible(true);
							no.setVisible(true);
							fght.setVisible(true);
							rn.setVisible(true);	
							qt.setVisible(true);
							rtrn.setVisible(true);
							ab1.setVisible(true);
							ab2.setVisible(true);
							ab3.setVisible(true);
							FakeHp.setVisible(true);
							ab4.setVisible(true);
							
							int pw = powerup.getValue();
							if (pw == 1) 
							{
								Char.setIcon(PowerChar);
							}	
						}
					};
					//timer for enemy attack disappear		
					timer.schedule(task, 900);
				}
				else
				{
				BBeffect.setIcon(BlueBullet);
				
				FakeHp.setVisible(false);
				hp.setVisible(false);
				yes.setVisible(false);
				no.setVisible(false);
				fght.setVisible(false);
				rn.setVisible(false);	
				qt.setVisible(false);
				rtrn.setVisible(false);
				ab1.setVisible(false);
				ab2.setVisible(false);
				ab3.setVisible(false);
				ab4.setVisible(false);
				
				Timer timer = new Timer();					
				TimerTask task = new TimerTask() 
				{
					public void run() 
					{
						BBeffect.setIcon(null);
						Char.setIcon(sprite);
						Char.setBounds(10, 28, 211, 225);
						ShieldEffect.setIcon(null);

						hp.setVisible(true);
						yes.setVisible(true);
						no.setVisible(true);
						fght.setVisible(true);
						rn.setVisible(true);	
						qt.setVisible(true);
						rtrn.setVisible(true);
						ab1.setVisible(true);
						ab2.setVisible(true);
						ab3.setVisible(true);
						FakeHp.setVisible(true);
						ab4.setVisible(true);
						
						int pw = powerup.getValue();
						if (pw == 1) 
						{
							Char.setIcon(PowerChar);
						}	
					}
				};
				//timer for enemy attack disappear		
				timer.schedule(task, 900);
			}
				}
			else
			{
				int mn = mana.getValue();
				mana.setForeground(Color.red);
				mana.setValue(100);
				Timer manatimer = new Timer();
				
				TimerTask manatask = new TimerTask() 
				{
					public void run() 
					{
						mana.setForeground(Color.cyan);
						mana.setValue(mn);
					}
				};
						
				manatimer.schedule(manatask, 300);
			}
			}
		});
		
		/*
		 ab3: On the original click of the button you will take dmg, but after that is when u will get 
		the better ability
		*/
		ab3.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e) 
			{	
				int mna = mana.getValue();
				if (mna >= 60)
				{	
				int man = mana.getValue();
				man = man - 60;
				
				mana.setValue(man);
				FakeHp.setVisible(false);
				hp.setVisible(false);
				yes.setVisible(false);
				no.setVisible(false);
				fght.setVisible(false);
				rn.setVisible(false);	
				qt.setVisible(false);
				rtrn.setVisible(false);
				ab1.setVisible(false);
				ab2.setVisible(false);
				ab3.setVisible(false);
				ab4.setVisible(false);
				
				//Sprite power up
				Char.setIcon(null);
				powerup.setValue(1);
				Timer timer = new Timer();					
				TimerTask task = new TimerTask()
			
				{
					public void run() 
					{
						Char.setIcon(PowerChar);
					}
				};
				//timer for enemy attack disappear		
				timer.schedule(task, 900);
				
				Timer timerWait = new Timer();					
				TimerTask taskWait = new TimerTask() 
				{
					public void run() 
					{
						//Enemy Attack
						int dmg2 = 11 + (int)(Math.random()*10);
						int hp1 = hpbar.getValue();
						hp1 = hp1 - dmg2;
						//End of Enemy Attack
						
						
						hpbar.setValue(hp1);
						BBeffect.setIcon(BlueBullet);
						
						if (hp1 <= 0)
						{
							ab4.setVisible(false);
							FakeHp.setVisible(false);
							hp.setVisible(false);
							rn.setVisible(false);
							qt.setVisible(false);
							fght.setVisible(false);
							ab1.setVisible(false);
							ab2.setVisible(false);
							ab3.setVisible(false);
							yes.setVisible(false);
							no.setVisible(false);
							rtrn.setVisible(false);
							hpbar.setVisible(false);
							hpbar1.setVisible(false);
							powerup.setVisible(false);
							ab3Quit.setVisible(false);
							ab3No.setVisible(false);
							Char.setVisible(false);
							Enemy.setVisible(false);
							effect.setVisible(false);
							BBeffect.setVisible(false);
							mana.setVisible(false);
							EnemyPowerUpAbility.setVisible(false);
							EnemyPower.setVisible(false);
							
							bg.setIcon(dead);
							
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
								ab3Quit.setVisible(true);
								ab4.setVisible(true);
				
							}
						};
						//timer for enemy attack disappear		
						timer.schedule(task, 900);
						
						
						
					} 
				};
				
				FakeHp.setVisible(false);
				hp.setVisible(false);
				yes.setVisible(false);
				no.setVisible(false);
				fght.setVisible(false);
				rn.setVisible(false);	
				qt.setVisible(false);
				rtrn.setVisible(false);
				ab1.setVisible(false);
				ab2.setVisible(false);
				ab3.setVisible(false);
				ab4.setVisible(false);
				
				
				//Timer for enemy attack		
				timerWait.schedule(taskWait, 1600);		
				}
				else
				{
					int mn = mana.getValue();
					mana.setForeground(Color.red);
					mana.setValue(100);
					Timer manatimer = new Timer();
					
					TimerTask manatask = new TimerTask() 
					{
						public void run() 
						{
							mana.setForeground(Color.cyan);
							mana.setValue(mn);
						}
					};
							
					manatimer.schedule(manatask, 300);
				}
			}
		});
		
		ab4.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e) 
			{	
				
				//sets damage range from 30 - 40%
				int dmg1 = 41 + (int)(Math.random()*10);
				int hp2 = hpbar1.getValue();
				hp2 = hp2 - dmg1;
				hpbar1.setValue(hp2);
				FullSlashIcon.setIcon(FullSlash);
				
				if (hp2 <=0)
				{
					ab4.setVisible(false);
					FakeHp.setVisible(false);
					hp.setVisible(false);
					rn.setVisible(false);
					qt.setVisible(false);
					fght.setVisible(false);
					ab1.setVisible(false);
					ab2.setVisible(false);
					ab3.setVisible(false);
					yes.setVisible(false);
					no.setVisible(false);
					rtrn.setVisible(false);
					hpbar.setVisible(false);
					hpbar1.setVisible(false);
					powerup.setVisible(false);
					ab3Quit.setVisible(false);
					ab3No.setVisible(false);
					Char.setVisible(false);
					Enemy.setVisible(false);
					effect.setVisible(false);
					BBeffect.setVisible(false);
					mana.setVisible(false);
					EnemyPowerUpAbility.setVisible(false);
					EnemyPower.setVisible(false);
					
					bg.setIcon(win);

					
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
				
				
				
				Timer timerWait = new Timer();					
				TimerTask taskWait = new TimerTask() 
				{
					public void run() 
					{
						int dmg2 = 11 + (int)(Math.random()*10);
						int hp1 = hpbar.getValue();
						hp1 = hp1 - dmg2;
						
						if (hp1 <= 0)
						{
							ab4.setVisible(false);
							FakeHp.setVisible(false);
							hp.setVisible(false);
							rn.setVisible(false);
							qt.setVisible(false);
							fght.setVisible(false);
							ab1.setVisible(false);
							ab2.setVisible(false);
							ab3.setVisible(false);
							yes.setVisible(false);
							no.setVisible(false);
							rtrn.setVisible(false);
							hpbar.setVisible(false);
							hpbar1.setVisible(false);
							powerup.setVisible(false);
							ab3Quit.setVisible(false);
							ab3No.setVisible(false);
							Char.setVisible(false);
							Enemy.setVisible(false);
							effect.setVisible(false);
							BBeffect.setVisible(false);
							mana.setVisible(false);
							EnemyPowerUpAbility.setVisible(false);
							EnemyPower.setVisible(false);
							
							bg.setIcon(dead);
							
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
						
						if (hp1 <= 0)
						{
							ab4.setVisible(false);
							FakeHp.setVisible(false);
							hp.setVisible(false);
							rn.setVisible(false);
							qt.setVisible(false);
							fght.setVisible(false);
							ab1.setVisible(false);
							ab2.setVisible(false);
							ab3.setVisible(false);
							yes.setVisible(false);
							no.setVisible(false);
							rtrn.setVisible(false);
							hpbar.setVisible(false);
							hpbar1.setVisible(false);
							powerup.setVisible(false);
							ab3Quit.setVisible(false);
							ab3No.setVisible(false);
							Char.setVisible(false);
							Enemy.setVisible(false);
							effect.setVisible(false);
							BBeffect.setVisible(false);
							mana.setVisible(false);
							EnemyPowerUpAbility.setVisible(false);
							EnemyPower.setVisible(false);
							
							bg.setIcon(dead);
							
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
						
						//Characters power up
						if(hp1 <= 50) 
						{
							Enemy.setIcon(null);
							Timer timer = new Timer();					
							TimerTask task = new TimerTask() 
							{
								public void run() 
								{
									//Check as to why the Icon doesn't function
									EnemyPower.setIcon(Saiyan);
								}
							};
							//timer for enemy attack disappear		
							timer.schedule(task, 900);	
						}
						//end of power up code
						
						hpbar.setValue(hp1);
						
						
						Timer timer = new Timer();					
						TimerTask task = new TimerTask() 
						{
							public void run() 
							{
								BBeffect.setIcon(null);

								FakeHp.setVisible(true);
								hp.setVisible(true);
								fght.setVisible(true);
								rn.setVisible(true);	
								qt.setVisible(true);
								
							}
						};
						//timer for enemy attack disappear		
						timer.schedule(task, 900);	
					}
				};
				
				FakeHp.setVisible(false);
				hp.setVisible(false);
				yes.setVisible(false);
				no.setVisible(false);
				fght.setVisible(false);
				rn.setVisible(false);	
				qt.setVisible(false);
				rtrn.setVisible(false);
				ab1.setVisible(false);
				ab2.setVisible(false);
				ab3.setVisible(false);
				ab4.setVisible(false);
				ab3Quit.setVisible(false);
				
				//Timer for enemy attack		
				timerWait.schedule(taskWait, 1600);			

				Timer timer = new Timer();					
				TimerTask task = new TimerTask() 
				{
					public void run() 
					{
						FullSlashIcon.setIcon(null);
					}
				};
				//timer for sprite attack disappear			
				timer.schedule(task, 1000);						
				
				
				int hps = hpbar1.getValue();
				if (hps <= 50)
				{
					saiyan.setValue(1);
				}
				int say = saiyan.getValue();
				if (say == 1)
				{		
					Enemy.setIcon(null);
					Timer timer1 = new Timer();					
					TimerTask task1 = new TimerTask() 
					{
						public void run() 
						{
							//Check as to why the Icon doesn't function
							EnemyPower.setIcon(Saiyan);
							EnemyPowerUpAbility.setIcon(null);
							int dmg2 = 26 + (int)(Math.random()*10);
							int hp1 = hpbar.getValue();
							hp1 = hp1 - dmg2;
						}
						
					};
					timer1.schedule(task1, 900);
					
					Timer timer2 = new Timer();					
					TimerTask task2 = new TimerTask() 
					{
						public void run() 
						{
							EnemyPowerUpAbility.setIcon(BlueStream);
						}
					};
					timer2.schedule(task2, 1000);
					
					Timer timer3 = new Timer();					
					TimerTask task3 = new TimerTask() 
					{
						public void run() 
						{
							EnemyPowerUpAbility.setIcon(null);
						}
					};
					timer3.schedule(task3, 2000);
				}
				else 
				{
				BBeffect.setIcon(BlueBullet);
				}
			}
		});
		
		hp.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				rtrn.setBounds(174, 535, 125, 125);
				qt.setBounds(174, 535, 125, 125);
				hp.setVisible(false);
				yes.setVisible(false);
				no.setVisible(false);
				fght.setVisible(false);
				rn.setVisible(false);	
				qt.setVisible(false);
				rtrn.setVisible(false);
				ab1.setVisible(false);
				ab2.setVisible(false);
				ab3.setVisible(false);
				ab4.setVisible(false);
				
				
				//make healing gui image bigger
				HealingEffect.setIcon(Healing);
				int hp1 = hpbar.getValue();
				hp1 = hp1 + 40;
				hpbar.setValue(hp1);
				frame.remove(hp);
				
				Timer timer = new Timer();					
				TimerTask task = new TimerTask() 
				{	
					public void run() 
					{
						HealingEffect.setIcon(null);
						
						FakeHp.setVisible(true);
						hp.setVisible(false);
						yes.setVisible(false);
						no.setVisible(false);
						fght.setVisible(true);
						rn.setVisible(true);	
						qt.setVisible(true);
						rtrn.setVisible(false);
						ab1.setVisible(false);
						ab2.setVisible(false);
						ab3.setVisible(false);
						ab4.setVisible(false);
						
						
					}
				};
				//timer for healing gui to leave		
				timer.schedule(task, 800);
			}
		});
		
		
		
		
		
		
		qt.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				rtrn.setBounds(174, 535, 125, 125);
				qt.setBounds(174, 535, 125, 125);
				qt.setVisible(false);
				hp.setVisible(false);
				yes.setVisible(true);
				no.setVisible(true);
				fght.setVisible(false);
				rn.setVisible(false);	
				ab1.setVisible(false);
				ab2.setVisible(false);
				ab3.setVisible(false);
				Enemy.setIcon(null);	
				effect.setIcon(null);
				hpbar.setVisible(false);
				hpbar1.setVisible(false);
				ab4.setVisible(false);
				rtrn.setVisible(false);
				ab3No.setVisible(false);
				bg.setIcon(quit);
				Char.setIcon(null);
				mana.setVisible(false);
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
				
				rtrn.setBounds(174, 535, 125, 125);
				qt.setBounds(174, 535, 125, 125);
				int pw = powerup.getValue();
				bg.setIcon(bg1);
				Enemy.setIcon(nmy1);
				Char.setIcon(sprite);
				hp.setVisible(true);
				rn.setVisible(true);
				qt.setVisible(true);
				fght.setVisible(true);
				hpbar.setVisible(true);
				hpbar1.setVisible(true);
				ab4.setVisible(false);
				Start.setVisible(false);
				ab3No.setVisible(false);
				mana.setVisible(true);
				
				if (pw == 1) 
				{
					Char.setIcon(null);
					Timer timer = new Timer();					
					TimerTask task = new TimerTask() 
					{
						public void run() 
						{
							Char.setIcon(PowerChar);
						}
					};
					timer.schedule(task, 300);	
				}	
			}
			});
		
		ab3Quit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				rtrn.setBounds(174, 535, 125, 125);
				qt.setBounds(174, 535, 125, 125);
				qt.setVisible(false);
				hp.setVisible(false);
				yes.setVisible(true);
				no.setVisible(false);
				fght.setVisible(false);
				rn.setVisible(false);	
				ab1.setVisible(false);
				ab2.setVisible(false);
				ab3.setVisible(false);
				Enemy.setIcon(null);	
				effect.setIcon(null);
				hpbar.setVisible(false);
				hpbar1.setVisible(false);
				ab4.setVisible(false);
				rtrn.setVisible(false);
				ab3No.setVisible(true);
				ab3Quit.setVisible(false);
				mana.setVisible(false);
				
				bg.setIcon(quit);
				Char.setIcon(null);
				}
			});
		ab3No.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				int pw = powerup.getValue();
				bg.setIcon(bg1);
				Enemy.setIcon(nmy1);
				hp.setVisible(false);
				rn.setVisible(false);
				qt.setVisible(false);
				fght.setVisible(true);
				hpbar.setVisible(true);
				hpbar1.setVisible(true);
				ab4.setVisible(true);
				Start.setVisible(false);
				ab3No.setVisible(false);
				ab3Quit.setVisible(true);
				yes.setVisible(false);
				no.setVisible(false);
				fght.setVisible(false);
				mana.setVisible(true);
				
				if (pw == 1) 
				{
					Char.setIcon(null);
					Timer timer = new Timer();					
					TimerTask task = new TimerTask() 
					{
						public void run() 
						{
							Char.setIcon(PowerChar);
						}
					};
					timer.schedule(task, 100);	
				}	
			}
			});
		
	}
}