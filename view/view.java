package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class view extends JFrame {

	private JPanel view;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view frame = new view();
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
	public view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 800, 600);
		view = new JPanel();
		view.setBackground(new Color(255, 255, 255));
		view.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(view);
		view.setLayout(null);

		JLabel title = new JLabel("Dang Nhap");
		title.setBounds(281, 70, 141, 56);
		title.setFont(new Font("Playbill", Font.PLAIN, 55));
		title.setForeground(new Color(0, 0, 0));
		view.add(title);

		JTextField account = new JTextField();
		account.setBounds(222, 173, 424, 49);
		account.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		account.setColumns(10);
		setLocationRelativeTo(null);
		view.add(account);
		
		JPasswordField  password = new JPasswordField();
		password.setBounds(222, 250, 424, 49);
		password.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		view.add(password);


		JLabel nhan1 = new JLabel("Account : ");
		nhan1.setForeground(new Color(0, 0, 0));
		nhan1.setBounds(87,171, 424, 49);
		nhan1.setFont(new Font("Impact", Font.ITALIC, 20));
		view.add(nhan1);

		JLabel nhan2 = new JLabel("Password : ");
		nhan2.setForeground(new Color(0, 0, 0));
		nhan2.setBounds(87,250, 424, 49);
		nhan2.setFont(new Font("Impact", Font.ITALIC, 20));
		view.add(nhan2);

		JButton nut = new JButton(" Log In ");
		nut.setFont(new Font("Impart", Font.ITALIC, 15));
		nut.setBounds(264,360, 154, 49);
		nut.setForeground(new Color(255, 0, 0));
		view.add(nut);

		JCheckBox checkBox = new JCheckBox("Nhớ mật khảu ?");
		checkBox.setFont(new Font("Impart", Font.ITALIC, 15));
		checkBox.setBounds(264,306, 158, 49);
		view.add(checkBox);
		
	}
}
