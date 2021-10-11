package com.encore.java.api;
// java.lang.String�� ���� ���� �Ұ���
// java.lang.StringBuffer, java.lang.StringBuilder : ���ڿ� ó�� ��ü -> ���� ���� ����
// �� ���� ���̴� ����ȭ(���ÿ� ���� ���� ��� �� ��ü�� �����Ϸ��� �� �� -> �Ѹ��� ���� ������ ���, ������ ������ ����) ����
// StringBuffer : ����ȭ O, 
// StringBuilder : ����ȭ X
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "good ";
		System.out.println(s1.concat(" nice")); // "good  nice"
		System.out.println(s1); // "good " -> ����ȵ�
		
		StringBuffer sbf = new StringBuffer("���� ���Ƽ� ");
		System.out.println(sbf); // "���� ���Ƽ� "
		System.out.println(sbf.append("���� �����ؼ� ")); // "���� ���Ƽ� ���� �����ؼ� "
		System.out.println(sbf); // "���� ���Ƽ� ���� �����ؼ� " -> ����� 
		
		StringBuilder sbd = new StringBuilder("���� ���Ƽ� ");
		System.out.println(sbd); // "���� ���Ƽ� "
		System.out.println(sbd.append("���� �����ؼ� ")); // "���� ���Ƽ� ���� �����ؼ� "
		System.out.println(sbd); // "���� ���Ƽ� ���� �����ؼ� " -> �����
	
		System.out.println(sbf.insert(7,  "���� ���� �ʾƼ� ")); // "���� ���Ƽ� ���� ���� �ʾƼ� ���� �����ؼ� "
		System.out.println(sbf); // "���� ���Ƽ� ���� ���� �ʾƼ� ���� �����ؼ� "
		
		System.out.println(sbd.insert(14,  " ���� ���� �ʾƼ�")); // "���� ���Ƽ� ���� �����ؼ� ���� ���� �ʾƼ�"
		System.out.println(sbd); // "���� ���Ƽ� ���� �����ؼ� ���� ���� �ʾƼ�"
		
		
		System.out.println(sbf.replace(7, 17, "good!")); //���� ���Ƽ� good!���� �����ؼ� 
		System.out.println(sbf.replace(7, 17, "good!")); //���� ���Ƽ� good!�ؼ� 
		
	}

}
