package com.encore;

import java.io.File;

import jxl.*;
import jxl.write.*;

public class ExcelMaker {
	public ExcelMaker() {
		File filename =  new File("C://excel_test//test.csv");
		// => File 객체는 외부 자원을 수정하는 객체가 아니기 때문에 예외처리가 필요없음
		
		try {
			WritableWorkbook wb = Workbook.createWorkbook(filename);
			WritableSheet sheet = wb.createSheet("Test", 0);
			
			Label label = new Label(1, 1, "test");
			sheet.addCell(label);
			wb.write();
			wb.close();
			
			
		}catch(Exception e) {
			System.out.println("ExelMaker ======> "+e.getMessage());
		}
		
		File f = new File("C://excel_test//test.csv");
		try {
			Workbook wb = Workbook.getWorkbook(f);
			Sheet s = wb.getSheet(0);
			Cell c = s.getCell(1, 1);
			
			System.out.println(c.getContents());
			wb.close();
		}catch(Exception e) {
			System.out.println("ExelMaker ======> "+e.getMessage());
		}
	}
}
