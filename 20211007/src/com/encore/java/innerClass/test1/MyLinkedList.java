package com.encore.java.innerClass.test1;

public class MyLinkedList {
	private Node head = null;
	
	private class Node {
		private String data;
		private Node link;
		
		public Node(String data) {
			this.data = data;
		}
		
	}
	
	public void add(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node next = head;
			while(next.link != null) {
				next = next.link;
			}
			next.link = newNode;
		}
	}
	
	public void print() {
		if (head == null) {
			System.out.println("��ϵ� �����Ͱ� �����ϴ�.");
		} else {
			System.out.println("��ϵ� �����ʹ� ������ �����ϴ�.");
			Node next = head;
			while (next != null) {
				System.out.println(next.data);
				next = next.link;
			}
		}
	}
}
