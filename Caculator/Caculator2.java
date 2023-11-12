package Caculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

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
		background.setLayout(new BorderLayout());

		JPanel view1 = new JPanel();
		view1.setBounds(34, 11, 419, 60);
		view1.setLayout(new BorderLayout());
		background.add(view1, BorderLayout.NORTH);
		
		JTextField text = new JTextField();
		text.setBounds(0, 0, 409, 50);
		text.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		view1.add(text, BorderLayout.NORTH);

		JPanel view2 = new JPanel();
		view2.setBounds(34, 100, 407, 233);
		view2.setLayout(new GridLayout(4,5));
		background.add(view2, BorderLayout.CENTER);
		
		JButton button7 = new JButton("7");
		view2.add(button7);
		
		JButton button8 = new JButton("8");	
		view2.add(button8);
		
		JButton button9 = new JButton("9");
		view2.add(button9);
		
		JButton buttonCong = new JButton("+");
		view2.add(buttonCong);
		
		JButton button4 = new JButton("4");
		view2.add(button4);
		
		JButton button5 = new JButton("5");
		view2.add(button5);
		
		JButton button6 = new JButton("6");
		view2.add(button6);
		
		JButton buttonTru = new JButton("-");
		view2.add(buttonTru);
		
		JButton button1 = new JButton("1");
		view2.add(button1);
		
		JButton button2 = new JButton("2");	
		view2.add(button2);
		
		JButton button3 = new JButton("3");
		view2.add(button3);
		
		JButton buttonNhan = new JButton("x");
		view2.add(buttonNhan);
		
		JButton button0 = new JButton("0");
		view2.add(button0);
		
		JButton buttonCham = new JButton(".");
		view2.add(buttonCham);
		
		JButton result = new JButton("=");
		view2.add(result);
		
		JButton buttonChia = new JButton("/");
		view2.add(buttonChia);
		
		

	}
}