package com.tns.lambda_expression;

import java.io.File;
import java.io.FileFilter;
public class File_Filter_Lambda {

	public static void main(String[] args) {
		//lambda expression
		FileFilter obj=(File pathname)-> pathname.getName().endsWith(".pptx");
		File dir=new File("C:\\Users\\USER\\Downloads");
		File[] contents=dir.listFiles(obj);
		for(File i:contents)
		{
			System.out.println(i);
		}

	}

}