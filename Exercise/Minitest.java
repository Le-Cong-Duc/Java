package Exercise;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.ScrollPane;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.xml.transform.Source;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Minitest extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JTextField name;
	private JTextField contact;
	private JTextField course;
	private JLabel lblName;
	private JLabel lblContact;
	private JLabel lblCoursel;
	DefaultTableModel model;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Minitest frame = new Minitest();
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
	public Minitest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Table");
		setBounds(100, 100, 737, 453);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		URL icon = Minitest.class.getResource("table.png");
		Image img = Toolkit.getDefaultToolkit().createImage(icon);
		this.setIconImage(img);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		id = new JTextField();
		id.setBounds(132, 51, 194, 27);
		contentPane.add(id);
		id.setColumns(10);

		JLabel lblNewLabel = new JLabel("ID :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(30, 51, 71, 27);
		contentPane.add(lblNewLabel);

		name = new JTextField();
		name.setColumns(10);
		name.setBounds(132, 115, 194, 27);
		contentPane.add(name);

		contact = new JTextField();
		contact.setColumns(10);
		contact.setBounds(132, 177, 194, 27);
		contentPane.add(contact);

		course = new JTextField();
		course.setColumns(10);
		course.setBounds(132, 236, 194, 27);
		contentPane.add(course);

		lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setBounds(30, 115, 71, 27);
		contentPane.add(lblName);

		lblContact = new JLabel("Contact:");
		lblContact.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblContact.setHorizontalAlignment(SwingConstants.LEFT);
		lblContact.setBounds(30, 177, 71, 27);
		contentPane.add(lblContact);

		lblCoursel = new JLabel("Course:");
		lblCoursel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCoursel.setHorizontalAlignment(SwingConstants.LEFT);
		lblCoursel.setBounds(30, 236, 71, 27);
		contentPane.add(lblCoursel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(387, 57, 311, 305);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			public void MouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				id.setText(model.getValueAt(i, 0).toString());
				name.setText(model.getValueAt(i, 1).toString());
				contact.setText(model.getValueAt(i, 2).toString());
				course.setText(model.getValueAt(i, 3).toString());
			}
		});
		model = new DefaultTableModel();
		Object[] column = { "ID", "Name", "Contact", "Sourse" };
		final Object[] row = new Object[4];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);

		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (id.getText().equals("") || name.getText().equals("") || contact.getText().equals("")
						|| course.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please fill complete information!");
				} else {
					row[0] = id.getText();
					row[1] = name.getText();
					row[2] = contact.getText();
					row[3] = course.getText();

					model.addRow(row);
					id.setText("");
					name.setText("");
					contact.setText("");
					course.setText("");

				}
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(30, 295, 101, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int i = table.getSelectedRow();
				if (i >= 0) {
					model.setValueAt(id.getText(), i, 0);
					model.setValueAt(name.getText(), i, 1);
					model.setValueAt(contact.getText(), i, 2);
					model.setValueAt(course.getText(), i, 3);
				} else {
					JOptionPane.showMessageDialog(null, "Please choice row");
				}
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(212, 295, 114, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				if (i >= 0) {
					model.removeRow(i);
				} else {
					JOptionPane.showMessageDialog(null, "Please choice row");
				}

			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(30, 342, 101, 23);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clear");
		btnNewButton_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				id.setText("");
				name.setText("");
				contact.setText("");
				course.setText("");
			}
		});
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(0, 0, 0));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBounds(212, 342, 114, 23);
		contentPane.add(btnNewButton_3);

		JLabel lblNewLabel_1 = new JLabel("Information");
		lblNewLabel_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(128, 11, 222, 29);
		contentPane.add(lblNewLabel_1);

	}
}
