package br.com.cod3r.observer.swing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JButton;

public class AppButton extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AppButton(String title, AppLabel...labels) {
		super(title);		
		Set<AppLabel> set = new HashSet<>(Arrays.asList(labels));
		
		addActionListener(e -> {
			set.forEach(label -> label.update());
		});
	}

}
