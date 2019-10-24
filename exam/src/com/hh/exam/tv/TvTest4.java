package com.hh.exam.tv;

public class TvTest4 {
	public static void main(String[] args) {
		LGTv lgtv = new LGTv();
		
		Tv tv = lgtv; //자동 형변환
		
		LGTv lgtv2 = (LGTv)tv; //강제 형변환
	}
}
