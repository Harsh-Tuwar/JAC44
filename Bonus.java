import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Bonus extends JFrame implements KeyListener {

	// global variable (Will be used to change the locations)
	public int X = 0;
	public int Y = 0;

	// Publicly accessed JButton so that the value for the location can be
	// changed on when the key is pressed
	JButton bt = new JButton("A");

	public Bonus() {
		super("JAC444 Bonus");

		// Panel which contains label
		JPanel panel = new JPanel();
		// add panel to the frame
		add(panel);
		panel.setLayout(null);
		// panel background to red
		panel.setBackground(Color.RED);

		// adding button to the panel
		panel.add(bt);

		// Action listener
		bt.addKeyListener(this);
		
		//Default location of button in the frame
		bt.setBounds(X, Y, 20, 20);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		switch (keyCode) {
		case KeyEvent.VK_UP:
			if (Y < 0)
				Y = 220;

			Y -= 10;
			bt.setBounds(X, Y, 20, 20);
			System.out.println("Y:" + Y);
			break;
		case KeyEvent.VK_DOWN:
			if (Y >= 220)
				Y = -10;
			Y += 10;
			bt.setBounds(X, Y, 20, 20);
			System.out.println("Y: " + Y);
			break;
		case KeyEvent.VK_LEFT:
			if (X <= 0)
				X = 250;
			X -= 10;
			bt.setBounds(X, Y, 20, 20);
			System.out.println("X: " + X);
			break;
		case KeyEvent.VK_RIGHT:
			if (X >= 240)
				X = -10;
			X += 10;
			bt.setBounds(X, Y, 20, 20);
			System.out.println("X: " + X);
			break;
		}

	}

	public static void main(String[] args) {
		Bonus bn = new Bonus();
		bn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bn.setSize(250, 250);
		// bn.pack();
		bn.setVisible(true);
		bn.setResizable(false);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
