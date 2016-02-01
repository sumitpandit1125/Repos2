package com.Inheritance;

public class Dvd extends Media {
	
	private String artist;
	private float length;
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	
	public Dvd(String name, int lendingLength, String artist, float length) {
		super(name, lendingLength);
		this.artist = artist;
		this.length = length;
	}
	
	@Override
	public void printMedia(){
		super.printMedia();
		System.out.println("Artist :"+artist);
		System.out.println("Track Length :"+length);
	}
	
	
}
