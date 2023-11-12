package Caculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;

public class Caculator extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Caculator frame = new Caculator();
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
	public Caculator() {

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		setTitle("Caculator");
		setLocationRelativeTo(null);
		JPanel background = new JPanel();
		setContentPane(background);
		background.setLayout(null);

		JPanel view1 = new JPanel();
		view1.setBounds(34, 11, 419, 60);
		background.add(view1);
		view1.setLayout(null);

		JTextField text = new JTextField();
		text.setBounds(0, 11, 409, 50);
		text.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		view1.add(text);

		JPanel view2 = new JPanel();
		view2.setBounds(34, 100, 407, 233);
		view2.setLayout(new FlowLayout(FlowLayout.LEFT, 4, 4));
		background.add(view2);
		
		JButton button1 = new JButton("1");
		button1.setBounds(200, 100, 100, 100);
		view2.add(button1);
		
		JButton button2 = new JButton("2");
		button2.setBounds(200, 100, 100, 100);
		view2.add(button2);
		
		JButton button3 = new JButton("3");
		button3.setBounds(200, 100, 100, 100);
		view2.add(button3);
		
		JButton button4 = new JButton("4");
		button4.setBounds(200, 100, 100, 100);
		view2.add(button4);
		
		JButton button5 = new JButton("5");
		button5.setBounds(200, 100, 100, 100);
		view2.add(button5);
		
		JButton button6 = new JButton("6");
		button6.setBounds(200, 100, 100, 100);
		view2.add(button6);

	}
}
