package com.encore.java.io;

import java.io.*;
import java.util.Properties;

public class Test6 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("user.properties");
			Properties user = new Properties();
			
			user.load(fr); // 읽음
			System.out.println(user); // {name=Amy, password=1004, id=guest}
			System.out.println(user.getProperty("id")); // key값
			System.out.println(user.getProperty("password"));
			System.out.println(user.getProperty("name"));
			
			// 쓰기
			FileWriter fw = new FileWriter("car.properties");
			Properties car = new Properties();
			car.setProperty("model", "X5");
			car.setProperty("engine", "2000");
			car.setProperty("fuel", "3.3");
			
			car.store(fw, "car infomation");
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
