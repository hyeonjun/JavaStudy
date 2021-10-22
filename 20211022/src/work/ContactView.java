package work;

import java.util.*;

public class ContactView {
	public static void main(String[] args) {
		ContactService service = new ContactService();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("============== 연락처 등록 시스템 ==============");
			System.out.println("1.전체 연락처 보기\n2.연락처 등록\n3.연락처 검색\n4.연락처 수정\n5.연락처 삭제\n9.종료");
			System.out.print("메뉴 선택 : ");
			String menu = sc.nextLine();
			switch (menu) {
			case "1": {
				ArrayList<ContactVO> list = service.getAll();
				ContactVO vo = null;
				System.out.println("No.\t이름\t번호");
				for (int i = 0; i < list.size(); i++) {
					vo = list.get(i);
					System.out.println(vo.toString());
				}
			}break;
			
			case "2": {
				ContactVO vo = new ContactVO();
				System.out.println("연락처 정보를 입력해주세요");
				System.out.print("이름: ");
				String name = sc.nextLine();
				System.out.print("번호: ");
				String tel = sc.nextLine();
				vo.setName(name); vo.setTel(tel);
				service.insert(vo);
			}break;
			
			case "3":{
				System.out.print("검색어 입력: ");
				String keyword = sc.nextLine();
				ArrayList<ContactVO> list = service.search(keyword);
				if(list.size() == 0) {
					System.out.println("검색 결과가 없습니다.");
				} else {
					for (int i = 0; i < list.size(); i++) {
						ContactVO vo = list.get(i);
						System.out.println(vo.toString());
					}
				}
			}break;
			
			case "4":{
				System.out.print("수정할 이름이나 연락처를 입력해주세요: ");
				String keyword = sc.nextLine();
				ArrayList<ContactVO> list = service.search(keyword);
				ContactVO vo = null;
				if(list.size() == 0) {
					System.out.println("존재하지 않는 이름(또는 연락처)입니다.");
				} else if (list.size() == 1) {
					vo = list.get(0);
					update(vo.getNo());
				} else {
					System.out.println(list.size()+" 개의 연락처가 검색되었습니다.");
					for (int i = 0; i < list.size(); i++) {
						vo = list.get(i);
						System.out.println(vo.toString());
					}
					System.out.print("수정할 연락처의 NO를 입력해주세요: ");
					int no = sc.nextInt();
					update(no);
				}
			}break;
			
			case "5":{
				System.out.print("삭제할 이름이나 연락처를 입력해주세요: ");
				String keyword = sc.nextLine();
				ArrayList<ContactVO> list = service.search(keyword);
				ContactVO vo = null;
				if(list.size() == 0) {
					System.out.println("존재하지 않는 이름(또는 연락처)입니다.");
				} else if(list.size() == 1) {
					vo = list.get(0);
					service.delete(vo.getNo());
				} else {
					System.out.println(list.size()+" 개의 연락처가 검색되었습니다.");
					for (int i = 0; i < list.size(); i++) {
						vo = list.get(i);
						System.out.println(vo.toString());
					}
					System.out.print("삭제할 연락처의 NO를 입력해주세요: ");
					int no = sc.nextInt();
					service.delete(vo.getNo());
				}
			}break;
			
			case "9": {
				System.out.println("프로그램을 종료합니다...");
				System.exit(0);
			}break;

			default:{
				System.out.println("잘못된 입력입니다.");
			}	break;
			}
		}
	}
	
	public static void update(int no) {
		ContactService service = new ContactService();
		Scanner sc = new Scanner(System.in);
		
		ArrayList<ContactVO> list = service.search(no);
		ContactVO vo = list.get(0);
		
		System.out.print("수정할 이름(수정을 원하지 않을 경우 엔터를 누르세요): ");
		String name = sc.nextLine();
		if(name.equals("")) {
			name = vo.getName();
		}
		
		System.out.print("수정할 연락처(수정을 원하지 않을 경우 엔터를 누르세요): ");
		String tel = sc.nextLine();
		if(tel.equals("")) {
			tel = vo.getTel();
		}
		
		vo = new ContactVO(no, name, tel);
		service.update(vo);
		
		list = service.search(no);
		vo = list.get(0);
		System.out.println("No.\t이름\t번호");
		System.out.println(vo.toString());
	}
}
