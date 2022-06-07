package br.com.cod3r.observer.swing;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Client {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		JLabel title = new JLabel("Counter");
		frame.add(title, BorderLayout.NORTH);

		JPanel labelPanel = new JPanel();
		labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.Y_AXIS));

		AppLabel button1Label = new AppLabel("Button 1 : ");
		AppLabel button12Label = new AppLabel("Button 1 and 2 : ");
		AppLabel button2Label = new AppLabel("Button 2 : ");
		
		labelPanel.add(button1Label);		
		labelPanel.add(button12Label);
		labelPanel.add(button2Label);

		frame.add(labelPanel, BorderLayout.CENTER);

		AppButton b1 = new AppButton("Button #1", button1Label, button12Label);
		AppButton b2 = new AppButton("Button #2", button2Label, button12Label);
		
		frame.add(b1, BorderLayout.WEST);
		frame.add(b2, BorderLayout.EAST);

		frame.setSize(400, 200);
		frame.setVisible(true);
	}
}
