package edu;

import java.util.TreeMap;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> users = new TreeMap<String, String>();
		users.put("20080319", "��Ǫ��");
		users.put("20070620", "���ϴ�");
		users.put("20050817", "ȫ�浿");
		users.put("20120728", "������");
		users.put("20120924", "�̼���");
		
		System.out.println(users);
		System.out.println(users.firstEntry());
		System.out.println(users.lastEntry());
		
		System.out.println(users.lowerEntry("20130101")); // �� ������ ���� ���� ���
		System.out.println(users.higherEntry("20111231")); //�� ������ ū �� ���
		
		System.out.println("=================================");
		while(!users.isEmpty()) {
			System.out.println(users.pollFirstEntry());
			System.out.println(users);
		}
	}

}
