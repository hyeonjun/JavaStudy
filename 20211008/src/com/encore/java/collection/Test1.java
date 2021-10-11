package com.encore.java.collection;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList(); // ��� Ÿ���� ���� �� ������
		
		Object o = new Object();
		String s = new String();
		
		list.add(o);
		list.add(s);
		
		((String)list.get(1)).toString(); // Ÿ��ĳ�����ؼ� �־���ϰ�
		
		
		ArrayList<String> list2 = new ArrayList<String>(); // String Ÿ�Ը� ���� �� �ִ�
//		list2.add(o); // StringŸ�Ը� �־���ϴµ� Object�� ����
		list2.add(s);
		list2.get(0).toString();
		
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("����");
		list3.add("����");
		list3.add("����");
		list3.add("LA");
		list3.add("����");
		
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
		
		System.out.println(list3.indexOf("����"));
		System.out.println(list3.lastIndexOf("����"));
		
		list3.remove("LA");
		System.out.println(list3);
		
		list3.remove(2);
		System.out.println(list3);
		
		System.out.println(list3.contains("����"));
		System.out.println(list3.contains("����"));
		
		// Collection -> �迭
		
		Object[] obj = list3.toArray();
		System.out.println(Arrays.toString(obj));
		
		String[] cities = new String[0];
		cities = list3.toArray(cities);
		System.out.println(Arrays.toString(cities));
		
		// ��� ��� ����
		list3.clear();
		System.out.println(list3);
		
		// ����� ������ 0������ Ȯ��
		System.out.println(list3.isEmpty());
		
		list3.add("�ĸ�");
		list3.add("����");
		list3.add("LA");
		
		
		List<String> list4 = Arrays.asList("����", "����", "����");
		
		list3.addAll(list4); // ���� �߰�
		System.out.println(list3);
		
		System.out.println(list3.containsAll(list4)); // �����ϴ���
		
		list3.retainAll(list4); // ������
		System.out.println(list3);
		
		list3.addAll(list4);
		System.out.println(list3);
		
		list3.removeAll(list4); // list4�� ��ҿ� ������ ��� ����
		System.out.println(list3);
		
	}

}
