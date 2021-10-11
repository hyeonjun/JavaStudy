package com.encore.java.collection;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList(); // 모든 타입을 넣을 수 있지만
		
		Object o = new Object();
		String s = new String();
		
		list.add(o);
		list.add(s);
		
		((String)list.get(1)).toString(); // 타입캐스팅해서 넣어야하고
		
		
		ArrayList<String> list2 = new ArrayList<String>(); // String 타입만 넣을 수 있다
//		list2.add(o); // String타입만 넣어야하는데 Object라서 오류
		list2.add(s);
		list2.get(0).toString();
		
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("서울");
		list3.add("상해");
		list3.add("도쿄");
		list3.add("LA");
		list3.add("서울");
		
		System.out.println(list3.size());
		for (int i=0; i<list3.size(); i++) {
			System.out.print(list3.get(i)+" ");
		}
		System.out.println();
		for (String item:list3) {
			System.out.print(item+" ");
		}
		System.out.println();
		
		System.out.println(list3);
		
		System.out.println(list3.indexOf("서울"));
		System.out.println(list3.lastIndexOf("서울"));
		
		list3.remove("LA");
		System.out.println(list3);
		
		list3.remove(2);
		System.out.println(list3);
		
		System.out.println(list3.contains("상해"));
		System.out.println(list3.contains("도쿄"));
		
		// Collection -> 배열
		
		Object[] obj = list3.toArray();
		System.out.println(Arrays.toString(obj));
		
		String[] cities = new String[0];
		cities = list3.toArray(cities);
		System.out.println(Arrays.toString(cities));
		
		// 모든 요소 삭제
		list3.clear();
		System.out.println(list3);
		
		// 요소의 개수가 0개인지 확인
		System.out.println(list3.isEmpty());
		
		list3.add("파리");
		list3.add("방콕");
		list3.add("LA");
		
		
		List<String> list4 = Arrays.asList("서울", "뉴욕", "상해");
		
		list3.addAll(list4); // 전부 추가
		System.out.println(list3);
		
		System.out.println(list3.containsAll(list4)); // 포함하는지
		
		list3.retainAll(list4); // 교집합
		System.out.println(list3);
		
		list3.addAll(list4);
		System.out.println(list3);
		
		list3.removeAll(list4); // list4의 요소와 같은거 모두 삭제
		System.out.println(list3);
		
	}

}
