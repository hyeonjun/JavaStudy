package Test;

public class FlowerTest {
	public static void main(String[] args) {
		Flower flower = new Flower("장미", "빨간색", false);
		printInfo(flower);

		flower = new Flower("해바라기", "노란색");
		printInfo(flower);

		flower = new Flower("패랭이꽃");
		printInfo(flower);
	}

	static public void printInfo(Flower flower) {
		System.out.println("이름 : " + flower.getName());
		System.out.println("색깔 : " + flower.getColor());
		System.out.println("야생 : " + flower.isWild() + "\n");
	}
}

class Flower {
	private String name;
	private String color;
	private boolean isWild;
	
	
	public Flower(String name){
		this(name, "알지못함");
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
