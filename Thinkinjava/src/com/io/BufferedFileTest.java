package com.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileTest {

	@SuppressWarnings("finally")
	public static String read(String name) throws IOException{
		//生成输入文件缓冲流对象
		BufferedReader br=new BufferedReader(new FileReader(name));
		StringBuilder sb=new StringBuilder();
		String str;
		try {
			
			while((str=br.readLine())!=null){
				sb.append(str+"\n");
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			return sb.toString();
		}
		
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(read("JAVA刷题笔记.txt"));
	}

}
