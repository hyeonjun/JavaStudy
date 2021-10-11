package com.encore.java.app;

import java.util.ArrayList;
import java.util.Iterator;

public class Contact {
	ArrayList<Friend> friend_list = null;
	
	public Contact() {
		friend_list = new ArrayList<Friend>();
	}
	
	// ����ó�� ģ�� �߰�
	public void add(Friend new_friend) {
		friend_list.add(new_friend);
	}
	
	// ����ó ��� Ȯ��
	public void getInfo() {
		for (int i = 0; i < friend_list.size(); i++) {
			System.out.println(friend_list.get(i));
		}
	}
	
	// �̸� �˻�
	public ArrayList<Friend> search(String name) {
		ArrayList<Friend> result = new ArrayList<>();
		Iterator<Friend> iter = friend_list.iterator();
		while(iter.hasNext()) {
			Friend f = iter.next();
			if (f.getName().equals(name)){
				result.add(f);
			}
		}
		return result;
	}
	
	public void delete(String name) {
		ArrayList<Friend> search_result = this.search(name);
		if (search_result.isEmpty()) {
			System.out.println("������ ����ó�� �������� �ʽ��ϴ�.");
		} else {
			this.friend_list.removeAll(search_result);
			System.out.println("����ó ������ �Ϸ��Ͽ����ϴ�.");
		}
	}
	
//	public void modify(String name, String tel) {
//		for (int i = 0; i < friend_list.size(); i++) {
//			Friend f = friend_list.get(i);
//			if(f.getName().equals(name)) {
//				f.setTel(tel);
//			}
//		}
//		System.out.println("����ó ������ �Ϸ��Ͽ����ϴ�.");
//	}
	
	public void modify(Friend f, String tel) {
		f.setTel(tel);
	}
}
