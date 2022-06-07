package br.com.cod3r.state.headphone;

public class HeadPhone {
	
	private HeadphoneState state;
	
	public HeadPhone() {
		this.state = TurnedOffState.getInstance();
	}
	
	public void onLongClick() {
		System.out.println("Long Click...");
		this.state.longClick(this);
	}
	
	public void onClick() {
		System.out.println("Short Click...");
		this.state.shortClick(this);
	}

	public void setState(HeadphoneState state) {
		this.state = state;
	}
}
