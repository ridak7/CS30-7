/*Create an application that prompts the user for an integer and then displays
a message indicating whether the number is divisible by 3.*/

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class DivisibleBy3 {

	/**
	 * Initialize variables
	 */
	private JFrame frmDivisibleby;
	private JTextField intLabel;
	public int num;
	public JLabel ansLabel = new JLabel("");
	
	
	/**
	 * Get the number from the text box
	 */
	public int get()
	{
		num = Integer.parseInt(intLabel.getText());
		return num;
	}
	
	
	/**
	 * Find the remainder when the number is divisible by 3
	 * True when remainder is > 0
	 * False when remainder is < 0
	 * @return true or false
	 */
	public boolean calculate()
	{
		if (get() % 3 > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	/**
	 * Check whether the number is divisible by 3 and display the answer
	 */
	public void check()
	{
		if (calculate() == true)
		{
			ansLabel.setText("Number is not divisible by 3");
		}
		else
		{
			ansLabel.setText("Number is divisible by 3");
		}
	
	}
	
	
	/**
	 * Create the application.
	 */
	public DivisibleBy3() 
	{
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frmDivisibleby = new JFrame();
		frmDivisibleby.setTitle("Check if a number is divisible by 3");
		frmDivisibleby.setBounds(100, 100, 736, 437);
		frmDivisibleby.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDivisibleby.getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 700, 376);
		frmDivisibleby.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		intLabel = new JTextField();
		intLabel.setHorizontalAlignment(SwingConstants.CENTER);
		intLabel.setBounds(164, 65, 361, 47);
		panel.add(intLabel);
		intLabel.setColumns(10);
		
		
		JLabel lblNewLabel = new JLabel("Please Enter an Integer:");
		lblNewLabel.setFont(new Font("OCR A Extended", Font.PLAIN, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(164, 29, 361, 25);
		panel.add(lblNewLabel);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(164, 123, 361, 167);
		panel.add(panel_1);
		panel_1.setLayout(null);
		ansLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		ansLabel.setFont(new Font("OCR A Extended", Font.PLAIN, 13));
		ansLabel.setBounds(0, 94, 361, 47);
		panel_1.add(ansLabel);
		
		
		JButton clearButton = new JButton("Clear");
		clearButton.setFont(new Font("OCR A Extended", Font.PLAIN, 14));
		clearButton.setBounds(206, 26, 123, 57);
		panel_1.add(clearButton);
		
		JButton checkButton = new JButton("Check");
		checkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				check();		//run the check method when the button is pressed
			}
		});
		checkButton.setFont(new Font("OCR A Extended", Font.PLAIN, 14));
		checkButton.setBounds(39, 26, 123, 57);
		panel_1.add(checkButton);
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				intLabel.setText("");
				ansLabel.setText("");
			}
		});
		
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibleBy3 window = new DivisibleBy3();
					window.frmDivisibleby.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}




