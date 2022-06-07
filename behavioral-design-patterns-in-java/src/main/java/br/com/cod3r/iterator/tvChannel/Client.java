package br.com.cod3r.iterator.tvChannel;

public class Client {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.searchAvaiableChannels();

		for(int i = 1; i < TV.NUMBER_OF_CHANNELS; i++) {
			tv.accessChannel(i);
		}
		
		for (Integer channel : tv) {
			System.out.println("Channel " + channel);
		}
	}
}
