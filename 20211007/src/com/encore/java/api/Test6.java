package com.encore.java.api;

import java.util.StringTokenizer;
import java.util.Random;
import java.util.Arrays;

// java.util 패키지
public class Test6 {
	public static void main(String[] args) {
		String msg = "Although the world is full of suffering, it is full also of ths overcoming of it.";
		StringTokenizer st1 = new StringTokenizer(msg); // 기본 - 공백 기준으로 자름
		StringTokenizer st2 = new StringTokenizer(msg, ","); // ","를 기준으로 자름
		System.out.println("단어 수 : "+st1.countTokens());
		
		String s = "id=guest&name=Amy&pwd=1004";
		StringTokenizer st3 = new StringTokenizer(s, "&");
		while(st3.hasMoreTokens()) {
			System.out.println("남아있는 토큰 수 :"+st3.countTokens());
			System.out.println(st3.nextToken());
		}
		
		StringTokenizer st4 = new StringTokenizer(s, "=&"); // = or &
		while(st4.hasMoreTokens()) {
			System.out.println("남아있는 토큰 수 :"+st4.countTokens());
			System.out.println(st4.nextToken());
		}
		
		
		// java.util.Random
		Random r = new Random();
		System.out.println("-----------------------");
		for (int i=0; i<5; i++) {
			System.out.println(r.nextInt());
			System.out.println(r.nextInt(10)); // 0~9
			System.out.println(r.nextBoolean());
			System.out.println(r.nextDouble());
			System.out.println(r.nextFloat());
			System.out.println("-----------------------");
		}
		
		// java.unit.Arrays
		int[] score = {85, 90, 95, 100, 75};
		// 배열 복사
		int[] score2 = new int[score.length];
		System.arraycopy(score, 0, score2, 0, score.length);
		
		int[] score3 = Arrays.copyOf(score, score.length);
		for (int i : score3)
			System.out.println(i);
		
	}
}
