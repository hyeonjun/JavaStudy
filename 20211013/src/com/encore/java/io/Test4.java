package com.encore.java.io;

import java.io.*;

public class Test4 {
	public static void main(String[] args) {
		BufferedInputStream in = null;
		ByteArrayOutputStream out = null;
		try {
			in = new BufferedInputStream(new FileInputStream("a.txt"));
			out = new ByteArrayOutputStream();
			
			byte[] buf = new byte[1024];
			int len = 0;
			while((len = in.read(buf)) != -1) {
				out.write(buf, 0, len);
			}
			
			byte[] arr = out.toByteArray();
			String s = new String(arr);
			System.out.println(s);
			
			in.close();
			out.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
}
