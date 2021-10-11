package edu;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		LinkedList<String> list2 = new LinkedList<>(); // Java 8���� Ÿ�� ���� ���� 
		
		
		list.add("����");
		list.add("�ϰ�");
		list.add("����");
		
		list.add(1, "LA"); // index 1�� LA�� ��(insert)
		list.addFirst("����"); // ù��° index �տ� ���� ����
		list.addLast("����"); // ������ index �ڿ� ���� ����
		
		list.offer("�ĸ�");
		list.offerFirst("�θ�");
		list.offerLast("����");
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("=============================");
		// ��� ���
		System.out.println(list.peek()); // ù ��° �� ���
		System.out.println(list.peekFirst()); // ù ��° �� ���
		System.out.println(list.peekLast()); // ������ �� ���
		
		// ���� �� ��� ����
		System.out.println("=============================");
		System.out.println(list.poll()); // ù��° �� ����
		System.out.println(list);
		System.out.println(list.pollFirst());
		System.out.println(list);
		System.out.println(list.pollLast()); // ������ �� ����
		System.out.println(list);
		
		
		// ù��° ��� �߰�, ���� : push, pop
		System.out.println("=============================");
		list.push("����");
		System.out.println(list);
		System.out.println(list.pop());
		
		System.out.println(list.get(3));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list);
		
		// ��� �˻�
		System.out.println(list.indexOf("����"));
		System.out.println(list.lastIndexOf("����"));
		
		// ��� ����
		System.out.println(list); // [����, LA, �ϰ�, ����, ����, �ĸ�]
		list.removeFirst();
		System.out.println(list); // [LA, �ϰ�, ����, ����, �ĸ�]
		list.removeLast();
		System.out.println(list); // [LA, �ϰ�, ����, ����]
		list.remove();
		System.out.println(list); // [�ϰ�, ����, ����]
		list.remove(1);
		System.out.println(list); // [�ϰ�, ����]
		list.remove("����");
		System.out.println(list); // [�ϰ�]
	}

}
