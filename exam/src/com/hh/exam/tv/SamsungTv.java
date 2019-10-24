package com.hh.exam.tv;

public class SamsungTv extends Tv {
	@Override
	void channelUp() {
		channel += 5;
	}
	
	@Override
	public String toString() {
		return String.format("%stv의 채널 : %d, 볼륨 : %d","삼성",channel,volume);
	}
}
