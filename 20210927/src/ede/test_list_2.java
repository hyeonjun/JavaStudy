package ede;

public class test_list_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {90, 85, 78, 100, 98};
		char[] alphabet = {'a', 'b', 'c', 'd'};
		String[] name = {"ȫ�浿", "�̼���", "������"};
		for (int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		for (int i=0; i<alphabet.length; i++) {
			System.out.println(alphabet[i]);
		}
		for (int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		
		int[] score2 = {90, 80, 70, 60, 50};
		for(int i:score2) {
			System.out.println(i);
		}
		
		int[] score3 = score2; // �迭���� �ּҰ� ��ü ����
		
		// �迭 ����, ���� ���� 
		int[] score4 = new int[score2.length];
		System.arraycopy(score2, 0, score4, 0, score2.length);
		for (int num:score4)
			System.out.println(num);
	}

}
