package com.encore.java.io;

import java.io.*;

public class Test2 {
	public static void main(String[] args) {
		try {
			InputStream keyboard = System.in;
			PrintStream consol = System.out;
			int c = 0;
			while((c = keyboard.read()) != -1) {
				consol.write(c);
			}
			
			keyboard.close();
			consol.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
