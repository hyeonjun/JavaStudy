package com.encore.java.error;

import java.io.IOException;

public class Test3 {
	public static void main(String[] args) {
		try {
			test();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void test() throws ClassNotFoundException, IOException{
		Class.forName("");
		System.in.read();
	}
}
