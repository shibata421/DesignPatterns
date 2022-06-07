package br.com.cod3r.state.headphone;

public class TurnedOnState implements HeadphoneState {

	public static final TurnedOnState instance = new TurnedOnState();
	
	private TurnedOnState() {}
	
	public static TurnedOnState getInstance() {
		return instance;
	}
	
	@Override
	public void shortClick(HeadPhone headphone) {
		System.out.println("Playing...");
		headphone.setState(PlayingState.getInstance());
	}

	@Override
	public void longClick(HeadPhone headphone) {
		System.out.println("Turning off...");
		headphone.setState(TurnedOffState.getInstance());
	}



}
