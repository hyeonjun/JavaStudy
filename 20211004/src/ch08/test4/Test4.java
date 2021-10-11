package ch08.test4;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CellPhone c1 = new CellPhone("SM-F711N");
		CellPhone c2 = new CellPhone("SM-F711N");
		CellPhone c3 = c1;
		Person p = new Person();
		
		
		
		System.out.println(c1);
		System.out.println(c2); // 참조변수 출력할때는 자동으로 toString()되서 출력됨
		System.out.println("========================================");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println("========================================\n");
		
		if (c1 == c2) { // 동일 주소인지
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if (c1.model.equals(c2.model)) {
			System.out.println("같다");
		}
		
		
		System.out.println(c1.equals(p));
		System.out.println(c3.equals(c1));
		
		
		
		
	}

}

class CellPhone {
	String model;
	
	public CellPhone(String model) {
		// TODO Auto-generated constructor stub
		this.model = model;
	}
	
	public String toString() { // toString 메소드 오버라이딩 시켜서 모델 리턴
		return this.model;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof CellPhone && this.model.equals(((CellPhone)obj).model)) {
			result = true;
		}
		return result;
	}
}

class Person{
	
}

