package com.encore.java.io;

import java.io.*;

public class Test5 {
	public static void main(String[] args) {
		try {
		File dir = new File("C:\\work");
		
		System.out.println(dir.isDirectory());
		
		File dir2 = new File("C:\\work2");
		dir2.mkdir(); // 폴더 생성
		
		File file = new File(dir, "file1.txt");
		file.createNewFile(); // 새로운 파일 만듬
		
		System.out.println(file.isFile());
		System.out.println(file.exists());
		
		if (file.exists()) {
			PrintWriter out = new PrintWriter(file);
			out.println("hello java");
			out.close();
		}
		
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.canWrite());
		System.out.println(file.canRead());
		System.out.println("파일 크기 : "+file.length());

		File subDir = new File("C:\\work\\subDir");
		subDir.mkdir();
		File file2 = new File(subDir, "file2.txt");
		file2.createNewFile();
		
		System.out.println(file2.getAbsolutePath()); // 절대경로
		System.out.println(file2.getParent());
		
		System.out.println("=======================================");
		File parentDir = file.getParentFile();
		String[] fileNames = parentDir.list();
		for (String item : fileNames) {
			System.out.println(item);
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
