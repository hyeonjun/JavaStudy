package com.myproject.biz;

import java.util.ArrayList;

import com.myproject.dao.BookDAO;
import com.myproject.vo.BookVO;

//책에 관련된 서비스를 처리하는 객체 
public class BookService {
	BookDAO dao = new BookDAO();

	//책등록
	public void bookInsert(BookVO vo){
		//새로 등록하는 책의 제목과 저자가 동일한 책에 기존에 등록이 되어 있는지 체크 
		boolean result = dao.title_author_exist(vo);
		if(!result){
		    dao.bookInsert(vo);
		    System.out.println("새로운 책 등록 완료!");
		}else{
			System.out.println("기존에 등록된 책입니다!");
		}
	}

	//책검색
	public ArrayList<BookVO> search(String keyword, int type){
		return dao.getBook(keyword, type);
	}
	
	public ArrayList<BookVO> search(String keyword){
		return dao.getBook(keyword);
	}	 
	
	//책삭제
	public void bookDelete(int no){
		dao.bookDelete(no);
	}
	
	//모든 데이터 추출
	public ArrayList<BookVO> getAll(){
		return dao.getList();
	}	
	
	//  수정
	public void bookUpdate(BookVO vo) {
		dao.bookUpdate(vo);
	}
	
}
