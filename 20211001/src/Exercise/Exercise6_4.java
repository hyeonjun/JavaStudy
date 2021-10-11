package Exercise;

class Exercise6_4 {
	public static void main(String args[]) {
		Student1 s = new Student1();
		s.name = "È«±æµ¿";
		s.ban  = 1;
		s.no   = 1;
		s.kor  = 100;
		s.eng  = 60;
		s.math = 76;

		System.out.println("ÀÌ¸§:"+s.name);
		System.out.println("ÃÑÁ¡:"+s.getTotal());
		System.out.println("Æò±Õ:"+s.getAverage());
	}
}

class Student1 {
	String name;
	int ban, no, kor, eng, math;
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	public float getAverage() {
		return Math.round(getTotal() / 3f * 10) / 10f;
	}
	
}


