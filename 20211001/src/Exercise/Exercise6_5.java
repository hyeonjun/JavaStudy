package Exercise;

class Exercise6_5 {
	public static void main(String args[]) {
		Student2 s = new Student2("ȫ�浿",1,1,100,60,76);

		System.out.println(s.info());
	}
}

class Student2 {
	String name;
	int ban, no, kor, eng, math;
	
	public Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String info() {
		int total = kor + eng+math;
		float average = Math.round(total / 3f * 10) / 10f;
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+total+","+average;
	}
}

