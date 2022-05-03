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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class Credit3GUI {

	private JFrame frame;
	private JTextField fnt;
	private JTextField lnt;

	ImageIcon img1 = new ImageIcon("C:\\Users\\16365506\\git\\CS10\\Credit3\\src\\img.png");
	
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
		frame.setBounds(100, 100, 751, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 725, 448);
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
		
		JLabel agl = new JLabel("Grade");
		agl.setFont(new Font("Tahoma", Font.PLAIN, 13));
		agl.setBounds(24, 139, 99, 43);
		panel.add(agl);
		
		JLabel disl = new JLabel("");
		disl.setBounds(359, 260, 322, 177);
		panel.add(disl);
		
		JComboBox agt = new JComboBox();
		agt.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		agt.setBounds(109, 145, 238, 33);
		panel.add(agt);
		
		JLabel img = new JLabel("");
		img.setBounds(24, 244, 323, 177);
		panel.add(img);
		
		JButton sb = new JButton("Submit");
		sb.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String FN = fnt.getText();
				String LN = lnt.getText();
				int grade;
				if(agt.getSelectedItem().equals("10"))
				{
					grade = 10;
					img.setIcon(img1);
				}
				else if(agt.getSelectedItem().equals("11"))
				{
					grade = 11;
					Credit3GUI_v2 k = new Credit3GUI_v2();
					k.setVisible(true);
					window.frame.setVisible(true);	
				}
				else
				{
					grade = 12;
				}
				
				disl.setText("First name: " + FN + "Last name: " + LN
						+ "and your age is : " + grade);
			}
		});
		sb.setBounds(384, 37, 228, 80);
		panel.add(sb);
		
		JButton rs = new JButton("Reset");
		rs.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				fnt.setText(" ");
				lnt.setText(" ");
			}
		});
		rs.setBounds(384, 129, 228, 80);
		panel.add(rs);
	}
}
