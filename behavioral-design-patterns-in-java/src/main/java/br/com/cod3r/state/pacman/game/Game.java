package br.com.cod3r.state.pacman.game;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
	
    private boolean exit = false;
    private List<GameEventListener> listeners = new ArrayList<>();

    public void addListener(GameEventListener listener) {
        listeners.add(listener);
    }
    
    public void startLoop() throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hi! I'm a good ghost. Help me to catch that bad PacMan...");
		while(exit == false) {
			showOptions();
			String option = scanner.nextLine();
            System.out.println("\n\n");
            listeners.forEach(l -> l.onAction(option));
			System.out.println("\n\n");
		}
		System.out.println("Ok! Let's play again later?");
		
		scanner.close();
    }
    
    private void showOptions() {
    	System.out.println("Choose what will happen next...");
    	System.out.println("1: Spot the PacMan");
    	System.out.println("2: Lose the PacMan");
		System.out.println("3: PacMan turns special");
    	System.out.println("4: PacMan is regular again");
		System.out.println("5: Eaten by PacMan");
    	System.out.println("6: Reach the base");
    	System.out.println("0: Exit");    	
    }

    public void stopLoop() {
        exit = true;
    }
}
