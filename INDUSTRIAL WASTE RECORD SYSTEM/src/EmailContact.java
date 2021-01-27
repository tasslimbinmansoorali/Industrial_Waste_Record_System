import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmailContact {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Screen3() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmailContact window = new EmailContact();
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
	public EmailContact() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(152, 251, 152));
		frame.setBounds(100, 100, 695, 483);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EMAIL AND CONTACT US");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(189, 11, 316, 57);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Note: Please send an email to \"wastedisp@binanegara.com\" as a proof of your waste disposal");
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 12));
		lblNewLabel_1.setBounds(94, 92, 524, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Have you sent an email to us?");
		lblNewLabel_1_1.setFont(new Font("Cambria", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(94, 167, 178, 23);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JRadioButton rdn_yes = new JRadioButton("YES");
		rdn_yes.setBackground(new Color(152, 251, 152));
		rdn_yes.setBounds(309, 168, 109, 23);
		frame.getContentPane().add(rdn_yes);
		
		JRadioButton rdn_no = new JRadioButton("NO");
		rdn_no.setBackground(new Color(152, 251, 152));
		rdn_no.setBounds(461, 168, 109, 23);
		frame.getContentPane().add(rdn_no);
		
		JButton btn_submit = new JButton("Submit");
		btn_submit.setFont(new Font("Cambria", Font.BOLD, 12));
		btn_submit.setBounds(269, 220, 132, 23);
		frame.getContentPane().add(btn_submit);
		
		ButtonGroup gen= new ButtonGroup();
		gen.add(rdn_yes);
		gen.add(rdn_no);
		
		JLabel lblNewLabel_1_2 = new JLabel("This program was created by:-");
		lblNewLabel_1_2.setFont(new Font("Cambria", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(256, 272, 171, 23);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Tasslim (A177398)");
		lblNewLabel_1_2_1.setFont(new Font("Cambria", Font.BOLD, 12));
		lblNewLabel_1_2_1.setBounds(269, 306, 171, 23);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Leshuan Sivakumar (A177388)");
		lblNewLabel_1_2_2.setFont(new Font("Cambria", Font.BOLD, 12));
		lblNewLabel_1_2_2.setBounds(269, 340, 171, 23);
		frame.getContentPane().add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Arif Syamil (A177313)");
		lblNewLabel_1_2_3.setFont(new Font("Cambria", Font.BOLD, 12));
		lblNewLabel_1_2_3.setBounds(269, 374, 178, 23);
		frame.getContentPane().add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("Aiman Najmuddin (A177335)");
		lblNewLabel_1_2_4.setFont(new Font("Cambria", Font.BOLD, 12));
		lblNewLabel_1_2_4.setBounds(269, 408, 171, 23);
		frame.getContentPane().add(lblNewLabel_1_2_4);
		
		JLabel lblNewLabel_1_3 = new JLabel("Need assistance? Contact us : 0199109321 / 0182705113 / 0127049021 / 01111920527");
		lblNewLabel_1_3.setFont(new Font("Cambria", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(104, 116, 491, 23);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		
		btn_submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdn_yes.isSelected()) {
					JOptionPane.showMessageDialog(null,"Thank you for saving the enviroment!");
				}
				else
					JOptionPane.showMessageDialog(null,"Please do so as soon as possible. RM 1000 fine will be imposed!");
			}
		});
		
		
	
			
		}
	}

