package edu;

public class MyCalc2 {
	public void add(int... v) { // �迭 ��ü, �Ű����� �������� �޼���
		System.out.println(v.length);
		int sum = 0;
		for (int i:v)
			sum += i;
		System.out.println(sum);
		
	}
	
	public void info(String name, int... score) {
		System.out.print(name+":");
		for (int s:score)
			System.out.print(s+" ");
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		MyCalc2 c = new MyCalc2();
		c.add(10, 20);
		c.add(10, 20, 30);
		c.add(10, 20, 30, 40);
		c.add(10, 20, 30, 40, 50);
		
		
		c.info("ȫ�浿", 90,85,80);
		
	}


}
