package ch08.test4;

public class Test3 {
	public void eat(Animal a) {
		if (a instanceof Cat) {
			System.out.println("������ �Խ��ϴ�.");
			
//			Cat c = (Cat) a;
//			c.tail = 30.5;
			
			((Cat)a).tail = 30.5;

		} else if (a instanceof Dog) {
			System.out.println("��Ḧ �Խ��ϴ�.");
			
//			Dog d = (Dog) a;
//			d.species = "Ǫ��";
			
			((Dog)a).species = "Ǫ��";
			
		} else if (a instanceof Bird) {
			System.out.println("�ֹ����� �Խ��ϴ�.");
			
//			Bird b = (Bird) a;
//			b.isFly = true;
			
			((Bird)a).isFly = true;
		}
	}
	
	public static void main(String[] args) {
		Cat c = new Cat();
		Dog d = new Dog();
		Bird b = new Bird();
		
		
		Test3 t = new Test3();
		t.eat(c);
		t.eat(d);
		t.eat(b);
		
		System.out.println(c.tail);
		System.out.println(d.species);
		System.out.println(b.isFly);
		
		
		Cat c1 = new Cat("����");
		Cat c2 = new Cat("�߿���");
		Cat c3 = new Cat("�۱�");
		Cat[] list = new Cat[3];
		list[0] = c1;
		list[1] = c2;
		list[2] = c3; // �ּҰ��� ����.
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].name);
		}
		
		Animal[] list2 = new Animal[3];
		list2[0] = c;
		list2[1] = d;
		list2[2] = b;
		for (int i = 0; i < list2.length; i++) {
			System.out.println(list2[i]);
		}
		
	}
}


class Animal{
	String name;
	
	Animal(){
		this.name = "no name";
	}
	
	Animal(String name){
		this.name = name;
	}
	public void move() {
		System.out.println("�����Դϴ�");
	}
}

class Cat extends Animal{
	Cat(){}
	
	Cat(String name){
		super(name);
	}
	double tail;
}

class Dog extends Animal{
	Dog(){}
	
	Dog(String name){
		super(name);
	}
	String species;
}

class Bird extends Animal{
	Bird(){}
	
	Bird(String name){
		super(name);
	}
	boolean isFly;
}



