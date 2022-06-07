package br.com.cod3r.flyweight.musicPlayer.model;

public class Music {
	
	private Integer playerQty;
	private MusicFlyweight flyweight;
	
	public Music(MusicFlyweight flyweight) {
		this.flyweight = flyweight;
		this.playerQty = 0;
	}
	
	public void listening() {
		playerQty++;
	}

	public String getName() {
		return flyweight.getName();
	}

	public String getArtist() {
		return flyweight.getArtist();
	}

	public Integer getDurationInSeconds() {
		return flyweight.getDurationInSeconds();
	}

	public Integer getPlayerQty() {
		return playerQty;
	}

	public void setPlayerQty(Integer playerQty) {
		this.playerQty = playerQty;
	}

	@Override
	public String toString() {
		return "Music [name=" + getName() + ", artist=" + getArtist() + ", durationInSeconds=" + getDurationInSeconds()
				+ ", playerQty=" + playerQty + "]";
	}
}
