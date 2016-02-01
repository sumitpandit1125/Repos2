package com.Inheritance;

public class Periodicals extends Media {
	
	private String frequency;
	private int volume;
	
	public Periodicals(String name, int lendingLength, String frequency, int volume) {
		super(name, lendingLength);
		this.frequency = frequency;
		this.volume = volume;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	@Override
	public void printMedia(){
		super.printMedia();
		System.out.println("Freqency :"+frequency);
		System.out.println("Volume :"+volume);
	}

}
