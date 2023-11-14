package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class LogIn extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
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
	public LogIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 200, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder());
		panel.setBounds(140, 33, 311, 292);
		contentPane.add(panel);
		panel.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel nhan = new JLabel("Log In");
		nhan.setFont(new Font("Import", Font.ITALIC, 30));
		nhan.setBounds(110 , 30, 200, 50);
		nhan.setForeground(new Color(255,0,0));
		panel.add(nhan);
		
		JTextField o1 = new JTextField();
		o1.setForeground(new Color(0, 0, 0));
		o1.setBounds(70, 100, 172, 31);
		o1.setFont(new Font("Import", Font.ITALIC, 15));
		panel.add(o1);
		o1.setColumns(5);
		
		JPasswordField o2 = new JPasswordField();
		o2.setBounds(70, 142, 172, 31);
		o2.setFont(new Font("Import", Font.ITALIC, 15));
		o2.setForeground(new Color(0,0,0));
		panel.add(o2);
		o2.setColumns(5);
		
		JCheckBox check = new JCheckBox("Remember password?");
		check.setBounds(100, 180, 150, 20);
		check.setFont(new Font("Times New Roman", Font.ITALIC, 10));
		setLocationRelativeTo(null);
		panel.add(check);
			
	
		
		JButton nut = new JButton("Log In");
		nut.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println(o1.getText());
				System.out.println(o2.getText());

			}
		});
		nut.setBounds(100, 210, 100, 31);
		nut.setForeground(new Color(255,0,0));
		panel.add(nut);
		
	
	}
}
