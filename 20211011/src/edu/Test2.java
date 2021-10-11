package edu;

import java.util.HashMap;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> dic = new HashMap<String, String>(); //dictionary
		
		String word[] = {"BUMBLEDBEE", "HEAVEN", "ALTHOUGH", "WONDER"};
		String meaning[] = {"�ܹ����� ���ϴ� ȣ�ڹ�", "õ��", "�׷����� �ұ��ϰ�", "ȣ����� ���"};
		
		for (int i = 0; i < meaning.length; i++) {
			dic.put(word[i], meaning[i]);
		}
		
		System.out.println(dic);
		System.out.println(dic.size());
		
		System.out.println(dic.keySet());
		System.out.println(dic.values());
		
		System.out.println(dic.get("HEAVEN"));
		dic.replace("HEAVEN", "���� �ູ�� ����");
		System.out.println(dic);
		dic.put("HEAVEN", "�̻����� ����"); // ���� Ű�� �����ϸ� ���� �ٲ�� -> HashMap�� �ߺ� Ű�� �ȵȴ�.
		System.out.println(dic);
		
		System.out.println(dic.containsKey("HEAVEN"));
		System.out.println(dic.containsKey("HEAVE"));
		System.out.println(dic.containsValue("�׷����� �ұ��ϰ�"));
		System.out.println(dic.containsValue("�׷����� �ұ���"));
		
		dic.remove("HEAVEN");
		dic.clear();
		System.out.println(dic.isEmpty());
		System.out.println(dic.size());
	}

}
