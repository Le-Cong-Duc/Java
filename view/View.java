package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;

public class View extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setBounds(100, 100, 500, 300);
		panel.setLayout(new BorderLayout());

		JLabel label1 = new JLabel("Menu");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel.add(label1, BorderLayout.NORTH);

		JButton btn1 = new JButton("Sign In");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogIn login = new LogIn();
			}
		});
		btn1.setBounds(112, 20, 237, 53);

		JButton btn2 = new JButton("Register a new Account");
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				NewAccount accout = new NewAccount();
			}
		});
		btn2.setBounds(112, 100, 237, 53);

		JButton btn3 = new JButton(" Exit ");
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		btn3.setBounds(112, 180, 237, 53);

		JPanel panelCenter = new JPanel();
		panel.add(panelCenter, BorderLayout.CENTER);
		panelCenter.setLayout(new GridLayout(0, 1));
		panelCenter.add(btn1);
		panelCenter.add(btn2);
		panelCenter.add(btn3);

		JLabel label2 = new JLabel("Menu Accout");
		label2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(label2, BorderLayout.SOUTH);

	}
}
