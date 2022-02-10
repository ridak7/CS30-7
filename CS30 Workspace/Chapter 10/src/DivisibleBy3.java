import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class DivisibleBy3 {

	private JFrame frame;
	private JTextField tf;

	/**
	 * Create the application.
	 */
	public DivisibleBy3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 736, 437);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 700, 376);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		tf = new JTextField();
		tf.setBounds(164, 11, 361, 47);
		panel.add(tf);
		tf.setColumns(10);
		
		JLabel lb = new JLabel("");
		lb.setBounds(164, 228, 346, 47);
		panel.add(lb);

		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String msg = tf.getText();
				tf.setText("");
				lb.setText(msg);
				
			}
		});
		btnNewButton.setBounds(278, 99, 123, 57);
		panel.add(btnNewButton);
		
			}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibleBy3 window = new DivisibleBy3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}




