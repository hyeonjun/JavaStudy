package ede;

public class test_2D_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2차원 배열 생성 1 - 2차 배열의 크기가 동일할 때
		int arr1[][] = new int[3][2];
		// 2차원 배열 생성 2 - 2차 배열의 크기가 다를 때
		int arr2[][] = new int[3][];
		arr2[0] = new int[2];
		arr2[1] = new int[4];
		arr2[2] = new int[3];
		
		// 2차원배열 접근
		arr1[0][0] = 10;
		arr1[0][1] = 20;
		
		arr1[1][0] = 30;
		arr1[1][1] = 40;
		
		arr1[2][0] = 50;
		arr1[2][1] = 60;
		
		for (int i=0; i<arr1.length; i++) {
			for (int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
		}
		System.out.println();
		
		
		arr2[0][0] = 10;
		arr2[0][1] = 20;

		arr2[1][0] = 30;
		arr2[1][1] = 40;
		arr2[1][2] = 50;
		arr2[1][3] = 60;
		
		arr2[2][0] = 70;
		arr2[2][1] = 80;
		arr2[2][2] = 90;
		
		for (int i=0; i<arr2.length; i++) {
			for (int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
		}
		System.out.println();
		
		
		int[][] arr3 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
		int[][] arr4 = {{10, 20}, {30, 40, 50, 60}, {70, 80, 90}};
		
		for (int i=0; i<arr3.length; i++) {
			for (int j=0; j<arr3[i].length; j++) {
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		
		for (int i=0; i<arr4.length; i++) {
			for (int j=0; j<arr4[i].length; j++) {
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}
	
	}

}
