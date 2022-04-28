package Assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class CS10FinalProjectButBad 
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
					CS10FinalProjectButBad window = new CS10FinalProjectButBad();
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
	public CS10FinalProjectButBad() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 666);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton k1 = new JButton("1");
		k1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		k1.setBounds(44, 230, 70, 70);
		frame.getContentPane().add(k1);
		
		JButton k2 = new JButton("2");
		k2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		k2.setBounds(154, 230, 70, 70);
		frame.getContentPane().add(k2);
		
		JButton k3 = new JButton("3");
		k3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		k3.setBounds(262, 230, 70, 70);
		frame.getContentPane().add(k3);
		
		JButton k4 = new JButton("4");
		k4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		k4.setBounds(44, 329, 70, 70);
		frame.getContentPane().add(k4);
		
		JButton k5 = new JButton("5");
		k5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		k5.setBounds(154, 329, 70, 70);
		frame.getContentPane().add(k5);
		
		JButton k6 = new JButton("6");
		k6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		k6.setBounds(262, 329, 70, 70);
		frame.getContentPane().add(k6);
		
		JButton k7 = new JButton("7");
		k7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		k7.setBounds(44, 427, 70, 70);
		frame.getContentPane().add(k7);
		
		JButton k8 = new JButton("8");
		k8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		k8.setBounds(154, 427, 70, 70);
		frame.getContentPane().add(k8);
		
		JButton k9 = new JButton("9");
		k9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		k9.setBounds(262, 427, 70, 70);
		frame.getContentPane().add(k9);
		
		JButton k0 = new JButton("0");
		k0.setFont(new Font("Tahoma", Font.PLAIN, 25));
		k0.setBounds(154, 522, 70, 70);
		frame.getContentPane().add(k0);
		
		JButton rst = new JButton("<");
		rst.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rst.setBounds(44, 522, 70, 70);
		frame.getContentPane().add(rst);
		
		JButton nxt = new JButton(">");
		nxt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		nxt.setBounds(262, 522, 70, 70);
		frame.getContentPane().add(nxt);
		
		JLabel out = new JLabel("Set your password");
		out.setHorizontalAlignment(SwingConstants.CENTER);
		out.setFont(new Font("Tahoma", Font.PLAIN, 22));
		out.setBounds(44, 51, 288, 50);
		frame.getContentPane().add(out);
		
		JLabel inp = new JLabel("");
		inp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		inp.setBounds(44, 128, 288, 56);
		frame.getContentPane().add(inp);
	}
}
