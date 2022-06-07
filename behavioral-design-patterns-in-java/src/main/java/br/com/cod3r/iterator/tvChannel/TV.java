package br.com.cod3r.iterator.tvChannel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class TV implements Iterable<Integer> {

	private List<Integer> channels;
	public static final Integer NUMBER_OF_CHANNELS = 30;

	public void searchAvaiableChannels() {
		this.channels = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < NUMBER_OF_CHANNELS; i++) {
			if (r.nextInt(2) == 1) {
				channels.add(i);
			}
		}
		System.out.println(String.format("Found %d channels...", channels.size()));
	}

	public void accessChannel(Integer number) {
		System.out.print(String.format("Channel %d: ", number));
		for (Integer channel : channels) {
			if (channel == number) {
				System.out.println("OK!");
				return;
			}
		}
		System.out.println("No signal!");
	}

	@Override
	public Iterator<Integer> iterator() {
		return new ChannelIterator(channels);
	}
}
