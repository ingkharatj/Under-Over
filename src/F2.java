
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class F2 extends JFrame {
	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();
	static int money;
	private JTextField Roll1;
	private JTextField Roll2;
	private JTextField Result;
	private JLabel lblYourMoney;
	private JTextField TYourmoney;
	private JLabel lblYourBet;
	private JTextField Yourbet1;
	private JTextField Result1;
	private JTextField Result2;
	private JTextField Yourbet2;
	private JLabel lblNewLabel_1;

	static int newRandom() {
		return rand.nextInt(6) + 1;
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				F2 form = new F2();
				form.setVisible(true);
			}
		});
	}

	public F2() {

		super("Under & Over");
		getContentPane().setBackground(new Color(255, 228, 225));
		getContentPane().setForeground(Color.BLACK);
		setSize(1280, 720);
		setLocation(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		Roll1 = new JTextField();
		Roll1.setBackground(new Color(224, 255, 255));
		Roll1.setHorizontalAlignment(SwingConstants.CENTER);
		Roll1.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		Roll1.setEditable(false);
		Roll1.setBounds(622, 485, 217, 142);
		getContentPane().add(Roll1);
		Roll1.setColumns(10);

		Roll2 = new JTextField();
		Roll2.setBackground(new Color(230, 230, 250));
		Roll2.setHorizontalAlignment(SwingConstants.CENTER);
		Roll2.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 60));
		Roll2.setEditable(false);
		Roll2.setBounds(945, 485, 211, 142);
		getContentPane().add(Roll2);
		Roll2.setColumns(10);

		JButton btnRoll = new JButton("Roll");
		btnRoll.setBackground(new Color(255, 99, 71));
		btnRoll.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		btnRoll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int a = newRandom();
				int b = newRandom();
				int guess;
				int bet;

				try {
					int sum = a + b;
					Roll1.setText(Integer.toString(a));
					Roll2.setText(Integer.toString(b));
					Result.setText(Integer.toString(sum));
					guess = Integer.parseInt(Result1.getText());
					Result2.setText(Integer.toString(guess));

					if (money <= 0) {
						JOptionPane.showMessageDialog(null, "You don't have enough\n" + "This program will close");
						setVisible(false);
						dispose();

					}
					bet = Integer.parseInt(Yourbet1.getText());
					if (bet > money) {
						money = money + bet;
						JOptionPane.showMessageDialog(null, "Please put new bet");
					}
					Yourbet2.setText(Integer.toString(bet));
					if ((guess == sum) && (sum <= 6) && (sum >= 2)) {

						money = money + bet * 3;
						TYourmoney.setText(Integer.toString(money));
					}
					if ((guess == sum) && (sum >= 8) && (sum <= 12)) {
						money = money + bet * 3;
						TYourmoney.setText(Integer.toString(money));
					}
					if ((guess == sum) && (sum == 7)) {
						money = money + bet * 5;
						TYourmoney.setText(Integer.toString(money));
					} else {
						if (money <= 0) {
							JOptionPane.showMessageDialog(null, "You don't have enough\n" + "This program will close");
							setVisible(false);
							dispose();

						}
						money = money - bet;
						TYourmoney.setText(Integer.toString(money));

					}

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter valid number :D");

				}
			}
		});
		btnRoll.setBounds(30, 544, 491, 79);
		getContentPane().add(btnRoll);

		JLabel lblResult = new JLabel("Result is");
		lblResult.setForeground(Color.CYAN);
		lblResult.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		lblResult.setBounds(622, 83, 266, 73);
		getContentPane().add(lblResult);

		Result = new JTextField();
		Result.setHorizontalAlignment(SwingConstants.CENTER);
		Result.setBackground(new Color(127, 255, 212));
		Result.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		Result.setEditable(false);
		Result.setBounds(622, 172, 323, 126);
		getContentPane().add(Result);
		Result.setColumns(10);

		lblYourMoney = new JLabel("Your money");
		lblYourMoney.setForeground(Color.CYAN);
		lblYourMoney.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		lblYourMoney.setBounds(31, 38, 429, 79);
		getContentPane().add(lblYourMoney);

		TYourmoney = new JTextField();

		TYourmoney.setBackground(new Color(253, 245, 230));
		TYourmoney.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		TYourmoney.setEditable(false);
		TYourmoney.setText(Integer.toString(money));
		TYourmoney.setBounds(31, 120, 278, 70);
		getContentPane().add(TYourmoney);
		TYourmoney.setColumns(10);

		lblYourBet = new JLabel("Your bet");
		lblYourBet.setForeground(Color.CYAN);
		lblYourBet.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		lblYourBet.setBounds(35, 346, 295, 63);
		getContentPane().add(lblYourBet);

		Yourbet1 = new JTextField();
		Yourbet1.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		Yourbet1.setBounds(31, 426, 146, 54);
		getContentPane().add(Yourbet1);
		Yourbet1.setColumns(10);

		Result1 = new JTextField();
		Result1.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		Result1.setBounds(31, 285, 125, 45);
		getContentPane().add(Result1);
		Result1.setColumns(10);

		Result2 = new JTextField();
		Result2.setBackground(new Color(255, 240, 245));
		Result2.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		Result2.setEditable(false);
		Result2.setBounds(184, 285, 125, 45);
		getContentPane().add(Result2);
		Result2.setColumns(10);

		Yourbet2 = new JTextField();
		Yourbet2.setBackground(new Color(255, 240, 245));
		Yourbet2.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		Yourbet2.setEditable(false);
		Yourbet2.setBounds(206, 426, 146, 54);
		getContentPane().add(Yourbet2);
		Yourbet2.setColumns(10);

		JLabel lblNewLabel = new JLabel("Result that you think?");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		lblNewLabel.setBounds(30, 206, 440, 73);
		getContentPane().add(lblNewLabel);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Ing\\Desktop\\bc3.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1258, 664);
		getContentPane().add(lblNewLabel_1);

	}
}
