package com.encore.java.api;
// java.lang.String은 원본 변경 불가능
// java.lang.StringBuffer, java.lang.StringBuilder : 문자열 처리 객체 -> 원본 변경 가능
// 두 개의 차이는 동기화(동시에 여러 명이 어떠한 한 객체를 접근하려고 할 때 -> 한명이 끝낼 때까지 대기, 끝나면 사용권한 받음) 여부
// StringBuffer : 동기화 O, 
// StringBuilder : 동기화 X
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "good ";
		System.out.println(s1.concat(" nice")); // "good  nice"
		System.out.println(s1); // "good " -> 변경안됨
		
		StringBuffer sbf = new StringBuffer("날이 좋아서 ");
		System.out.println(sbf); // "날이 좋아서 "
		System.out.println(sbf.append("날이 적당해서 ")); // "날이 좋아서 날이 적당해서 "
		System.out.println(sbf); // "날이 좋아서 날이 적당해서 " -> 변경됨 
		
		StringBuilder sbd = new StringBuilder("날이 좋아서 ");
		System.out.println(sbd); // "날이 좋아서 "
		System.out.println(sbd.append("날이 적당해서 ")); // "날이 좋아서 날이 적당해서 "
		System.out.println(sbd); // "날이 좋아서 날이 적당해서 " -> 변경됨
	
		System.out.println(sbf.insert(7,  "날이 좋지 않아서 ")); // "날이 좋아서 날이 좋지 않아서 날이 적당해서 "
		System.out.println(sbf); // "날이 좋아서 날이 좋지 않아서 날이 적당해서 "
		
		System.out.println(sbd.insert(14,  " 날이 좋지 않아서")); // "날이 좋아서 날이 적당해서 날이 좋지 않아서"
		System.out.println(sbd); // "날이 좋아서 날이 적당해서 날이 좋지 않아서"
		
		
		System.out.println(sbf.replace(7, 17, "good!")); //날이 좋아서 good!날이 적당해서 
		System.out.println(sbf.replace(7, 17, "good!")); //날이 좋아서 good!해서 
		
	}

}
