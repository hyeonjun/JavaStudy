package ede;

public class test_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp[];
		int[] temp2; // �迭�� �ּҸ� ���� ���� ���� ����
		
		/*
		 * �迭 ���� ���
		 * 1. type ����
		 * 2. ����(�迭 ũ��) ����
		 * */
		temp = new int[5]; // �迭 ����
		int[] temp4 = new int[] {1, 2, 3}; // �迭 ����� ���ÿ� Ư�������� �ʱ�ȭ�ϸ� �ʱ�ȭ ��� ������ŭ �����ǰ�, [] ���� ������ ����.
		// int[] temp4 = new int[3] {1, 2, 3}; // �Ұ��� ([3]�� �����ؾ��Ѵ�)
		int[] temp5 = {1, 2, 3}; // ����� ���ÿ� �ʱ�ȭ�� ��� new int[] �κ��� ������ �� ����.
		
		char[] arr = new char[3];
		
		temp[0] = 10;
		arr[0] = 'a';
		System.out.println(temp[0]);
		System.out.println(arr[0]);
		
		
		String[] names = new String[4];
		names[0] = "Amy";
		names[1] = "Josh";
		names[2] = "Tom";
		names[3] = "John";
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		// �迭�� ���� �� �ڵ� �ʱ�ȭ�ȴ�.
		// �⺻ : 0, ���� : null
		
		// �迭 �����ϰ� �ʱ�ȭ �۾� 1
		int[] arr2 = new int[3];
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		
		// �迭 �����ϰ� �ʱ�ȭ �۾� 2
		int[] arr3 = {10, 20, 30};
		
		// �迭 ũ�⸦ ���� length ����
		System.out.println(arr3.length); // 3
		
		
		
	}

}
