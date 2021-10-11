package com.encore.java.collection;

import java.util.Hashtable;

public class Test4 {
	public static void main(String[] args) {
		Hashtable<String, String> dic = new Hashtable<>();
		
		dic.put("��������", "��� ���� ��ſ��� ��");
		dic.put("�а���", "���� �μ��� ������ ����� ����");
		dic.put("�����߷�", "���и� ���ǻ�� �����");
		dic.put("���л���", "����ġ�� ���鼭 ���� ������");
		// dic.put(null, null); // HashTable�� HashMap�� ������, HashTable���� Ű�� ���� null�� ���� �� ����.
		
		System.out.println(dic);
		
		System.out.println(dic.keySet());
		System.out.println(dic.values());
		System.out.println(dic.get("��������"));
		System.out.println(dic.containsKey("��������"));
		System.out.println(dic.contains("��� ���� ��ſ��� ��"));
		
		dic.remove("��������");
		System.out.println(dic);
		System.out.println(dic.get("��������")); // null
	}
}
