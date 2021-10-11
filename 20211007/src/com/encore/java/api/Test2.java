package com.encore.java.api;

import java.awt.List;

// java.lang.String
public class Test2 {
	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = "java"; // 위와 같음
		
		String s3 = new String("java");
		String s4 = "java";
		
		System.out.println(s1 == s3); // false, 주소값
		System.out.println(s2 == s4); // true, 문자열
 		
		System.out.println(s1.equals(s3)); // true, 문자열
		System.out.println(s1);
		
		String s5 = "Java";
		System.out.println(s1.equals(s5)); // false, 문자열 - 대소문자도 비교함
		System.out.println(s1.equalsIgnoreCase(s5)); // true, 문자열 - 대소문자 상관없이 비교
		
		// length() : 문자열 길이 반환
		System.out.println(s1.length()); // 4
		
		// chatAt(idx) : 문자열에서 지정된 idx에 해당하는 문자 반환
		for (int i=0; i<s1.length(); i++) 
			System.out.print(s1.charAt(i)+" "); // j a v a
		System.out.println();
		
		// trim() : 양쪽의 공백 제거 후 문자열 반환
		String s6 = "          java              ";
		System.out.println(s6.trim()); // java
		System.out.println(s6); // "          java              ", 위에서 trim()을 했다고 원본인 s6에 적용된 것은 아니다
		s6 = s6.trim();
		System.out.println(s6); // java
		
		// 문자 검색
		// int indexOf() | int lastIndexOf() : 내가 원하는 문자열의 시작 위치
		// indexOf() : 앞에서, lastIndexOf() : 뒤에서
		String s7 = "java";
		System.out.println(s7.indexOf("a")); // 1
		System.out.println(s7.lastIndexOf("a")); // 3
		
		String s8 = "apple banana melon apple kiwii";
		System.out.println(s8.indexOf("apple")); // 0
		System.out.println(s8.lastIndexOf("apple")); // 19
		
		// 문자열 편집
		// 결합 : concat()
		// 변경 : replace()
		// 대문자로 변경 : toUpperCase()
		// 소문자로 변경 : toLowerCase()
		String s = "Everything in your world is created";
		String ss = s.concat(" by what you think");
		System.out.println(ss); // Everything in your world is created by what you think
		String sss = ss.replace(" by what you think", " by your thoughts");
		System.out.println(sss); // Everything in your world is created by your thoughts
		
		System.out.println(s.toLowerCase()); //everything in your world is created
		System.out.println(s.toUpperCase()); //EVERYTHING IN YOUR WORLD IS CREATED
		
		
		// 문자열 추출
		// split()
		// substring()
		String ss1 = "A,B,C,D";
		String[] lst1 = ss1.split(",");
		for(int i=0; i<lst1.length;i++) {
			System.out.print(lst1[i]+" "); // A B C D
		}
		System.out.println();
		
		String[] lst2 = ss1.split(",",2); // ,를 기준으로 2개 원소의 배열로
		for (String i:lst2)
			System.out.println(i);
		
		
		String ss2 = "abcdefg";
		System.out.println(ss2.substring(2, 5)); // cde
		
		String email = "purum@encore.co.kr";
		int idx = email.indexOf("@");
		String id = email.substring(0, idx);
		System.out.println(id);
		String domain = email.substring(idx+1);
		System.out.println(domain);
		
		
		// String 타입 변환
		// valueOf
		String c1 = String.valueOf(true);
		String c2 = String.valueOf('A');
		String c3 = String.valueOf(3.14);
		String c4 = String.valueOf(123);
		String c5 = String.valueOf(new A());
		
		System.out.println(c1); // "true"
		System.out.println(c2); // "A"
		System.out.println(c3); // "3.14"
		System.out.println(c4); // "123"
		System.out.println(c5); // "com.encore.java.api.A@15db9742"
		
		String c6 = 123+"";
		System.out.println(c6); // "123"
		
		
	}
}


class A {
	
}











