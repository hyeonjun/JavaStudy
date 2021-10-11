package ede;

public class test_2D_list_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[5][5];
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][i];
		}
		System.out.println(sum);
		
		sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i==j)
					sum += arr[i][j];
			}
		}
		System.out.println(sum);
		
		sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i+1; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
		
		
	}
}
