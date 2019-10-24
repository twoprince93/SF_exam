package com.hh.exam.tv;

public class LGTv extends Tv {
	
	public static String model;
	
	LGTv () {}
	
	public LGTv(String str) {
		model = str;
	}
	
	public void record() {
		System.out.println("녹화를 하고 있습니다.");
	}
	
	@Override
	public String toString() {
		return "LGTv임!!ㅋㅋㅋ";
	}
	
}
