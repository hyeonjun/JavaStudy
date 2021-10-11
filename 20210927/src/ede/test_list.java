package ede;

public class test_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp[];
		int[] temp2; // 배열의 주소를 갖는 참조 변수 선언
		
		/*
		 * 배열 선언 방법
		 * 1. type 설정
		 * 2. 개수(배열 크기) 지정
		 * */
		temp = new int[5]; // 배열 생성
		int[] temp4 = new int[] {1, 2, 3}; // 배열 선언과 동시에 특정값으로 초기화하면 초기화 요소 개수만큼 생성되고, [] 안의 개수는 생략.
		// int[] temp4 = new int[3] {1, 2, 3}; // 불가능 ([3]을 생략해야한다)
		int[] temp5 = {1, 2, 3}; // 선언과 동시에 초기화할 경우 new int[] 부분을 생략할 수 있음.
		
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
		// 배열은 생성 시 자동 초기화된다.
		// 기본 : 0, 참조 : null
		
		// 배열 선언하고 초기화 작업 1
		int[] arr2 = new int[3];
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		
		// 배열 선언하고 초기화 작업 2
		int[] arr3 = {10, 20, 30};
		
		// 배열 크기를 갖는 length 변수
		System.out.println(arr3.length); // 3
		
		
		
	}

}
