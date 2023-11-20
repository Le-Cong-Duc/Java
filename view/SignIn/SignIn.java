package SignIn;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import Menu.Menu;
import SignUp.SignUp;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class SignIn extends JFrame {
	private JTextField txt;
	private JPasswordField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn frame = new SignIn();
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
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
	public Icon getIcon(int index) {
		int width = 52;
		int height = 56;
		Image image = new ImageIcon(getClass().getResource("/images/pokemon/pieces" + index + ".png")).getImage();
		Icon icon = new ImageIcon(image.getScaledInstance(width, height, image.SCALE_SMOOTH));
		return icon;
	}
	public SignIn() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Le Cong Duc");
		setSize(609, 417);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		java.net.URL icon = SignIn.class.getResource("1.png");
		Image image = Toolkit.getDefaultToolkit().createImage(icon);
		this.setIconImage(image);

		JPanel background = new JPanel();
		background.setLocation(0, 0);
		background.setBackground(new Color(255, 255, 255));
		background.setSize(600, 380);
		background.setLayout(null);
		getContentPane().add(background);

		JPanel Left = new JPanel();
		Left.setBounds(0, 0, 250, 380);
		Left.setBackground(new Color(255, 255, 255));
		background.add(Left);
		Left.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(45, 42, 167, 175);
		Left.add(lblNewLabel);
		
		Image img = Toolkit.getDefaultToolkit().createImage(SignIn.class.getResource("1.png"));
		lblNewLabel.setIcon(new ImageIcon(img));
		
		JLabel lblNewLabel_1 = new JLabel("Le Cong Duc");
		lblNewLabel_1.setForeground(new Color(255, 128, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(55, 228, 137, 37);
		Left.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Back Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Menu menu = new Menu();
				 menu.setVisible(true);
				 menu.setLocationRelativeTo(null);
				 setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(76, 293, 100, 23);
		Left.add(btnNewButton);

		JPanel Right = new JPanel();
		Right.setBackground(new Color(255, 255, 255));
		Right.setBounds(250, 0, 350, 380);
		Right.setLayout(null);
		background.add(Right);

		JLabel Title = new JLabel("Sign In");
		Title.setForeground(new Color(255, 0, 0));
		Title.setFont(new Font("VNI-Cooper", Font.BOLD, 24));
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		Title.setBounds(90, 22, 165, 43);
		Right.add(Title);

		JLabel lbl1 = new JLabel("Email or phone number:");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl1.setBounds(43, 91, 132, 14);
		Right.add(lbl1);

		txt = new JTextField();
		txt.setBounds(43, 116, 247, 30);
		Right.add(txt);
		txt.setColumns(10);

		JLabel lbl2 = new JLabel("Password:");
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl2.setBounds(43, 165, 132, 14);
		Right.add(lbl2);

		txtPass = new JPasswordField();
		txtPass.setBounds(43, 190, 247, 30);
		Right.add(txtPass);

		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setForeground(new Color(255, 0, 0));
		btnSignIn.setBackground(new Color(0, 0, 0));
		btnSignIn.setBounds(43, 243, 104, 30);
		Right.add(btnSignIn);

		JLabel lbl3 = new JLabel("I don't have an account");
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl3.setForeground(new Color(0, 64, 128));
		lbl3.setBounds(43, 304, 132, 14);
		Right.add(lbl3);

		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SignUp signUp = new SignUp();
				signUp.setVisible(true);
				signUp.setLocationRelativeTo(null);
				setVisible(false);

			}
		});
		btnSignUp.setForeground(new Color(255, 128, 64));
		btnSignUp.setBackground(new Color(255, 255, 255));
		btnSignUp.setBounds(186, 300, 104, 30);
		Right.add(btnSignUp);

	}
}
