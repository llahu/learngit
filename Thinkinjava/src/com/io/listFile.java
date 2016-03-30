package com.io;

import java.io.*;

public class listFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 新建一个File类的实例
		File file=new File("d:"+File.separator+"Xiaomi");
		//2 进行文件目录的打印
		print(file);
	}

	public static void print(File file) {
		// TODO Auto-generated method stub
		if(file!=null){//判断文件不为空
			if(file.isDirectory()){//判断文件是不是目录
			   File[] fs=file.listFiles();//返回所有的子文件
			       if(fs!=null){
			    	   //开始遍历子文件
			    	   for (int i = 0; i < fs.length; i++) {
			    		   		print(fs[i]);
			    	   		}
			       }
			}else{//如果不是目录就打印文件的路径
				System.out.println(file);
			}
		}
	}

}
