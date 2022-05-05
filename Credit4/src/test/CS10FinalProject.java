package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class CS10FinalProject {

	private JFrame frame;

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
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(64, 93, 350, 200);
		frame.getContentPane().add(panel);
		
		JButton bag = new JButton("Bag");
		bag.setBounds(50, 480, 120, 120);
		frame.getContentPane().add(bag);
		
		JButton ft = new JButton("Fight");
		ft.setBounds(180, 410, 120, 120);
		frame.getContentPane().add(ft);
		
		JButton run = new JButton("Run");
		run.setBounds(311, 480, 120, 120);
		frame.getContentPane().add(run);
		
		JButton quit = new JButton("Quit");
		quit.setBounds(180, 550, 120, 120);
		frame.getContentPane().add(quit);
	}
}
