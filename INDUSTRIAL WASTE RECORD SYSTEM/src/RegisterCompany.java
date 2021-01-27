import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Color;

public class RegisterCompany {

	private JFrame frame;
	private JTextField txt_name;
	private JTextField txt_email;
	private JTextField txt_address;
	private JTextField txt_mass;

	/**
	 * Launch the application.
	 */
	public static void Screen1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterCompany window = new RegisterCompany();
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
	public RegisterCompany() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 205, 170));
		frame.setBounds(100, 100, 625, 594);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTER COMPANY");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(179, 24, 260, 59);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("COMPANY NAME:");
		lblNewLabel_1.setFont(new Font("Cambria", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(50, 108, 113, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("EMAIL:");
		lblNewLabel_2.setFont(new Font("Cambria", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(50, 151, 86, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		txt_name = new JTextField();
		txt_name.setBounds(234, 109, 250, 20);
		frame.getContentPane().add(txt_name);
		txt_name.setColumns(10);
		
		txt_email = new JTextField();
		txt_email.setBounds(234, 152, 250, 20);
		frame.getContentPane().add(txt_email);
		txt_email.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ADDRESS");
		lblNewLabel_3.setFont(new Font("Cambria", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(50, 193, 59, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		txt_address = new JTextField();
		txt_address.setBounds(234, 194, 250, 20);
		frame.getContentPane().add(txt_address);
		txt_address.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("TYPE OF WASTE PRODUCED: ");
		lblNewLabel_3_1.setFont(new Font("Cambria", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(50, 237, 174, 14);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JTextArea txt_DisplayCompany = new JTextArea();
		txt_DisplayCompany.setText("REGISTERED COMPANY WILL BE REGISTERED HERE");
		txt_DisplayCompany.setBounds(50, 360, 516, 184);
		frame.getContentPane().add(txt_DisplayCompany);
		
		JButton btn_registercompany = new JButton("REGISTER COMPANY");
		btn_registercompany.setFont(new Font("Cambria", Font.BOLD, 12));
		btn_registercompany.setBounds(201, 318, 226, 31);
		frame.getContentPane().add(btn_registercompany);
		
		String[] waste = {"Chemical Waste", "Solid Waste", "Toxic Waste"};
		JComboBox cmb_waste = new JComboBox(waste);
		cmb_waste.setFont(new Font("Cambria", Font.PLAIN, 12));
		cmb_waste.setBounds(234, 234, 250, 22);
		frame.getContentPane().add(cmb_waste);
		
		JLabel lblNewLabel_4 = new JLabel("MASS OF WASTE PRODUCED: ");
		lblNewLabel_4.setFont(new Font("Cambria", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(50, 279, 162, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		txt_mass = new JTextField();
		txt_mass.setBounds(234, 277, 86, 20);
		frame.getContentPane().add(txt_mass);
		txt_mass.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("kg");
		lblNewLabel_5.setFont(new Font("Cambria", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(324, 276, 46, 20);
		frame.getContentPane().add(lblNewLabel_5);
		
		btn_registercompany.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = txt_name.getText();
				String email = txt_email.getText();
				String address = txt_address.getText();
				String mass = txt_mass.getText();
			
				
				String filename = "company.txt";
				if(!name.isEmpty() && !email.isEmpty() && !address.isEmpty() && !mass.isEmpty()) {
					txt_DisplayCompany.setText("Company name:" + name+ "\n" + "Company Email: "+ email+ "\n" + "Address: "+ address+ "\n" 
												+ "Type of waste produced: "+ cmb_waste.getSelectedItem() + "\n" +"Mass of waste produced: "+ mass + "kg"+"\n");
				
					JOptionPane.showMessageDialog(null, "Company Registration Successful!");
					
					try {
						PrintWriter outputstream = new PrintWriter(filename);
						outputstream.println(txt_DisplayCompany.getText());
						outputstream.close();
						
					}
						catch(FileNotFoundException ex) {
							ex.printStackTrace();
						}
				}
				else
					JOptionPane.showMessageDialog(null, "Please fill all the important information.");
			}
		});
		
		
		
	}
}
