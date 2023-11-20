package Exercise;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Ex2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private int cout = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex2 frame = new Ex2();
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
	public Ex2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setForeground(new Color(128, 255, 0));
		panel.setLocation(30, 11);
		panel.setSize(500, 300);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 37));
		lblNewLabel.setBounds(234, 57, 94, 74);
		panel.add(lblNewLabel);

		JButton btnNewButton = new JButton("Add");
		btnNewButton.setForeground(new Color(0, 255, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cout++;
				lblNewLabel.setText("" + cout);
			}

		});
		btnNewButton.setBounds(100, 151, 140, 50);
		panel.add(btnNewButton);

		JButton btnNewButton1 = new JButton("Sub");
		btnNewButton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cout--;
				lblNewLabel.setText(" " + cout);

			}
		});

		btnNewButton1.setBounds(300, 151, 140, 50);
		panel.add(btnNewButton1);

	}
}
