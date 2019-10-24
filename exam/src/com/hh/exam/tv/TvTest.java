package com.hh.exam.tv;

public class TvTest {
	public static void main(String[] args) {
		Tv tv1 = new Tv(30, 5); // 주소값(레퍼런스변수,참조변수) = tv

		Tv tv2 = new Tv();
		tv2.setChannel(0);
		tv2.setVolume(31);

		tv1.showState();
		tv2.showState();

		int volume = tv1.getVolume();
		System.out.println("tv1의 볼륨 : " + volume);

		int volume2 = tv2.getVolume();
		System.out.println("tv2의 볼륨 : " + volume2);

	}
}
