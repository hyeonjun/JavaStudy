package com.encore.java.collection;

import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("����");
		list.add("�ϰ�");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		Iterator<String> iter = list.iterator(); // ����
		while (iter.hasNext()) { // ���� ���� �ִ���
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		
		
		
		
	}
}
