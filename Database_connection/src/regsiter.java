import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class regsiter extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JTextField mail;
	private JTextField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					regsiter frame = new regsiter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public regsiter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		user = new JTextField();
		user.setBounds(29, 110, 288, 39);
		contentPane.add(user);
		user.setColumns(10);

		mail = new JTextField();
		mail.setColumns(10);
		mail.setBounds(29, 176, 288, 39);
		contentPane.add(mail);

		pass = new JTextField();
		pass.setColumns(10);
		pass.setBounds(29, 242, 288, 39);
		contentPane.add(pass);

		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setBounds(29, 87, 155, 24);
		contentPane.add(lblNewLabel);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(29, 153, 128, 24);
		contentPane.add(lblEmail);

		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setBounds(29, 219, 128, 24);
		contentPane.add(lblNewLabel_1_1);

		JButton btnNewButton = new JButton("Register Now");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/test2", "root", "");
					PreparedStatement ps = conn
							.prepareStatement("Insert into student(username_,emali_,pass_) values(?,?,?);");
					ps.setString(1, user.getText());
					ps.setString(2, mail.getText());
					ps.setString(3, pass.getText());
					int x = ps.executeUpdate();
					if (x > 0) {
						System.out.println("Registration done successfully....");
					}
					else {
						System.out.println("Registration failed");
					}
				} catch (Exception exe) {
					System.out.println(exe);
				}
			}
		});
		btnNewButton.setBounds(29, 291, 128, 21);
		contentPane.add(btnNewButton);
	}
}
