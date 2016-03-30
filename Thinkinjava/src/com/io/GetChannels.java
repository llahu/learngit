package com.io;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
/*注意该方法只能测试英文字符。如果测试中文就会出现乱码*/
public class GetChannels {
	private static final int BSIZE=1024;//用于后面设置字节缓冲区的大小
	public static void main(String[] args) throws  Exception{
		// TODO Auto-generated method stub
		//写一个文件
		FileChannel fc=new FileOutputStream("date.txt").getChannel();//获取与此文件输出流相关的唯一通道
		fc.write(ByteBuffer.wrap("my dear,".getBytes()));//注意是先获取字符串的字节数组，然后在将字节数组包装到缓冲区中
		fc.close();//关闭通道
		
		//尝试在文件中添加内容
		fc=new RandomAccessFile("date.txt", "rw").getChannel();//重新获取文件的任意操作流的唯一通道
		fc.position(fc.size());//将文件指针指向最末尾,这样可以防止之前的字符被新的字符给覆盖
		fc.write(ByteBuffer.wrap("my family".getBytes()));
		fc.close();
		
		//读取文件
		fc=new FileInputStream("date.txt").getChannel();
		ByteBuffer buff=ByteBuffer.allocate(BSIZE);//分配一个新的字节缓冲区，大小为1k
		fc.read(buff);//将文件内容读取到字节缓冲区buff中
		buff.flip();//为读取字节缓冲区做准备
		while(buff.hasRemaining())//字节缓冲区是否还有字节元素
			System.out.print((char)buff.get());//获取字节，并转化为字符
		
		
	}

}
