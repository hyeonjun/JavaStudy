package exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise8_8
{ 
    public static void main(String[] args) 
    { 
		int answer = (int)(Math.random() * 100) + 1; 
		int input = 0;
		int count = 0;
		
		do { 
			count++;
			try {
			System.out.print("1�� 100������ ���� �Է��ϼ��� :");
			input = new Scanner(System.in).nextInt();
			} catch (InputMismatchException e) {
				System.out.println("�߸��� ���Դϴ�.");
				continue;
			}
				
			if(answer > input) { 
				System.out.println("�� ū ���� �Է��ϼ���."); 
			} else if(answer < input) { 
				System.out.println("�� ���� ���� �Է��ϼ���."); 
			} else { 
				System.out.println("������ϴ�.");                   
				System.out.println("�õ�Ƚ���� "+count+"���Դϴ�.");                   
				break;
			}
		} while(true);
    }
}

