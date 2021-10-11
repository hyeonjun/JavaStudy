package ede;

public class test_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i < 100; i++) {
			System.out.println(i);
			if (i>10) {
				break;
			}
		}
		for (int i=0; i < 100; i++) {
			if (i%2 == 0) 
				continue;
			System.out.println(i);
		}
	}

}
