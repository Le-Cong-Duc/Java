package Exercise;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex6 extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;

	private String gender;
	private String degree;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex6 frame = new Ex6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ex6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel form = new JPanel();
		form.setBorder(
				new TitledBorder(
						new TitledBorder(
								new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255),
										new Color(160, 160, 160)),
								"Employee Information", TitledBorder.LEADING, TitledBorder.TOP, null,
								new Color(0, 0, 0)),
						"", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		form.setBounds(88, 88, 450, 246);
		contentPane.add(form);
		form.setLayout(null);

		JLabel TieuDe = new JLabel("Information");
		TieuDe.setBounds(200, 25, 292, 48);
		TieuDe.setForeground(new Color(255, 0, 0));
		TieuDe.setFont(new Font("Import", Font.ITALIC, 50));
		contentPane.add(TieuDe);

		JLabel label1 = new JLabel("Code: ");
		label1.setBounds(30, 39, 67, 14);
		label1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		form.add(label1);

		JLabel label2 = new JLabel("Name: ");
		label2.setBounds(30, 78, 67, 14);
		label2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		form.add(label2);

		JLabel label3 = new JLabel("Gender: ");
		label3.setBounds(30, 110, 67, 14);
		label3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		form.add(label3);

		JLabel label4 = new JLabel("Degree: ");
		label4.setBounds(30, 135, 67, 29);
		label4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		form.add(label4);

		text1 = new JTextField();
		text1.setBounds(140, 37, 249, 20);
		form.add(text1);
		text1.setColumns(10);
 
		text2 = new JTextField();
		text2.setBounds(140, 76, 249, 20);
		form.add(text2);
		text2.setColumns(10);

		JLabel label = new JLabel("");
		label.setForeground(new Color(255, 0, 0));
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(30, 175, 387, 60);
		form.add(label);

		JRadioButton rdmale = new JRadioButton("Male");
		rdmale.setBounds(140, 107, 92, 23);
		form.add(rdmale);

		JRadioButton rdFemale = new JRadioButton("Female");
		rdmale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdmale.isSelected()) {
					gender = "Male";
				}
			}
		});
		rdFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdFemale.isSelected()) {
					gender = "Female";
				}
			}
		});
		rdFemale.setBounds(265, 107, 99, 23);
		form.add(rdFemale);

		ButtonGroup G = new ButtonGroup();
		G.add(rdmale);
		G.add(rdFemale);

		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				degree = comboBox.getSelectedItem().toString();
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "", "Student", "Teacher", "", }));

		comboBox.setBounds(140, 139, 150, 22);
		form.add(comboBox);

		JButton Button1 = new JButton("Show");
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String information;
				information = "Code: " + text1.getText() + ",  Name: " + text2.getText() + ",  gender: " + gender
						+ ",  degree: " + degree;
				label.setText(information);
			}
		});
		Button1.setBounds(130, 338, 129, 36);
		Button1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Button1.setForeground(new Color(255, 0, 0));
		contentPane.add(Button1);

		JButton Button2 = new JButton("Exit");

		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		Button2.setBounds(363, 338, 129, 36);
		Button2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Button2.setForeground(new Color(255, 0, 0));
		contentPane.add(Button2);

	}
}
