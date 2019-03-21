package GuiAndPlayer;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MainMenu extends JFrame {

	private final JTextField numGhosts;
	private final JTextField numFruits;
	private final JTextField numPoison;
	private final JLabel Ghosts;
	private final JLabel Fruits;
	private final JLabel Poison;

	private final JButton start;
	


	public MainMenu() {
		super("KocCat Mainmenu");
		setLayout(new GridLayout(6,3));
		Ghosts = new JLabel("Enter the number of ghosts");
		add(Ghosts);
		numGhosts = new JTextField(6);
		add(numGhosts);
		Fruits = new JLabel("Enter the number of fruits");
		add(Fruits);
		numFruits = new JTextField(6);
		add(numFruits);
		Poison = new JLabel("Enter the number of poison");
		add(Poison);
		numPoison = new JTextField(6);
		add(numPoison);

		start = new JButton("Start the game!");

		ButtonHandler handler = new ButtonHandler();
		start.addActionListener(handler);
		// adding the button to the JFrame
		add(start);
		this.setSize(500, 300);
		this.setBackground(Color.cyan);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private class ButtonHandler implements ActionListener {
		// handle button event
		@Override
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, "lol");
		}
	}
}
