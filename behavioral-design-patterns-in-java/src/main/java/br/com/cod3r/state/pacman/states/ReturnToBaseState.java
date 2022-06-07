package br.com.cod3r.state.pacman.states;

import br.com.cod3r.state.pacman.Ghost;

public class ReturnToBaseState implements GhostState{

	private static final ReturnToBaseState instance = new ReturnToBaseState();
	
	private ReturnToBaseState() {
	}
	
	public static ReturnToBaseState getInstance() {
		return instance;
	}
	
	@Override
	public void spotPacman(Ghost ghost) {
		sayButImDead();
	}

	@Override
	public void losePacman(Ghost ghost) {
		sayButImDead();	
	}

	@Override
	public void pacmanTurnsSpecial(Ghost ghost) {
		sayButImDead();			
	}

	@Override
	public void pacmanTurnsNormal(Ghost ghost) {
		sayButImDead();			
	}

	@Override
	public void eatenByPacman(Ghost ghost) {
		sayButImDead();					
	}

	@Override
	public void reachTheBase(Ghost ghost) {
		System.out.println("But I'm de... I'm ALIVE!!!! Back to work!");
		ghost.setState(WanderMazeState.getInstance());
	}

	private void sayButImDead() {
		System.out.println("But I'm dead...");
	}
}
