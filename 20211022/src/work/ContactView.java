package work;

import java.util.*;

public class ContactView {
	public static void main(String[] args) {
		ContactService service = new ContactService();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("============== ����ó ��� �ý��� ==============");
			System.out.println("1.��ü ����ó ����\n2.����ó ���\n3.����ó �˻�\n4.����ó ����\n5.����ó ����\n9.����");
			System.out.print("�޴� ���� : ");
			String menu = sc.nextLine();
			switch (menu) {
			case "1": {
				ArrayList<ContactVO> list = service.getAll();
				ContactVO vo = null;
				System.out.println("No.\t�̸�\t��ȣ");
				for (int i = 0; i < list.size(); i++) {
					vo = list.get(i);
					System.out.println(vo.toString());
				}
			}break;
			
			case "2": {
				ContactVO vo = new ContactVO();
				System.out.println("����ó ������ �Է����ּ���");
				System.out.print("�̸�: ");
				String name = sc.nextLine();
				System.out.print("��ȣ: ");
				String tel = sc.nextLine();
				vo.setName(name); vo.setTel(tel);
				service.insert(vo);
			}break;
			
			case "3":{
				System.out.print("�˻��� �Է�: ");
				String keyword = sc.nextLine();
				ArrayList<ContactVO> list = service.search(keyword);
				if(list.size() == 0) {
					System.out.println("�˻� ����� �����ϴ�.");
				} else {
					for (int i = 0; i < list.size(); i++) {
						ContactVO vo = list.get(i);
						System.out.println(vo.toString());
					}
				}
			}break;
			
			case "4":{
				System.out.print("������ �̸��̳� ����ó�� �Է����ּ���: ");
				String keyword = sc.nextLine();
				ArrayList<ContactVO> list = service.search(keyword);
				ContactVO vo = null;
				if(list.size() == 0) {
					System.out.println("�������� �ʴ� �̸�(�Ǵ� ����ó)�Դϴ�.");
				} else if (list.size() == 1) {
					vo = list.get(0);
					update(vo.getNo());
				} else {
					System.out.println(list.size()+" ���� ����ó�� �˻��Ǿ����ϴ�.");
					for (int i = 0; i < list.size(); i++) {
						vo = list.get(i);
						System.out.println(vo.toString());
					}
					System.out.print("������ ����ó�� NO�� �Է����ּ���: ");
					int no = sc.nextInt();
					update(no);
				}
			}break;
			
			case "5":{
				System.out.print("������ �̸��̳� ����ó�� �Է����ּ���: ");
				String keyword = sc.nextLine();
				ArrayList<ContactVO> list = service.search(keyword);
				ContactVO vo = null;
				if(list.size() == 0) {
					System.out.println("�������� �ʴ� �̸�(�Ǵ� ����ó)�Դϴ�.");
				} else if(list.size() == 1) {
					vo = list.get(0);
					service.delete(vo.getNo());
				} else {
					System.out.println(list.size()+" ���� ����ó�� �˻��Ǿ����ϴ�.");
					for (int i = 0; i < list.size(); i++) {
						vo = list.get(i);
						System.out.println(vo.toString());
					}
					System.out.print("������ ����ó�� NO�� �Է����ּ���: ");
					int no = sc.nextInt();
					service.delete(vo.getNo());
				}
			}break;
			
			case "9": {
				System.out.println("���α׷��� �����մϴ�...");
				System.exit(0);
			}break;

			default:{
				System.out.println("�߸��� �Է��Դϴ�.");
			}	break;
			}
		}
	}
	
	public static void update(int no) {
		ContactService service = new ContactService();
		Scanner sc = new Scanner(System.in);
		
		ArrayList<ContactVO> list = service.search(no);
		ContactVO vo = list.get(0);
		
		System.out.print("������ �̸�(������ ������ ���� ��� ���͸� ��������): ");
		String name = sc.nextLine();
		if(name.equals("")) {
			name = vo.getName();
		}
		
		System.out.print("������ ����ó(������ ������ ���� ��� ���͸� ��������): ");
		String tel = sc.nextLine();
		if(tel.equals("")) {
			tel = vo.getTel();
		}
		
		vo = new ContactVO(no, name, tel);
		service.update(vo);
		
		list = service.search(no);
		vo = list.get(0);
		System.out.println("No.\t�̸�\t��ȣ");
		System.out.println(vo.toString());
	}
}
