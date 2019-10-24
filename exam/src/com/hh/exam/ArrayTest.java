package com.hh.exam;

public class ArrayTest {
	public static void main(String[] args) {
		
		/*
		int[] array2 = new int [10]; //{0,0,0,0,0, }
		*/
		String[] array3 = new String[5];
		
		String str1 = new String("하나");
		
		array3[0] = str1;
		array3[1] = "둘";
		
		printArrayValue(array3);
		
		int[] array = {4,5,10,22,80,11};
		
		printArrayValue(array);
	}
	
	public static void printArrayValue(String[] arr) {
		for(String str : arr)
			System.out.println(str);
	}
	
	public static void printArrayValue(int[] arr) {
		int sum = 0;
		/*
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum = sum + arr[i];
		}*/
		for(int aa : arr) {
			System.out.println(aa);
			sum = sum + aa;
		}
		System.out.println("합계 : " + sum);
	}
}
