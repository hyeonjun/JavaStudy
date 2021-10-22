package com.myproject.test;

import java.util.*;

import com.myproject.biz.BookService;
import com.myproject.vo.BookVO;

public class Test1 {

	public static void main(String[] args) {
		
		BookService service = new BookService();
		
		//책등록 테스트
		BookVO vo = new BookVO();
		vo.setTitle("머신러닝");
		vo.setAuthor("유관순");
		vo.setPublisher("길벗");
		
		service.bookInsert(vo);
		
		//조건으로  검색
		Scanner input = new Scanner(System.in);
/*		System.out.print("검색어 입력 : ");
		String keyword = input.nextLine();
		System.out.print("분류 : ");
		int type = input.nextInt();
		
		ArrayList<BookVO>  list = service.search(keyword, type);
		int size = list.size();
		if(size==0){
			System.out.println("검색된 결과가 없습니다.");
		}else{
			for (int i = 0; i < size; i++) {
				BookVO b = list.get(i);
                System.out.println(b.getNo()+"/"+b.getTitle()+"/"+b.getAuthor()+"/"+b.getPublisher());
			}
		}*/
		
		//삭제 작업
/*		ArrayList<BookVO>  list = service.search("머신러닝");
		int size = list.size();
		if(size==0){
			System.out.println("검색된 결과가 없습니다.");
		}else{
			for (int i = 0; i < size; i++) {
				BookVO b = list.get(i);
                System.out.println(b.getNo()+"/"+b.getTitle()+"/"+b.getAuthor()+"/"+b.getPublisher());
			}
			System.out.print("삭제할 데이터의 no 값을 입력 :");
			int no = input.nextInt();
			service.bookDelete(no);
		}*/
		
		ArrayList<BookVO>  list = service.getAll();
		int size = list.size();
		if(size==0){
			System.out.println("검색된 결과가 없습니다.");
		}else{
			for (int i = 0; i < size; i++) {
				BookVO b = list.get(i);
                System.out.println(b.getNo()+"/"+b.getTitle()+"/"+b.getAuthor()+"/"+b.getPublisher());
			}
		}
		
		//수정
		ArrayList<BookVO>  list2 = service.search("머신러닝");
		int size2 = list2.size();
		if(size2==0){
			System.out.println("검색된 결과가 없습니다.");
		}else{
			for (int i = 0; i < size2; i++) {
				BookVO b = list2.get(i);
                System.out.println(b.getNo()+"/"+b.getTitle()+"/"+b.getAuthor()+"/"+b.getPublisher());
			}
			System.out.print("수정할 데이터의 no 값을 입력 :");
			int no = input.nextInt();
			input.nextLine();
			System.out.println("수정할 제목 입력 : ");
			String title = input.nextLine();
			System.out.println("수정할 저자 입력 : ");
			String author = input.nextLine();
			System.out.println("수정할 출판사 입력 : ");
			String publisher = input.nextLine();
			vo = new BookVO(no, title, author, publisher);
			service.bookUpdate(vo);
			
		}
		
		
	}

}
