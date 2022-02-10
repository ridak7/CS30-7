//Create a program to calculate the average using three grades

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import javax.swing.SwingConstants;

public class SemesterAvg {

	private JFrame frmSemesterAverage;
	private JTextField grade2;
	private JTextField grade1;
	private JTextField grade3;

	/**
	 * Check if the text boxes are empty
	 */
	public boolean check()
	{
		if (grade1.getText() == (""))
		{
			return false;
		}
		else if (grade2.getText() == (""))
		{
			return false;
		}
		else if (grade3.getText() == (""))
		{
			return false;
		}
		else 
		{
			return true;
		}
		
	}
	
	/**
	 * Calculate the average
	 */
	public String Calculate() 
	{
		DecimalFormat dc = new DecimalFormat("0.00");
		double g1, g2, g3, avg;
		String avgDisp;
				
		g1 = Double.parseDouble(grade1.getText());
		g2 = Double.parseDouble(grade2.getText());
		g3 = Double.parseDouble(grade3.getText());
		
		avg = (g1 + g2 + g3) / 3;
		
		avgDisp = (dc.format(avg));
		
		return avgDisp;
	}

	/**
	 * Create the application.
	 */
	public SemesterAvg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmSemesterAverage = new JFrame();
		frmSemesterAverage.setTitle("Semester Average");
		frmSemesterAverage.setBounds(100, 100, 600, 408);
		frmSemesterAverage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSemesterAverage.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 564, 347);
		frmSemesterAverage.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 36, 245, 129);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the Second Grade:");
		lblNewLabel.setBounds(28, 53, 248, 25);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("OCR A Extended", Font.BOLD, 15));
		
		JLabel lblNewLabel_1 = new JLabel("Enter the First Grade:");
		lblNewLabel_1.setBounds(39, 0, 248, 25);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("OCR A Extended", Font.BOLD, 15));
		
		JLabel lblEnterTheThird = new JLabel("Enter the Third Grade:");
		lblEnterTheThird.setBounds(39, 104, 248, 25);
		panel_1.add(lblEnterTheThird);
		lblEnterTheThird.setFont(new Font("OCR A Extended", Font.BOLD, 15));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(286, 39, 235, 127);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		grade2 = new JTextField();
		grade2.setBounds(0, 51, 204, 20);
		panel_2.add(grade2);
		grade2.setColumns(10);
		
		grade1 = new JTextField();
		grade1.setColumns(10);
		grade1.setBounds(0, 0, 204, 20);
		panel_2.add(grade1);
		
		grade3 = new JTextField();
		grade3.setColumns(10);
		grade3.setBounds(0, 100, 204, 20);
		panel_2.add(grade3);
		
		JLabel avgLabel = new JLabel("");
		avgLabel.setHorizontalAlignment(SwingConstants.CENTER);
		avgLabel.setFont(new Font("OCR A Extended", Font.BOLD, 32));
		avgLabel.setBounds(153, 260, 235, 62);
		panel.add(avgLabel);
		
		JLabel errorLabel = new JLabel("");
		errorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		errorLabel.setBounds(10, 11, 511, 14);
		panel.add(errorLabel);
		
		JButton avgButton = new JButton("Calculate Average");
		avgButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (check() == true)
				{
					errorLabel.setText("");
					avgLabel.setText(Calculate() + "%");
				}
				else
				{
					errorLabel.setText("Please enter a value in all three boxes.");
				}
				
			}
		});
		avgButton.setBounds(193, 185, 148, 53);
		panel.add(avgButton);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				grade1.setText("");
				grade2.setText("");
				grade3.setText("");
				avgLabel.setText("");
			}
		});
		btnNewButton.setBounds(400, 190, 89, 43);
		panel.add(btnNewButton);
		
		
		
		
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAvg window = new SemesterAvg();
					window.frmSemesterAverage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
