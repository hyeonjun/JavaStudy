package com.encore.java.api;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {85, 90, 95, 100, 75};
		// 배열 복사
		int[] score2 = new int[score.length];
		System.arraycopy(score, 0, score2, 0, score.length);
		
		int[] score3 = Arrays.copyOf(score, score.length);
		for (int i : score3)
			System.out.println(i);
		
		// 배열 출력
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(score2));
		System.out.println(Arrays.toString(score3));
		
		// 배열 비교
		System.out.println(Arrays.equals(score, score2));
		
		// 배열 정렬
		Arrays.sort(score);
		System.out.println(Arrays.toString(score));
		
		// 배열 요소 검색
		int idx = Arrays.binarySearch(score, 90);
		System.out.println(idx); // idx 값 전달
		
		
		// java.util.Date, Calendar
		Date d = new Date();
		System.out.println(d);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		
		
	}

}
