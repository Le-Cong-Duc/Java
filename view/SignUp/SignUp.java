package SignUp;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import SignIn.SignIn;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Le Cong Duc");
		setSize(609, 417);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		java.net.URL logo = SignIn.class.getResource("1.png");
		Image image = Toolkit.getDefaultToolkit().createImage(logo);
		setIconImage(image);

		JPanel background = new JPanel();
		background.setLocation(0, 0);
		background.setBackground(new Color(255, 255, 255));
		background.setSize(600, 380);
		background.setLayout(null);
		getContentPane().add(background);

		JPanel Left = new JPanel();
		Left.setBounds(0, 0, 250, 380);
		Left.setBackground(new Color(0, 0, 0));
		background.add(Left);
		Left.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Le Cong Duc");
		lblNewLabel_1.setForeground(new Color(255, 128, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(55, 228, 137, 37);
		Left.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel(" ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(21, 68, 206, 200);
		Left.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(SignIn.class.getResource("1.png"))));

		JPanel Right = new JPanel();
		Right.setBackground(new Color(255, 255, 255));
		Right.setBounds(250, 0, 350, 380);
		Right.setLayout(null);
		background.add(Right);

		JLabel Title = new JLabel("Sign Up");
		Title.setForeground(new Color(255, 0, 0));
		Title.setFont(new Font("VNI-Cooper", Font.BOLD, 24));
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		Title.setBounds(90, 22, 165, 43);
		Right.add(Title);

		JLabel lbl1 = new JLabel("Full name");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl1.setBounds(43, 76, 132, 14);
		Right.add(lbl1);

		JTextField name = new JTextField();
		name.setBounds(43, 101, 247, 30);
		Right.add(name);
		name.setColumns(10);

		JLabel lbl2 = new JLabel("Password:");
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl2.setBounds(43, 209, 132, 14);
		Right.add(lbl2);

		JPasswordField password = new JPasswordField();
		password.setBounds(43, 234, 247, 30);
		Right.add(password);

		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(name.getText().equals("") || email.getText().equals("") ) {
					JOptionPane.showMessageDialog(null, "please fill complete information ");
				}
				else {
				// TODO Auto-generated method stub
				name.setText("");
				email.setText("");
				password.setText("");
				JOptionPane.showMessageDialog(null, "create successfully");
				}
			}
		});

		btnSignUp.setForeground(new Color(255, 0, 0));
		btnSignUp.setBackground(new Color(0, 0, 0));
		btnSignUp.setBounds(43, 283, 104, 30);
		Right.add(btnSignUp);

		JLabel lbl3 = new JLabel("I 've an account");
		lbl3.setForeground(new Color(0, 64, 128));
		lbl3.setBounds(43, 324, 132, 14);
		Right.add(lbl3);

		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SignIn signIn = new SignIn();
				signIn.setVisible(true);
				signIn.setLocationRelativeTo(null);
				setVisible(false);

			}
		});

		btnSignIn.setForeground(new Color(255, 128, 64));
		btnSignIn.setBackground(new Color(255, 255, 255));
		btnSignIn.setBounds(186, 316, 104, 30);
		Right.add(btnSignIn);

		email = new JTextField();
		email.setColumns(10);
		email.setBounds(43, 168, 247, 30);
		Right.add(email);

		JLabel lbl1_1 = new JLabel("Email :");
		lbl1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl1_1.setBounds(43, 142, 132, 14);
		Right.add(lbl1_1);

		setVisible(true);
	}
}
