import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MainGui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGui window = new MainGui();
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
	public MainGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 205, 170));
		frame.setBounds(100, 100, 750, 435);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO INDUSTRIAL WASTE RECORD SYSTEM");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Nueva Std", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(25, 22, 688, 85);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn_RegisterCompany = new JButton("REGISTER COMPANY");
		btn_RegisterCompany.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RegisterCompany frame1 = new RegisterCompany();
				frame1.Screen1();
				
			}
		});
		btn_RegisterCompany.setBounds(161, 118, 405, 39);
		frame.getContentPane().add(btn_RegisterCompany);
		
		JButton btnNewButton = new JButton("WASTE DESCRIPTION");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				WasteDescription waste = new WasteDescription();
				waste.Screen2();
				
						
				
			}
		});
		btnNewButton.setBounds(161, 195, 405, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EMAIL AND CONTACT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EmailContact email = new EmailContact();
				email.Screen3();
				
			}
		});
		btnNewButton_1.setBounds(161, 272, 405, 39);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnQuit = new JButton("QUIT");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(btnQuit, "Thank you for using our program!");
				System.exit(0);
				
				
			}
		});
		btnQuit.setForeground(Color.WHITE);
		btnQuit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQuit.setBackground(Color.RED);
		btnQuit.setBounds(639, 339, 85, 46);
		frame.getContentPane().add(btnQuit);
	}

}
