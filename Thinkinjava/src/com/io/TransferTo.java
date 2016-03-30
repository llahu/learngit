package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TransferTo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileChannel in=new FileInputStream("date.txt").getChannel();//输入文件流的唯一通道
		//FileChannel out=new FileOutputStream("dateTransferTo.txt").getChannel();//输出文件流的唯一通道
		FileChannel out=new FileOutputStream("dateTransferFrom.txt").getChannel();//输出文件流的唯一通道
		
		//in.transferTo(0, in.size(), out);//表示将in通道的从指定位置上的指定长度的字节给复制到out对象中
		out.transferFrom(in, 0, in.size());//表示从指定的通道中读取指定位置上的指定长度的字节
	}

}
