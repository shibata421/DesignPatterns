package br.com.cod3r.state.pacman.states;

import br.com.cod3r.state.pacman.Ghost;

public class WanderMazeState implements GhostState {
	
	private static final WanderMazeState instance = new WanderMazeState();
	private WanderMazeState() {};
	
	public static WanderMazeState getInstance() {
		return instance;
	}

	@Override
	public void spotPacman(Ghost ghost) {
		System.out.println("After him!!");
		ghost.setState(ChasePacManState.getInstance());
	}

	@Override
	public void losePacman(Ghost ghost) {
		System.out.println("How can I lost something that I don't have? :(");
	}

	@Override
	public void pacmanTurnsSpecial(Ghost ghost) {
		System.out.println("I should run!!");
		ghost.setState(FleeingState.getInstance());
	}

	@Override
	public void pacmanTurnsNormal(Ghost ghost) {
		System.out.println("I wish I had spotted him...");		
	}

	@Override
	public void eatenByPacman(Ghost ghost) {
		System.out.println("No didn't eat me!!");				
	}

	@Override
	public void reachTheBase(Ghost ghost) {
		System.out.println("But why should I?");						
	}
}
