package edu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("��������", "��� ���� ��ſ��� ��");
		dic.put("�а���", "���� �μ��� ������ ����� ����");
		dic.put("�����߷�", "���и� ���ǻ�� �����");
		dic.put("���л���", "����ġ�� ���鼭 ���� ������");
		dic.put(null, null);
		
		System.out.println(dic);
		
		System.out.println();
		Iterator<String> keys = dic.keySet().iterator(); // key���� ���� iterator
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(key+ ":"+ dic.get(key) );
		}
		
		System.out.println();
		for (String key : dic.keySet()) {
			System.out.println(key+ ":"+ dic.get(key));
		}
	
		
		System.out.println();
		for (Map.Entry<String, String> item: dic.entrySet()) {
			System.out.println(item.getKey()+":"+item.getValue());
		}
		
		
		
		
	}

}
