// GUI beased version of the chapter 4 TwoDice application

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TwoDiceGUI extends JFrame implements ActionListener
{
	
	//graphic components for this class 
	Font mainFont = new Font("Impact",Font.PLAIN,28);
	JLabel title = new JLabel("Two Dice Game");
	JLabel dieRoll1 = new JLabel ("Player's die roll is:");
	JTextField die1Field = new JTextField(3);
	JLabel dieRoll2 = new JLabel("Computer's die roll is:");
	JTextField die2Field = new JTextField(3);
	JLabel result = new JLabel("");
	JButton button = new JButton("Click to play");

	// customize the components
	

	//constutor method for this class
	public TwoDiceGUI()
	{
		super("Two Dice App");
		setBounds(600, 450, 250, 200);
		setResizeable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		//add graphics to the frame 
		add(title);
		add(dieRoll1);
		add(die1Field);
		add(die2Field);
		add(result);
		add(button);

		// add action listner to the button component 
		button.addActionListener(this);
		
		setVisible(true);
	}

	// event hading method 

	@Override

	public void actionPerformed(ActionEvent event)
	{
		// create two die objects
		Die playerDie = new Die();
		Die comDie = new Die();

		// ouput the values of the die objects in the fileds in the GUI

		die1Field.setText("" + playerDie.getDieValue());
		die1Field.setText("" + comDie.getDieValue());

		// decied what the outcome of the game should be 
		//set the tex of the result label accordingly

		if(playerDie.getDieValue() > comDie.getDieValue()) 
		{
			result.setText("you won the game!");
		}

		else 
		{
		 	if (playerDie.getDieValue() < comDie.getDieValue())
		 	{
		 		result.setText("sorry you lose !");
		 	}

		 	else 
		 	{
		 		result.setText("we have a draw!");
		 	}
		} 
	}



	public static void main(String[] args)
	{
		TwoDiceGUI aFrame = new TwoDiceGUI();
	
	}
}



