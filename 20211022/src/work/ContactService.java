package work;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactService {
	ContactDAO dao = new ContactDAO();
	
	public void insert(ContactVO vo) {
		String tel = vo.getTel();
		Pattern  p = Pattern.compile("\\d{3}-\\d{4}-\\d{4}");
		Matcher m = p.matcher(tel);
		if (!m.matches()) {
			System.out.println("�߸��� ��ȣ�Դϴ�.");
		} else {
			boolean result = dao.tel_Exist(vo);
			if(!result) {
				dao.Insert(vo);
				System.out.println("����ó ��� �Ϸ�");
			} else {
				System.out.println("�̹� ��ϵ� ��ȣ�Դϴ�.");
			}
		}
	}
	
	public void delete(int no) {
		dao.Delete(no);
	}
	
	public void update(ContactVO vo) {
		String tel = vo.getTel();
		Pattern  p = Pattern.compile("\\d{3}-\\d{4}-\\d{4}");
		Matcher m = p.matcher(tel);
		if (!m.matches()) 
			System.out.println("�߸��� ��ȣ�Դϴ�.");
		else
			dao.Update(vo);
	}
	
	public ArrayList<ContactVO> getAll(){
		return dao.getAll();
	}
	
	// �˻�
	public ArrayList<ContactVO> search(String keyword){
		return dao.Select(keyword);
	}
	
	public ArrayList<ContactVO> search(int no){
		return dao.Select(no);
	}
	
	
	
}
