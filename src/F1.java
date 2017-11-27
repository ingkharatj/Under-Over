import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class F1 {

	static int moneyn;
	private JFrame frame;
	private JTextField txtUnderOver;
	private JTextField textField;
	private JLabel lblYourStartMoney;
	private JLabel lblNewLabel;
	private JTextField txtPleaseDontPut;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F1 window = new F1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public F1() {

		initialize();
	}

	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 228, 225));
		frame.getContentPane().setLayout(null);

		txtUnderOver = new JTextField();
		txtUnderOver.setBackground(Color.PINK);
		txtUnderOver.setHorizontalAlignment(SwingConstants.CENTER);
		txtUnderOver.setFont(new Font("Comic Sans MS", Font.BOLD, 87));
		txtUnderOver.setForeground(Color.DARK_GRAY);
		txtUnderOver.setText("Under & Over");
		txtUnderOver.setEditable(false);
		txtUnderOver.setBounds(40, 28, 842, 142);
		frame.getContentPane().add(txtUnderOver);
		txtUnderOver.setColumns(10);

		JButton btnNewButton = new JButton("Play");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				moneyn = Integer.parseInt(textField.getText());
				textField.setText(Integer.toString(moneyn));
				F2.money = moneyn;

				F2 f2 = new F2();
				f2.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 65));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBounds(596, 390, 286, 136);
		frame.getContentPane().add(btnNewButton);

		textField = new JTextField();

		textField.setBackground(new Color(127, 255, 212));
		textField.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		textField.setBounds(535, 277, 251, 70);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		lblYourStartMoney = new JLabel("Your start money");
		lblYourStartMoney.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		lblYourStartMoney.setBounds(535, 174, 357, 68);
		frame.getContentPane().add(lblYourStartMoney);

		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ing\\Desktop\\zar_1488853.gif"));
		lblNewLabel.setBounds(146, 202, 432, 370);
		frame.getContentPane().add(lblNewLabel);
		
		txtPleaseDontPut = new JTextField();
		txtPleaseDontPut.setEditable(false);
		txtPleaseDontPut.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		txtPleaseDontPut.setBackground(Color.PINK);
		txtPleaseDontPut.setText("Please don't put more than 999,999,999");
		txtPleaseDontPut.setBounds(535, 245, 347, 26);
		frame.getContentPane().add(txtPleaseDontPut);
		txtPleaseDontPut.setColumns(10);
		frame.setBounds(100, 100, 966, 628);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
