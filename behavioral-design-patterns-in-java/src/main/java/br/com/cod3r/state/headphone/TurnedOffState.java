package br.com.cod3r.state.headphone;

public class TurnedOffState implements HeadphoneState {

	public static final TurnedOffState instance = new TurnedOffState();

	private TurnedOffState() {}
	
	public static TurnedOffState getInstance() {
		return instance;
	}
	
	@Override
	public void shortClick(HeadPhone headphone) {
		System.out.println("Nothing...");
	}

	@Override
	public void longClick(HeadPhone headphone) {
		System.out.println("Turning On!");
		headphone.setState(TurnedOnState.getInstance());
	}

}
