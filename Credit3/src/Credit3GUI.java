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

public class Credit3GUI {

	private JFrame frame;
	private JTextField fnt;
	private JTextField lnt;
	private JTextField agt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Credit3GUI window = new Credit3GUI();
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
	public Credit3GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 710, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 672, 398);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel fnl = new JLabel("First Name");
		fnl.setFont(new Font("Tahoma", Font.PLAIN, 13));
		fnl.setBounds(24, 37, 99, 43);
		panel.add(fnl);
		
		fnt = new JTextField();
		fnt.setBounds(109, 44, 238, 33);
		panel.add(fnt);
		fnt.setColumns(10);
		
		JLabel lnl = new JLabel("Last Name");
		lnl.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lnl.setBounds(24, 91, 99, 43);
		panel.add(lnl);
		
		lnt = new JTextField();
		lnt.setColumns(10);
		lnt.setBounds(109, 91, 238, 33);
		panel.add(lnt);
		
		JLabel agl = new JLabel("Age");
		agl.setFont(new Font("Tahoma", Font.PLAIN, 13));
		agl.setBounds(24, 139, 99, 43);
		panel.add(agl);
		
		agt = new JTextField();
		agt.setColumns(10);
		agt.setBounds(109, 145, 238, 33);
		panel.add(agt);
		
		JLabel disl = new JLabel("");
		disl.setBounds(20, 269, 642, 107);
		panel.add(disl);
		
		JButton sb = new JButton("Submit");
		sb.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String FN = fnt.getText();
				String LN = lnt.getText();
				
				disl.setText("First name: " + FN + "Last name: " + LN);
			}
		});
		sb.setBounds(384, 37, 228, 80);
		panel.add(sb);
		
		JButton rs = new JButton("Reset");
		rs.setBounds(384, 129, 228, 80);
		panel.add(rs);
	}
}
