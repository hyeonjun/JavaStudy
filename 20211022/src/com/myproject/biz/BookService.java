package com.myproject.biz;

import java.util.ArrayList;

import com.myproject.dao.BookDAO;
import com.myproject.vo.BookVO;

//å�� ���õ� ���񽺸� ó���ϴ� ��ü 
public class BookService {
	BookDAO dao = new BookDAO();

	//å���
	public void bookInsert(BookVO vo){
		//���� ����ϴ� å�� ����� ���ڰ� ������ å�� ������ ����� �Ǿ� �ִ��� üũ 
		boolean result = dao.title_author_exist(vo);
		if(!result){
		    dao.bookInsert(vo);
		    System.out.println("���ο� å ��� �Ϸ�!");
		}else{
			System.out.println("������ ��ϵ� å�Դϴ�!");
		}
	}

	//å�˻�
	public ArrayList<BookVO> search(String keyword, int type){
		return dao.getBook(keyword, type);
	}
	
	public ArrayList<BookVO> search(String keyword){
		return dao.getBook(keyword);
	}	 
	
	//å����
	public void bookDelete(int no){
		dao.bookDelete(no);
	}
	
	//��� ������ ����
	public ArrayList<BookVO> getAll(){
		return dao.getList();
	}	
	
	//  ����
	public void bookUpdate(BookVO vo) {
		dao.bookUpdate(vo);
	}
	
}
