package Assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.Font;

public class CS10FinalProject 
{

	private JFrame frame;

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
		frame.setBounds(100, 100, 400, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton k1 = new JButton("1");
		k1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		k1.setBounds(44, 300, 70, 70);
		frame.getContentPane().add(k1);
		
		JButton k2 = new JButton("2");
		k2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		k2.setBounds(154, 300, 70, 70);
		frame.getContentPane().add(k2);
		
		JButton k3 = new JButton("3");
		k3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		k3.setBounds(262, 300, 70, 70);
		frame.getContentPane().add(k3);
		
		JButton k4 = new JButton("4");
		k4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		k4.setBounds(44, 399, 70, 70);
		frame.getContentPane().add(k4);
		
		JButton k5 = new JButton("5");
		k5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		k5.setBounds(154, 399, 70, 70);
		frame.getContentPane().add(k5);
		
		JButton k6 = new JButton("6");
		k6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		k6.setBounds(262, 399, 70, 70);
		frame.getContentPane().add(k6);
		
		JButton k7 = new JButton("7");
		k7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		k7.setBounds(44, 497, 70, 70);
		frame.getContentPane().add(k7);
		
		JButton k8 = new JButton("8");
		k8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		k8.setBounds(154, 497, 70, 70);
		frame.getContentPane().add(k8);
		
		JButton k9 = new JButton("9");
		k9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		k9.setBounds(262, 497, 70, 70);
		frame.getContentPane().add(k9);
		
		JButton k0 = new JButton("0");
		k0.setFont(new Font("Tahoma", Font.PLAIN, 25));
		k0.setBounds(154, 592, 70, 70);
		frame.getContentPane().add(k0);
		
		JButton rst = new JButton("<");
		rst.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rst.setBounds(44, 592, 70, 70);
		frame.getContentPane().add(rst);
		
		JButton nxt = new JButton(">");
		nxt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		nxt.setBounds(262, 592, 70, 70);
		frame.getContentPane().add(nxt);
	}
}
