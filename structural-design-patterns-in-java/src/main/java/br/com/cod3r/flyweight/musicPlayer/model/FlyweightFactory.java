package br.com.cod3r.flyweight.musicPlayer.model;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

	private static FlyweightFactory flyweightFactory = new FlyweightFactory();
	private Map<String, MusicFlyweight> musicFlyweightMap;
	
	private FlyweightFactory() {
		musicFlyweightMap = new HashMap<>();
	}
	
	public static FlyweightFactory getInstance() {
		return flyweightFactory;
	}
	
	public MusicFlyweight getMusic(String desc) {
		if(musicFlyweightMap.containsKey(desc)) {
			return musicFlyweightMap.get(desc);
		}
		String[] musicData = desc.split(";");
		MusicFlyweight music = new MusicFlyweight(musicData[0], musicData[1], Integer.valueOf(musicData[2]));
		musicFlyweightMap.put(desc, music);
		return music;
	}
	
	public int musicsInMemory() {
		return musicFlyweightMap.size();
	}
}
