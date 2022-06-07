package br.com.cod3r.memento.swing.memory;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

	private List<String> mementosList;
	
	public Caretaker() {
		this.mementosList = new ArrayList<>(); 
	}

	public void add(String text) {
		mementosList.add(text);
	}

	public String getSize() {
		return String.valueOf(mementosList.size());
	}

	public String get(int selectedIndex) {
		return mementosList.get(selectedIndex);
	}
}
