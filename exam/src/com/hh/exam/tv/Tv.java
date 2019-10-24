package com.hh.exam.tv;

//지시어 - private, default, protected, public

public class Tv {
	protected int channel;
	protected int volume;

	Tv() {
	}

	Tv(int channel, int volume) {
		this.channel = channel;
		this.volume = volume;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if (channel < 1) {
			this.channel = 1;
		} else if (channel > 300) {
			this.channel = 300;
		} else {
			this.channel = channel;
		}
	}

	public void setVolume(int volume) {
		if (volume > 20) {
			volume = 20;
		}
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	void showState() {
		System.out.printf("channel : %d, volume : %d\n", channel, volume);
	}

	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}

	void volumeUp() {
		volume++;
	}

	void volumeDown() {
		volume--;
	}
}
