package Caculator;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiniCaculator extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					MiniCaculator frame = new MiniCaculator();
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
	public MiniCaculator() {

		setTitle("Caculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JPanel background = new JPanel();
		background.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(background);
		background.setLayout(null);

		JLabel label1 = new JLabel("Number 1: ");
		label1.setBounds(50, 10, 100, 100);
		background.add(label1);

		JTextField text1 = new JTextField();
		text1.setBounds(150, 50, 200, 30);
		background.add(text1);

		JLabel label2 = new JLabel("Number 2: ");
		label2.setBounds(50, 60, 100, 100);
		background.add(label2);

		JTextField text2 = new JTextField();
		text2.setBounds(150, 100, 200, 30);
		background.add(text2);

		JLabel label3 = new JLabel("Result: ");
		label3.setBounds(50, 110, 100, 100);
		background.add(label3);

		JTextField text3 = new JTextField();
		text3.setBounds(150, 150, 200, 30);
		background.add(text3);

		JButton button1 = new JButton("+");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(text1.getText());
				double num2 = Double.parseDouble(text2.getText());

				double add = 0;
				add = num1 + num2;
				text3.setText(add + " ");
				;
			}
		});
		button1.setBounds(50, 200, 50, 30);
		background.add(button1);

		JButton button2 = new JButton("-");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(text1.getText());
				double num2 = Double.parseDouble(text2.getText());
				double sub = 0;
				sub = num1 - num2;
				text3.setText(sub + "");
			}
		});
		button2.setBounds(150, 200, 50, 30);
		background.add(button2);

		JButton button3 = new JButton("x");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(text1.getText());
				double num2 = Double.parseDouble(text2.getText());
				double mul = 0;
				mul = num1 * num2;
				text3.setText(mul + "");
			}
		});
		button3.setBounds(250, 200, 50, 30);
		background.add(button3);

		JButton button4 = new JButton("/");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(text1.getText());
				double num2 = Double.parseDouble(text2.getText());
				double div = 0;
				div = num1 / num2;
				text3.setText(div + "");
			}
		});
		button4.setBounds(350, 200, 50, 30);
		background.add(button4);

	}

}
