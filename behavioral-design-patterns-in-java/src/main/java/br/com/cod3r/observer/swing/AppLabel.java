package br.com.cod3r.observer.swing;

import javax.swing.JLabel;

public class AppLabel extends JLabel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String title;
	private int count;
	
	public AppLabel(String title) {
		this.title = title;
		this.count = 0;
		setText(title + count);
	}
	 
	public void update() {
		count++;
		setText(title + count);
	}

	
	
}
