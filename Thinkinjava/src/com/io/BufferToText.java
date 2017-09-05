package com.io;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class BufferToText {
	private static final int BSIZE=1024;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//写入file中
		FileChannel fc=new FileOutputStream("date2.txt").getChannel();
		fc.write(ByteBuffer.wrap("my love我的爱".getBytes()));//将字符转换为字节数组，在放入字节缓冲器中。最后写入到通道中
		fc.close();
		fc=new FileInputStream("date2.txt").getChannel();
		ByteBuffer buffer=ByteBuffer.allocate(BSIZE);//定义一个指定大小的字节缓冲区
		fc.read(buffer);
		buffer.flip();
		//打印读取到的字节
		//System.out.print(buffer.asCharBuffer());//这种方法没什么用，会出现乱码。
		
		//我们需要系统的指定默认的字符集
		buffer.rewind();
		String encoding =System.getProperty("file.encoding");//获取文件的字节码
		System.out.println("Decoding using:"+encoding+":"+Charset.forName(encoding).decode(buffer));
		
		//或者我们也可以使用编码来向文件中写入字符
		fc=new FileOutputStream("date3.txt").getChannel();
		fc.write(ByteBuffer.wrap("我是一份大菠菜。".getBytes("UTF-16BE")));
		fc.close();
		
		//接下来我们进行读文件
		fc=new FileInputStream("date3.txt").getChannel();
		buffer.clear();
		fc.read(buffer);
		buffer.flip();
		System.out.print(buffer.asCharBuffer());
	}

}
		