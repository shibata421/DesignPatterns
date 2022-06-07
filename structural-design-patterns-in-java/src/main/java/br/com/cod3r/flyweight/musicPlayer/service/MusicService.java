package br.com.cod3r.flyweight.musicPlayer.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import br.com.cod3r.flyweight.musicPlayer.model.FlyweightFactory;
import br.com.cod3r.flyweight.musicPlayer.model.Music;
import br.com.cod3r.flyweight.musicPlayer.model.MusicFlyweight;

public class MusicService {
	// User , <descricao, musica>
	private Map<String, Map<String, Music>> memory;
	private FlyweightFactory flyweightFactory;
	
	public MusicService() {
		this.memory = new HashMap<>();
		this.flyweightFactory = FlyweightFactory.getInstance();
	}
	
	public void listenMusic(String user, String desc) {
		Map<String, Music> userPlayList = memory.get(user);
		if(userPlayList == null) {
			userPlayList = new HashMap<>();
			memory.put(user, userPlayList);
		}
		
		Music song = userPlayList.get(desc);
		if(song == null) {
			song = getMusicByString(desc);
			userPlayList.put(desc, song);
		}
		System.out.println(String.format("%s is listenning '%s'", 
				user, song.getName()));
		song.listening();
	}
	
	private Music getMusicByString(String desc) {
		MusicFlyweight musicFlyweight = flyweightFactory.getMusic(desc);
		return new Music(musicFlyweight);
	}
	
	public void report() {
		Set<String> users = memory.keySet();
		for(String user: users) {
			int timeCounter = 0;
			
			System.out.println("---------");
			System.out.println(user + " has listened...");
			
			Collection<Music> musics = memory.get(user).values();
			for(Music music: musics) {
				System.out.println(String.format("%s/%s %d times", 
						music.getArtist(), music.getName(), music.getPlayerQty()));
				timeCounter += (music.getPlayerQty() * music.getDurationInSeconds());
			}
			
			System.out.println(String.format("%s has listen music for %d seconds", user, timeCounter));
		}
		System.out.println("Total of musics in memory: " + flyweightFactory.musicsInMemory());
	}
}
