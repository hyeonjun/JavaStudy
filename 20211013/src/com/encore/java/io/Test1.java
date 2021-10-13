package com.encore.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test1 {
	public static void main(String[] args) {
		try {
			FileInputStream fi = new FileInputStream("a.txt"); // 상대 경로
			FileOutputStream fo = new FileOutputStream("b.txt");
			int c = 0;
			
			while ((c = fi.read()) != -1) {
				System.out.print((char)c);
				fo.write(c);
			}
			
			fi.close();
			fo.close();
			
		} catch (Exception e) {
			System.out.println(e);
		} 
		
		
		
	}
}
