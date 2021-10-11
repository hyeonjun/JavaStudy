package com.encore.java.api;

public class Test1 {
	public static void main(String[] args) throws ClassNotFoundException {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		
		
		Class c = obj1.getClass();
		System.out.println(c.getName());
		
		Book b = new Book();
		Class b_info = b.getClass();
		System.out.println(b_info.getName());
		
		Class b_info2 = Book.class;
		System.out.println(b_info2.getName());
		
		System.out.println(obj1);
		
		
		Class d = Class.forName("java.lang.String");
	}
}

class Book{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book";
	}
}
