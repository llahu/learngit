package com.io;

import java.io.*;

public class FormatMemeryInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataInputStream di=new DataInputStream(new ByteArrayInputStream(
				BufferedFileTest.read("src\\com\\io\\DirList2.java").getBytes()));
		while(true)
			System.out.print((char)di.readByte());
	}

}
