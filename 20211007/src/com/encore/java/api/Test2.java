package com.encore.java.api;

import java.awt.List;

// java.lang.String
public class Test2 {
	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = "java"; // ���� ����
		
		String s3 = new String("java");
		String s4 = "java";
		
		System.out.println(s1 == s3); // false, �ּҰ�
		System.out.println(s2 == s4); // true, ���ڿ�
 		
		System.out.println(s1.equals(s3)); // true, ���ڿ�
		System.out.println(s1);
		
		String s5 = "Java";
		System.out.println(s1.equals(s5)); // false, ���ڿ� - ��ҹ��ڵ� ����
		System.out.println(s1.equalsIgnoreCase(s5)); // true, ���ڿ� - ��ҹ��� ������� ��
		
		// length() : ���ڿ� ���� ��ȯ
		System.out.println(s1.length()); // 4
		
		// chatAt(idx) : ���ڿ����� ������ idx�� �ش��ϴ� ���� ��ȯ
		for (int i=0; i<s1.length(); i++) 
			System.out.print(s1.charAt(i)+" "); // j a v a
		System.out.println();
		
		// trim() : ������ ���� ���� �� ���ڿ� ��ȯ
		String s6 = "          java              ";
		System.out.println(s6.trim()); // java
		System.out.println(s6); // "          java              ", ������ trim()�� �ߴٰ� ������ s6�� ����� ���� �ƴϴ�
		s6 = s6.trim();
		System.out.println(s6); // java
		
		// ���� �˻�
		// int indexOf() | int lastIndexOf() : ���� ���ϴ� ���ڿ��� ���� ��ġ
		// indexOf() : �տ���, lastIndexOf() : �ڿ���
		String s7 = "java";
		System.out.println(s7.indexOf("a")); // 1
		System.out.println(s7.lastIndexOf("a")); // 3
		
		String s8 = "apple banana melon apple kiwii";
		System.out.println(s8.indexOf("apple")); // 0
		System.out.println(s8.lastIndexOf("apple")); // 19
		
		// ���ڿ� ����
		// ���� : concat()
		// ���� : replace()
		// �빮�ڷ� ���� : toUpperCase()
		// �ҹ��ڷ� ���� : toLowerCase()
		String s = "Everything in your world is created";
		String ss = s.concat(" by what you think");
		System.out.println(ss); // Everything in your world is created by what you think
		String sss = ss.replace(" by what you think", " by your thoughts");
		System.out.println(sss); // Everything in your world is created by your thoughts
		
		System.out.println(s.toLowerCase()); //everything in your world is created
		System.out.println(s.toUpperCase()); //EVERYTHING IN YOUR WORLD IS CREATED
		
		
		// ���ڿ� ����
		// split()
		// substring()
		String ss1 = "A,B,C,D";
		String[] lst1 = ss1.split(",");
		for(int i=0; i<lst1.length;i++) {
			System.out.print(lst1[i]+" "); // A B C D
		}
		System.out.println();
		
		String[] lst2 = ss1.split(",",2); // ,�� �������� 2�� ������ �迭��
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
		
		
		// String Ÿ�� ��ȯ
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











