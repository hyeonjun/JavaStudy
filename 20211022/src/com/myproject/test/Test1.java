package com.myproject.test;

import java.util.*;

import com.myproject.biz.BookService;
import com.myproject.vo.BookVO;

public class Test1 {

	public static void main(String[] args) {
		
		BookService service = new BookService();
		
		//å��� �׽�Ʈ
		BookVO vo = new BookVO();
		vo.setTitle("�ӽŷ���");
		vo.setAuthor("������");
		vo.setPublisher("���");
		
		service.bookInsert(vo);
		
		//��������  �˻�
		Scanner input = new Scanner(System.in);
/*		System.out.print("�˻��� �Է� : ");
		String keyword = input.nextLine();
		System.out.print("�з� : ");
		int type = input.nextInt();
		
		ArrayList<BookVO>  list = service.search(keyword, type);
		int size = list.size();
		if(size==0){
			System.out.println("�˻��� ����� �����ϴ�.");
		}else{
			for (int i = 0; i < size; i++) {
				BookVO b = list.get(i);
                System.out.println(b.getNo()+"/"+b.getTitle()+"/"+b.getAuthor()+"/"+b.getPublisher());
			}
		}*/
		
		//���� �۾�
/*		ArrayList<BookVO>  list = service.search("�ӽŷ���");
		int size = list.size();
		if(size==0){
			System.out.println("�˻��� ����� �����ϴ�.");
		}else{
			for (int i = 0; i < size; i++) {
				BookVO b = list.get(i);
                System.out.println(b.getNo()+"/"+b.getTitle()+"/"+b.getAuthor()+"/"+b.getPublisher());
			}
			System.out.print("������ �������� no ���� �Է� :");
			int no = input.nextInt();
			service.bookDelete(no);
		}*/
		
		ArrayList<BookVO>  list = service.getAll();
		int size = list.size();
		if(size==0){
			System.out.println("�˻��� ����� �����ϴ�.");
		}else{
			for (int i = 0; i < size; i++) {
				BookVO b = list.get(i);
                System.out.println(b.getNo()+"/"+b.getTitle()+"/"+b.getAuthor()+"/"+b.getPublisher());
			}
		}
		
		//����
		ArrayList<BookVO>  list2 = service.search("�ӽŷ���");
		int size2 = list2.size();
		if(size2==0){
			System.out.println("�˻��� ����� �����ϴ�.");
		}else{
			for (int i = 0; i < size2; i++) {
				BookVO b = list2.get(i);
                System.out.println(b.getNo()+"/"+b.getTitle()+"/"+b.getAuthor()+"/"+b.getPublisher());
			}
			System.out.print("������ �������� no ���� �Է� :");
			int no = input.nextInt();
			input.nextLine();
			System.out.println("������ ���� �Է� : ");
			String title = input.nextLine();
			System.out.println("������ ���� �Է� : ");
			String author = input.nextLine();
			System.out.println("������ ���ǻ� �Է� : ");
			String publisher = input.nextLine();
			vo = new BookVO(no, title, author, publisher);
			service.bookUpdate(vo);
			
		}
		
		
	}

}
