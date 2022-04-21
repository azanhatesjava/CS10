import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Special2Dig
{

	private JFrame frame;
	private JTextField td;

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
					Special2Dig window = new Special2Dig();
					window.frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Special2Dig() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 317, 265);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 308, 235);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel dgl = new JLabel("Enter two digits");
		dgl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dgl.setBounds(33, 30, 99, 34);
		panel.add(dgl);
		
		td = new JTextField();
		td.setBounds(43, 75, 75, 34);
		panel.add(td);
		td.setColumns(10);
		
		JLabel dis = new JLabel("");
		dis.setBounds(10, 144, 277, 80);
		panel.add(dis);
		
		JButton btnNewButton = new JButton("CLEAR");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				td.setText("");
				dis.setText("");
			}
		});
		btnNewButton.setBounds(162, 88, 125, 45);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ENTER");
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String digits = td.getText();//records the two digits
				int twoD = Integer.parseInt(digits);//gets the integer part
				
				int firstD = twoD / 10;//records the first digit
				int secondD = twoD % 10;//records the second digit
				
				int sum = firstD + secondD;//record the sum
				
				int prdc = firstD*secondD;//record the product
				
				int check = sum + prdc;
						
				if(check == twoD) // checks if the twoD equals check
				{
					dis.setText(twoD + " is a special two digit number"); // displays it's a special number
				}
				else
				{
					dis.setText(twoD + " is not a special two digit number"); // displays it's not a special number
				}
				
				
			}
		});
		btnNewButton_1.setBounds(162, 27, 125, 45);
		panel.add(btnNewButton_1);
	}
}
