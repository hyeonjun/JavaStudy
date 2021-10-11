package edu;

import java.util.HashMap;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> dic = new HashMap<String, String>(); //dictionary
		
		String word[] = {"BUMBLEDBEE", "HEAVEN", "ALTHOUGH", "WONDER"};
		String meaning[] = {"꿀벌과에 속하는 호박벌", "천국", "그럼에도 불구하고", "호기심이 들다"};
		
		for (int i = 0; i < meaning.length; i++) {
			dic.put(word[i], meaning[i]);
		}
		
		System.out.println(dic);
		System.out.println(dic.size());
		
		System.out.println(dic.keySet());
		System.out.println(dic.values());
		
		System.out.println(dic.get("HEAVEN"));
		dic.replace("HEAVEN", "아주 행복한 감정");
		System.out.println(dic);
		dic.put("HEAVEN", "이상적인 세상"); // 같은 키가 존재하면 값만 바뀐다 -> HashMap은 중복 키가 안된다.
		System.out.println(dic);
		
		System.out.println(dic.containsKey("HEAVEN"));
		System.out.println(dic.containsKey("HEAVE"));
		System.out.println(dic.containsValue("그럼에도 불구하고"));
		System.out.println(dic.containsValue("그럼에도 불구하"));
		
		dic.remove("HEAVEN");
		dic.clear();
		System.out.println(dic.isEmpty());
		System.out.println(dic.size());
	}

}
