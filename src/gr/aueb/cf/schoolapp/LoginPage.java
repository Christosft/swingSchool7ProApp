package gr.aueb.cf.schoolapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setTitle("Αυθεντικοποίηση χρήστη");
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginPage.class.getResource("/images/eduv2.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Σύνδεση");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(214, 27, 75, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Παρακαλώ εισάγεται τους κωδικούς σας για να συνδεθείται");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(56, 58, 391, 13);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(41, 90, 436, 2);
		contentPane.add(separator);
		
		username = new JTextField();
		username.setBounds(157, 143, 188, 31);
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Χρήστης:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(165, 120, 62, 13);
		contentPane.add(lblNewLabel_2);
		
		password = new JPasswordField();
		password.setBounds(157, 207, 188, 31);
		contentPane.add(password);
		
		JLabel lblNewLabel_2_1 = new JLabel("Κωδικός:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_1.setBounds(165, 184, 62, 13);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnNewButton = new JButton("Σύνδεση");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(username.getText().matches("[aA]dmin") && (Arrays.equals(password.getPassword(), "12345".toCharArray()))) {
			Main.getLoginPage().setVisible(false);
			Main.getDashboard().setVisible(true);
		} else {
			JOptionPane.showMessageDialog(null, "Wrong username or password", "connection fault", JOptionPane.ERROR_MESSAGE);
		}
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(157, 263, 188, 37);
		contentPane.add(btnNewButton);
	}
}
