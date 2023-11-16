package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewAccount extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewAccount frame = new NewAccount();
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
	public NewAccount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBounds(100, 100, 500, 400);
		panel.setLayout(new BorderLayout());
		contentPane.add(panel, BorderLayout.CENTER);

		JPanel panel2 = new JPanel();
		panel.add(panel2, BorderLayout.WEST);

		JPanel panel3 = new JPanel();
		panel.add(panel3, BorderLayout.EAST);

		JLabel lblNewLabel = new JLabel("'     '");
		panel3.add(lblNewLabel);

		JButton btn = new JButton("<<");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View view2 = new View();
				setVisible(false);
			}
		});
		btn.setBounds(0, 0, 100, 100);
		btn.setFont(new Font("Times New Roman", Font.BOLD, 10));
		panel2.add(btn);

		JLabel title = new JLabel("Create new Account");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Times New Roman", Font.BOLD, 30));
		title.setForeground(new Color(255, 0, 0));
		panel.add(title, BorderLayout.NORTH);

		JPanel panelCenter = new JPanel();
		panelCenter.setBounds(150, 50, 300, 200);
		panelCenter.setLayout(new GridLayout(0, 1));
		panel.add(panelCenter, BorderLayout.CENTER);

		JLabel label_ = new JLabel("_____________________________________________________");
		panelCenter.add(label_);

		JLabel Name = new JLabel("Enter your name: ");
		Name.setSize(100, 100);
		panelCenter.add(Name, BorderLayout.CENTER);

		JTextField txt1 = new JTextField();
		panelCenter.add(txt1);

		JLabel Account = new JLabel("Enter your account: ");
		Account.setSize(100, 100);
		panelCenter.add(Account, BorderLayout.CENTER);

		JTextField txt2 = new JTextField();
		panelCenter.add(txt2);

		JLabel Password = new JLabel("Enter your password: ");
		Password.setSize(100, 100);
		panelCenter.add(Password, BorderLayout.CENTER);

		JTextField txt3 = new JTextField();
		panelCenter.add(txt3);

		JLabel label = new JLabel(" ");
		panelCenter.add(label);

		JButton Create = new JButton("Create");
		Create.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String information;
				String information2;
				information = "Account: "+ txt2.getText() ;
				information2= " Password: "+txt3.getText();
				Message mess = new Message();
				mess.lblNewLabel.setText(information);
				mess.lblNewLabel2.setText(information2);
			}
		});
		
		Create.setForeground(new Color(255, 0, 0));
		Create.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panelCenter.add(Create);

		setVisible(true);

	}

}
