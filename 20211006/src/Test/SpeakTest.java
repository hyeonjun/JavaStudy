package Test;

public class SpeakTest {
	public static void main(String[] args) {
		Object[] obj = { new Reader("길동"), new Worker("둘리"), new Student_("마이콜") };
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] instanceof Speakable) {
				Speakable speaker = (Speakable) obj[i];
				System.out.println(speaker.speak());
			}
		}
	}
}

class Man{
	private String name;
	
	public Man(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

class Student_ extends Man {
	public Student_(String name) {
		super(name);
	}
}

interface Speakable{
	public String speak();
}

class Reader extends Man implements Speakable{
	public Reader(String name) {
		super(name);
	}
	
	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return getName()+" 독자는 자바를 잘 하고 싶다!!";
	}
}

class Worker extends Man implements Speakable{
	public Worker(String name) {
		super(name);
	}
	
	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return getName()+" 일꾼은 자기가 맡은 일을 열심히 한다!!";
	}
}