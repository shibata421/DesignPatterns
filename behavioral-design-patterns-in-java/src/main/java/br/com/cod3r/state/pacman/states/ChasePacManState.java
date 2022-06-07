package br.com.cod3r.state.pacman.states;

import br.com.cod3r.state.pacman.Ghost;

public class ChasePacManState implements GhostState {

	private static final ChasePacManState instance = new ChasePacManState();

	private ChasePacManState() {
	}
	
	public static ChasePacManState getInstance() {
		return instance;
	}

	@Override
	public void spotPacman(Ghost ghost) {
		System.out.println("I've already spotted him!");
	}

	@Override
	public void losePacman(Ghost ghost) {
		System.out.println("Aw... Back to work...");
		ghost.setState(WanderMazeState.getInstance());
	}

	@Override
	public void pacmanTurnsSpecial(Ghost ghost) {
		System.out.println("Oof!! I should run!!");
		ghost.setState(FleeingState.getInstance());
	}

	@Override
	public void pacmanTurnsNormal(Ghost ghost) {
		System.out.println("Liar! I haven't seen him eating that special fruit!");

	}

	@Override
	public void eatenByPacman(Ghost ghost) {
		System.out.println("If he was cheating, I may have died...");
	}

	@Override
	public void reachTheBase(Ghost ghost) {
		System.out.println("I should be doing something a little more usable...");
	}

}
