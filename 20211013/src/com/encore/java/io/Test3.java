package com.encore.java.io;

import java.io.*;

public class Test3 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("이름을 입력하세요:");
			String name = br.readLine();
			System.out.println("Hello "+ name);
			
			
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				} 
		}
	}
}
