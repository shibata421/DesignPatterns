package br.com.cod3r.state.headphone;

public class PlayingState implements HeadphoneState {

	private static final PlayingState instance = new PlayingState();
	
	private PlayingState() {}
	
	public static PlayingState getInstance() {
		return instance;
	}
	
	@Override
	public void shortClick(HeadPhone headphone) {
		System.out.println("Stop playing....");
		headphone.setState(TurnedOnState.getInstance());
	}

	@Override
	public void longClick(HeadPhone headphone) {
		TurnedOnState.getInstance().longClick(headphone);
	}

}
