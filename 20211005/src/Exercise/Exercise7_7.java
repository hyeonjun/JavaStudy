package Exercise;

class Parent2 {
	int x=100;

	Parent2() {
		this(200);
	}

	Parent2(int x) {
		this.x = x;
	}

	int getX() {
		return x;
	}
}

class Child2 extends Parent2 {
	int y = 3000;

	Child2() {
		this(1000);
	}

	Child2(int x) {
		this.y = x;
	}
}


class Exercise7_7 {
	public static void main(String[] args) {
		Child2 c = new Child2();

		System.out.println("x="+c.getX());
		System.out.println(c.y);
		System.out.println(c.x);
	}
}

// 호출 순서: Child() -> Child(int x) -> Parent() -> Parent(int x) -> Object()
// 실행결과 : x=200
