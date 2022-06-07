package br.com.cod3r.state.pacman.states;

import br.com.cod3r.state.pacman.Ghost;

public class FleeingState implements GhostState {

	private static final FleeingState instance = new FleeingState();
	
	private FleeingState() {
	}
	
	public static GhostState getInstance() {
		return instance;
	}

	@Override
	public void spotPacman(Ghost ghost) {
		System.out.println("RUN!!!! RUN!!!!");
	}

	@Override
	public void losePacman(Ghost ghost) {
		System.out.println("I should still run!!");
	}

	@Override
	public void pacmanTurnsSpecial(Ghost ghost) {
		System.out.println("Again?? Gimme a break!!");
	}

	@Override
	public void pacmanTurnsNormal(Ghost ghost) {
		System.out.println("That was close! Back to work!");
		ghost.setState(WanderMazeState.getInstance());
	}

	@Override
	public void eatenByPacman(Ghost ghost) {
		System.out.println("Oh nooooooo...... Thank God I was already a ghost!");
		ghost.setState(ReturnToBaseState.getInstance());
	}

	@Override
	public void reachTheBase(Ghost ghost) {
		System.out.println("No business here! I'm still alive!");
	}
}
