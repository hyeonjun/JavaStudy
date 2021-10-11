package edu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("고진감래", "고생 끝에 즐거움이 옴");
		dic.put("분골쇄신", "몸이 부서질 정도로 노력을 다함");
		dic.put("권토중래", "실패를 발판삼아 재기함");
		dic.put("교학상자", "가르치고 배우면서 서로 성장함");
		dic.put(null, null);
		
		System.out.println(dic);
		
		System.out.println();
		Iterator<String> keys = dic.keySet().iterator(); // key값에 대한 iterator
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
