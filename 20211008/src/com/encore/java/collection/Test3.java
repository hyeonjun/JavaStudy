package com.encore.java.collection;

import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec = new Vector<String>(); // ����ȭ�Ǿ� �ִ� ����Ʈ
		System.out.println(vec.size());
		vec.addElement("����");
		vec.addElement("����");
		vec.addElement("����");
		
		for (int i=0; i<vec.size(); i++) {
			System.out.println(vec.get(i));
		}
		for (int i=0; i<vec.size(); i++) {
			System.out.println(vec.elementAt(i));
		}
		
		System.out.println(vec.firstElement());
		System.out.println(vec.lastElement());
		
		vec.insertElementAt("�ĸ�", 2); // idx 2�� ���� ����
		System.out.println(vec);
		
		vec.setElementAt("����", 1); // idx�� 1�� ���� ��Ҹ� �������� ����
		System.out.println(vec);
		
		System.out.println(vec.capacity()); // 10, ���ʹ� ��ü ���� �� �ּ� 10 ũ���� ���뷮�� ����
		System.out.println(vec.size()); // ��� ��, 4
		vec.trimToSize(); // vec�� ���ʿ� ������ ������
		System.out.println(vec.capacity()); // 4
		
		vec.removeElement("����");
		System.out.println(vec);
		vec.removeElementAt(1);
		System.out.println(vec);
		vec.removeAllElements();
		System.out.println(vec);
		
		List<String> list = Arrays.asList("����", "����", "����");
		vec.addAll(list);
		System.out.println(vec);
		
		vec.setSize(6); // ���� vec�� capacity ũ��� 4�ε�, vec�� ����� ���� ������� �ø��ԵǸ� capacity�� ���� ũ���� 2�辿 �����ȴ�
		System.out.println(vec.capacity()); // 8
		
		
		Enumeration<String> en = vec.elements();
		while(en.hasMoreElements()) {
			System.out.print(en.nextElement()+" ");
		}
		System.out.println();
		
	}

}
