package view2;

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

public class View extends JFrame {

	private JPanel view;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
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
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 800, 600);
		view = new JPanel();
		view.setBackground(new Color(255, 255, 255));
		view.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(view);

		JLabel title = new JLabel("Dang Nhap");
		title.setFont(new Font("Playbill", Font.PLAIN, 55));
		title.setForeground(new Color(0, 0, 0));

		JTextField account = new JTextField();
		account.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		account.setColumns(10);
		setLocationRelativeTo(null);
		
		JPasswordField  password = new JPasswordField();
		password.setFont(new Font("Times New Roman", Font.PLAIN, 20));


		JLabel nhan1 = new JLabel("Account : ");
		nhan1.setForeground(new Color(0, 0, 0));
		nhan1.setFont(new Font("Impact", Font.ITALIC, 20));

		JLabel nhan2 = new JLabel("Password : ");
		nhan2.setForeground(new Color(0, 0, 0));
		nhan2.setFont(new Font("Impact", Font.ITALIC, 20));

		JButton nut = new JButton(" Log In ");
		nut.setFont(new Font("Impart", Font.ITALIC, 15));
		nut.setForeground(new Color(255, 0, 0));

		JCheckBox checkBox = new JCheckBox("Nhớ mật khảu ?");
		checkBox.setFont(new Font("Impart", Font.ITALIC, 15));
		GroupLayout gl_view = new GroupLayout(view);
		gl_view.setHorizontalGroup(
			gl_view.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_view.createSequentialGroup()
					.addGap(318)
					.addComponent(title, GroupLayout.PREFERRED_SIZE, 543, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_view.createSequentialGroup()
					.addGap(75)
					.addGroup(gl_view.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_view.createSequentialGroup()
							.addGap(120)
							.addComponent(account, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE))
						.addComponent(nhan1, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_view.createSequentialGroup()
					.addGap(75)
					.addGroup(gl_view.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_view.createSequentialGroup()
							.addGap(120)
							.addComponent(password, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE))
						.addComponent(nhan2, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_view.createSequentialGroup()
					.addGap(294)
					.addComponent(checkBox, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_view.createSequentialGroup()
					.addGap(293)
					.addComponent(nut, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
		);
		gl_view.setVerticalGroup(
			gl_view.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_view.createSequentialGroup()
					.addGap(91)
					.addComponent(title, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(80)
					.addGroup(gl_view.createParallelGroup(Alignment.LEADING)
						.addComponent(account, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(nhan1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_view.createParallelGroup(Alignment.LEADING)
						.addComponent(password, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(nhan2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addGap(25)
					.addComponent(checkBox, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(nut, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
		);
		view.setLayout(gl_view);
		
		
	}
}
