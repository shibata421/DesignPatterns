package br.com.cod3r.iterator.tvChannel;

import java.util.Iterator;
import java.util.List;

public class ChannelIterator implements Iterator<Integer>{

	private List<Integer> channels;
	private int count;
	
	public ChannelIterator(List<Integer> channels) {
		this.channels = channels;
		this.count = 0;
	}
	
	@Override
	public boolean hasNext() {
		if(channels == null) {
			return false;
		}
		
		try {
			return channels.get(count) != null;
		} catch (IndexOutOfBoundsException e) {
			return false;
		}
	}

	@Override
	public Integer next() {
		Integer next = channels.get(count);
		count++;
		return next;
	}

}
