package Test;


public class TestAnimals {
	public static void main(String[] args) {
		Fish f = new Fish();
		Cat c = new Cat("Fluffy");
		Animal a = new Fish();
		Animal e = new Spider();
		Pet p = new Cat();

		// Demonstrate different implementations of an interface
		f.play();
		c.play();

		// Demonstrate virtual method invocation
		e.eat();
		e.walk();

		// Demonstrate calling super methods
		a.walk();
	}
}

abstract class Animal {
	protected int legs;
	
	protected Animal(int legs) {
		this.legs = legs;
	}
	
	public Animal() {
		
	}
	
	public void walk() {
		System.out.println("This animal walks on "+legs+" legs");
	}
	
	public abstract void eat();
}

class Spider extends Animal {
	public Spider() {
		super(8);
	}
	
	@Override
	public void eat() {
		System.out.println("Spiders catch flies in their webs to eat.");
	}
}

interface Pet {
	public String getName();
	public void setName(String name);
	public void play();
}

class Cat extends Animal implements Pet{
	private String name;
	
	public Cat() {

	}
	
	public Cat(String name) {
		super(4);
		this.setName(name);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" likes to play with string.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cats like to eat spiders and mice.");
	}
	
	
}

class Fish extends Animal implements Pet{
	private String name;
	
	public Fish() {
		super(0);
		this.name = "";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"Fish swim in their tanks all day");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Fish eat pond scum");
	}
	
	public void walk() {
		// TODO Auto-generated method stub
		super.walk();
		System.out.println("Fish, of course, can't walk; they swim");
	}
}