package com.encore.java.collection;

import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec = new Vector<String>(); // 동기화되어 있는 리스트
		System.out.println(vec.size());
		vec.addElement("서울");
		vec.addElement("도쿄");
		vec.addElement("뉴욕");
		
		for (int i=0; i<vec.size(); i++) {
			System.out.println(vec.get(i));
		}
		for (int i=0; i<vec.size(); i++) {
			System.out.println(vec.elementAt(i));
		}
		
		System.out.println(vec.firstElement());
		System.out.println(vec.lastElement());
		
		vec.insertElementAt("파리", 2); // idx 2인 곳에 삽입
		System.out.println(vec);
		
		vec.setElementAt("런던", 1); // idx가 1인 곳의 요소를 런전으로 수정
		System.out.println(vec);
		
		System.out.println(vec.capacity()); // 10, 벡터는 객체 생성 시 최소 10 크기의 수용량을 가짐
		System.out.println(vec.size()); // 요소 수, 4
		vec.trimToSize(); // vec의 불필요 공간을 삭제함
		System.out.println(vec.capacity()); // 4
		
		vec.removeElement("뉴욕");
		System.out.println(vec);
		vec.removeElementAt(1);
		System.out.println(vec);
		vec.removeAllElements();
		System.out.println(vec);
		
		List<String> list = Arrays.asList("서울", "도쿄", "뉴욕");
		vec.addAll(list);
		System.out.println(vec);
		
		vec.setSize(6); // 원래 vec의 capacity 크기는 4인데, vec의 사이즈를 기존 사이즈보다 늘리게되면 capacity는 기존 크기의 2배씩 증가된다
		System.out.println(vec.capacity()); // 8
		
		
		Enumeration<String> en = vec.elements();
		while(en.hasMoreElements()) {
			System.out.print(en.nextElement()+" ");
		}
		System.out.println();
		
	}

}
