package Exercise;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class test extends JFrame {

	private JPanel contentPane;
	private JTextField ID;
	private JTextField Name;
	private JTextField Contact;
	private JTextField Course;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
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
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(0, 0, 659, 449);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel label1 = new JLabel("ID");
		label1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label1.setBounds(46, 45, 83, 34);
		panel.add(label1);

		JLabel label2 = new JLabel("Name");
		label2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label2.setBounds(46, 116, 83, 34);
		panel.add(label2);

		JLabel label3 = new JLabel("Contact");
		label3.setFont(new Font("Tahoma", Font.BOLD, 15));
		label3.setBounds(46, 183, 83, 34);
		panel.add(label3);

		JLabel label4 = new JLabel("Course");
		label4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label4.setBounds(46, 250, 83, 34);
		panel.add(label4);

		ID = new JTextField();
		ID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ID.setBounds(124, 45, 191, 34);
		panel.add(ID);
		ID.setColumns(10);

		Name = new JTextField();
		Name.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Name.setColumns(10);
		Name.setBounds(124, 116, 191, 34);
		panel.add(Name);

		Contact = new JTextField();
		Contact.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Contact.setColumns(10);
		Contact.setBounds(124, 183, 191, 34);
		panel.add(Contact);

		Course = new JTextField();
		Course.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Course.setColumns(10);
		Course.setBounds(124, 250, 191, 34);
		panel.add(Course);

		JButton Add = new JButton("Add");
		Add.setFont(new Font("Tahoma", Font.BOLD, 14));
		Add.setBounds(46, 313, 116, 34);
		panel.add(Add);

		JButton Update = new JButton("Update");
		Update.setFont(new Font("Tahoma", Font.BOLD, 14));
		Update.setBounds(216, 313, 116, 34);
		panel.add(Update);

		JButton Delete = new JButton("Delete");
		Delete.setFont(new Font("Tahoma", Font.BOLD, 14));
		Delete.setBounds(46, 378, 116, 34);
		panel.add(Delete);

		JButton Clear = new JButton("Clear");
		Clear.setFont(new Font("Tahoma", Font.BOLD, 14));
		Clear.setBounds(216, 378, 116, 34);
		panel.add(Clear);
	}
}
