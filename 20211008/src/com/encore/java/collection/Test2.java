package com.encore.java.collection;

import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("서울");
		list.add("도코");
		list.add("뉴욕");
		
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		Iterator<String> iter = list.iterator(); // 빠름
		while (iter.hasNext()) { // 다음 값이 있는지
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		
		
		
		
	}
}
