package br.com.cod3r.mediator.swing;

import br.com.cod3r.mediator.swing.components.AddButton;
import br.com.cod3r.mediator.swing.components.Label;
import br.com.cod3r.mediator.swing.components.State;

public class Mediator {

	private AddButton button;
	private Label label;
	private State state;
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void setButton(AddButton button) {
		this.button = button;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public int getCounter() {
		return state.getCounter();
	}

	public void addCount() {
		state.addCount();
	}

	public void refresh() {
		label.refresh();
	}

	public void setCounter(int i) {
		state.setCounter(i);
	}

	public void setEnabled(boolean b) {
		button.setEnabled(b);
	}	
}
