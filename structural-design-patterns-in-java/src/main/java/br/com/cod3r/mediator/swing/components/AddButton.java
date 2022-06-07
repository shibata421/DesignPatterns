package br.com.cod3r.mediator.swing.components;

import javax.swing.JButton;

import br.com.cod3r.mediator.swing.Mediator;

public class AddButton extends JButton {
	private static final long serialVersionUID = -6170178595314483794L;

	public AddButton(Mediator mediator) {
		super("Click me!");

		this.addActionListener(e -> {
			mediator.addCount();
			mediator.refresh();
			
			if (mediator.getCounter() == 10) {
				setEnabled(false);

			}
		});
	}
}
