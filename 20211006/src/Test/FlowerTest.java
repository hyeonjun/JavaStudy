package Test;

public class FlowerTest {
	public static void main(String[] args) {
		Flower flower = new Flower("���", "������", false);
		printInfo(flower);

		flower = new Flower("�عٶ��", "�����");
		printInfo(flower);

		flower = new Flower("�з��̲�");
		printInfo(flower);
	}

	static public void printInfo(Flower flower) {
		System.out.println("�̸� : " + flower.getName());
		System.out.println("���� : " + flower.getColor());
		System.out.println("�߻� : " + flower.isWild() + "\n");
	}
}

class Flower {
	private String name;
	private String color;
	private boolean isWild;
	
	
	public Flower(String name){
		this(name, "��������");
	}
	
	public Flower(String name, String color){
		this(name, color, true);
	}
	
	public Flower(String name, String color, boolean isWild){
		this.name = name;
		this.color = color;
		this.isWild = isWild;
	}

	public boolean isWild() {
		return isWild;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getName() {
		return name;
	}
	
}
