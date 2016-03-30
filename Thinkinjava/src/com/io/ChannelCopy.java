package com.io;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelCopy {
	private static final int BSIZE=1024;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileChannel in=new FileInputStream("date.txt").getChannel();//输入文件流的唯一通道
		FileChannel out=new FileOutputStream("dateCopyOf.txt").getChannel();//输出文件流的唯一通道
		ByteBuffer buffer=ByteBuffer.allocate(BSIZE);//定义一个指定大小的字节缓冲区
		
		
//其实这个方法并不是最后的操作，我们可以使用transferTo和transferFrom方法来将两个通道直接的相连		
		while(in.read(buffer)!=-1){//将字节序列从给定的通道中读到字节缓冲区中
			buffer.flip();//准备执行写操作
			out.write(buffer);
			buffer.clear();//准备执行读操作
		}
	}

}
