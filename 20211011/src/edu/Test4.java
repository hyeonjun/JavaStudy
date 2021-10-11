package edu;

import java.util.TreeMap;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> users = new TreeMap<String, String>();
		users.put("20080319", "±èÇª¸§");
		users.put("20070620", "±èÇÏ´Ã");
		users.put("20050817", "È«±æµ¿");
		users.put("20120728", "±èÀ¯ºó");
		users.put("20120924", "ÀÌ¼ø½Å");
		
		System.out.println(users);
		System.out.println(users.firstEntry());
		System.out.println(users.lastEntry());
		
		System.out.println(users.lowerEntry("20130101")); // ÀÌ °ªº¸´Ù ÀÛÀº °ªÀ» Ãâ·Â
		System.out.println(users.higherEntry("20111231")); //ÀÌ °ªº¸´Ù Å« °ª Ãâ·Â
		
		System.out.println("=================================");
		while(!users.isEmpty()) {
			System.out.println(users.pollFirstEntry());
			System.out.println(users);
		}
	}

}
