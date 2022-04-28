package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadExcel {
	
	
	
	public static void main(String[] args) throws FileNotFoundException{
		File f =new File("C:\\Users\\Chan is Karma\\eclipse-workspace\\MavenFirst\\TestData\\test.xlsx");
		
		FileInputStream stream = new FileInputStream(f);
		
		
	}

}
