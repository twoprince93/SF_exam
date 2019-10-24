package com.hh.exam.tv;

public class TvTest2 {
	public static void main(String[] args) {
		LGTv lgtv2 = new LGTv();
		LGTv lgtv3 = new LGTv();
		
		SamsungTv smtv1 = new SamsungTv();
		
		System.out.println(lgtv2);
		System.out.println(smtv1);
		smtv1.showState();
		/*
		LGTv lgtv1 = new LGTv();
		lgtv1.showState();
		lgtv1.setChannel(100);
		lgtv1.showState();
		lgtv1.record();

		SamsungTv smtv1 = new SamsungTv();
		smtv1.channelUp();
		smtv1.channelUp();
		smtv1.showState();
		*/
	}
}
