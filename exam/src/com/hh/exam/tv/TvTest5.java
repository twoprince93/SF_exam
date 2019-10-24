package com.hh.exam.tv;

public class TvTest5 {
	public static void main(String[] args) {
		SamsungTv sstv = new SamsungTv();
		LGTv lgtv = new LGTv();
		
		mainShowState(sstv);
		mainShowState(lgtv);
	}
	/*public static void mainShowState(SamsungTv sstv) {
		sstv.showState();
	}
	public static void mainShowState(LGTv lgtv) {
		lgtv.showState();
	}*/
	public static void mainShowState(Tv tv) {
		tv.showState();
	}
}
