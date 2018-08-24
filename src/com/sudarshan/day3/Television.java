package com.sudarshan.day3;

public class Television {
	private static final int MIN_VOLUME = 0;
	private static final int MAX_VOLUME = 100;

	private Boolean state;
	private int currentVolume;
	private int currentChannel;

	public Television() {

	}

	public Television(Boolean state, int currentVolume, int currentChannel) {
		this.state = state;
		this.currentVolume = currentVolume;
		this.currentChannel = currentChannel;
	}

	public Boolean changeState() {
		state = !state;
		return state;
	}

	public int increaseVolume() {
		if (currentVolume != MAX_VOLUME && state) {
			this.currentVolume++;
		}
		return currentVolume;
	}

	public int decreaseVolume() {
		if (currentVolume != MIN_VOLUME && state) {
			this.currentVolume--;
		}
		return currentVolume;
	}

	public int changeChannel(int channelNumber) {
		if (state) {
			this.currentChannel = channelNumber;
		}
		return currentChannel;
	}

}
