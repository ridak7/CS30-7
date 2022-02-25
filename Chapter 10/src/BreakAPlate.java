/*
 * Create an application that displays three unbroken plates, and when the game is started, 
 * displays broken plates and a prize corresponding to the number of plates broken.  
 */

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class BreakAPlate {
	
	/**
	 * Initialize variables
	 */
	private JFrame frmBreakaplate;
	public int randNum;
	JLabel platesIcon = new JLabel("");
	JLabel prizeIcon = new JLabel("");
	JButton playButton = new JButton("Play");
	private final JLabel gameLabel = new JLabel("Press play to start game!");
	private final JLabel prizeDisp = new JLabel("");
	ImageIcon i = new ImageIcon("plates.gif");
	ImageIcon i2 = new ImageIcon("plates_two_broken.gif");
	ImageIcon i3 = new ImageIcon("plates_all_broken.gif");
	ImageIcon p = new ImageIcon("sticker.gif");
	ImageIcon p2 = new ImageIcon("tiger_plush.gif");
	
	
	/**
	 * Generate a random number
	 * @return random number
	 */
	public int random()
	{
		randNum = 1 + (int)(Math.random() * ((3 - 1) + 1));
		System.out.println(randNum);
		return randNum;
	}
	
	
	/**
	 * Clear labels and display the broken plates and corresponding prize determined
	 * by the random number generated earlier
	 */
	public void game()
	{
		gameLabel.setText("");
		platesIcon.setText("");
		playButton.setText("Play Again");
		
		switch (random())
		{
			case 1:
			
			    platesIcon.setIcon(i);
				prizeIcon.setIcon(p);
				prizeDisp.setText("You won a sticker!");
				break;
		
			case 2:
				
			    platesIcon.setIcon(i2);
			    prizeIcon.setIcon(p);
			    prizeDisp.setText("You won a sticker!");
				break;
				
			case 3:
				
			    platesIcon.setIcon(i3);
			    prizeIcon.setIcon(p2);
			    prizeDisp.setText("You won a tiger plush!");
				break;
				
			default:
				break;
			
		}
	}
	
	
	/**
	 * Check if the play button says "Play Again" and determine whether to reset 
	 * the game
	 */
	public void checkPlay()
	{
		if (playButton.getText() == "Play Again")
		{
			gameLabel.setText("Press play to start game!");
			prizeDisp.setText("");
			playButton.setText("Play");
		    platesIcon.setIcon(i);
			prizeIcon.setIcon(null);
		}
		else
		{
			game();
		}
	}
	

	/**
	 * Create the application.
	 */
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBreakaplate = new JFrame();
		frmBreakaplate.setTitle("BreakAPlate");
		frmBreakaplate.getContentPane().setBackground(Color.WHITE);
		frmBreakaplate.getContentPane().setForeground(Color.WHITE);
		frmBreakaplate.setBounds(100, 100, 552, 451);
		frmBreakaplate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBreakaplate.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 516, 390);
		frmBreakaplate.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		platesIcon.setIcon(new ImageIcon("C:\\Users\\904188001\\Desktop\\CS30 Workspace\\Chapter 10\\plates.gif"));
		platesIcon.setHorizontalAlignment(SwingConstants.CENTER);
		platesIcon.setBounds(10, 47, 496, 112);
		panel.add(platesIcon);
		
		
		playButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				checkPlay();		//run the checkPlay method which runs the whole game
			}
		});
		playButton.setBounds(180, 170, 153, 48);
		panel.add(playButton);
		
		
		prizeIcon.setIcon(null);
		prizeIcon.setHorizontalAlignment(SwingConstants.CENTER);
		prizeIcon.setBounds(10, 275, 496, 104);
		panel.add(prizeIcon);
		gameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		gameLabel.setBounds(10, 22, 496, 14);
		
		panel.add(gameLabel);
		prizeDisp.setHorizontalAlignment(SwingConstants.CENTER);
		prizeDisp.setBounds(10, 250, 496, 14);
		
		panel.add(prizeDisp);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
					window.frmBreakaplate.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
