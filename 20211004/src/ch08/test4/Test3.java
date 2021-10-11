package ch08.test4;

public class Test3 {
	public void eat(Animal a) {
		if (a instanceof Cat) {
			System.out.println("생선을 먹습니다.");
			
//			Cat c = (Cat) a;
//			c.tail = 30.5;
			
			((Cat)a).tail = 30.5;

		} else if (a instanceof Dog) {
			System.out.println("사료를 먹습니다.");
			
//			Dog d = (Dog) a;
//			d.species = "푸들";
			
			((Dog)a).species = "푸들";
			
		} else if (a instanceof Bird) {
			System.out.println("애벌레를 먹습니다.");
			
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
		
		
		Cat c1 = new Cat("나비");
		Cat c2 = new Cat("야옹이");
		Cat c3 = new Cat("멍군");
		Cat[] list = new Cat[3];
		list[0] = c1;
		list[1] = c2;
		list[2] = c3; // 주소값을 넣음.
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
		System.out.println("움직입니다");
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



