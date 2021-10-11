package edu;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		LinkedList<String> list2 = new LinkedList<>(); // Java 8부터 타입 생략 가능 
		
		
		list.add("서울");
		list.add("북경");
		list.add("상해");
		
		list.add(1, "LA"); // index 1에 LA가 들어감(insert)
		list.addFirst("런던"); // 첫번째 index 앞에 런던 넣음
		list.addLast("서울"); // 마지막 index 뒤에 서울 넣음
		
		list.offer("파리");
		list.offerFirst("로마");
		list.offerLast("베른");
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("=============================");
		// 요소 출력
		System.out.println(list.peek()); // 첫 번째 값 출력
		System.out.println(list.peekFirst()); // 첫 번째 값 출력
		System.out.println(list.peekLast()); // 마지막 값 출력
		
		// 삭제 후 요소 리턴
		System.out.println("=============================");
		System.out.println(list.poll()); // 첫번째 값 빼기
		System.out.println(list);
		System.out.println(list.pollFirst());
		System.out.println(list);
		System.out.println(list.pollLast()); // 마지막 값 빼기
		System.out.println(list);
		
		
		// 첫번째 요소 추가, 추출 : push, pop
		System.out.println("=============================");
		list.push("제주");
		System.out.println(list);
		System.out.println(list.pop());
		
		System.out.println(list.get(3));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list);
		
		// 요소 검색
		System.out.println(list.indexOf("서울"));
		System.out.println(list.lastIndexOf("서울"));
		
		// 요소 삭제
		System.out.println(list); // [서울, LA, 북경, 상해, 서울, 파리]
		list.removeFirst();
		System.out.println(list); // [LA, 북경, 상해, 서울, 파리]
		list.removeLast();
		System.out.println(list); // [LA, 북경, 상해, 서울]
		list.remove();
		System.out.println(list); // [북경, 상해, 서울]
		list.remove(1);
		System.out.println(list); // [북경, 서울]
		list.remove("서울");
		System.out.println(list); // [북경]
	}

}
