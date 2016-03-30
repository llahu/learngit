package com.io;

import java.util.regex.*;
import java.io.*;
import java.util.*;

public class DirList2 {
  public static FilenameFilter filter(final String regex) {
    // Creation of anonymous inner class:
    return new FilenameFilter() {
    //  private Pattern pattern = Pattern.compile(regex);
      public boolean accept(File dir, String name) {
       // return pattern.matcher(name).matches();
    	  return Pattern.matches(regex, name);
      }
    }; // End of anonymous inner class
  }
  public static void main(String[] args) {
    File path = new File("D:/");//获取文件对象
    System.out.println(path);//打印当前的文件名
    String[] list;
    if(args.length == 0)
      list = path.list();
    else
      list = path.list(filter(args[0]));
    Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);//进行字符串的排序
    for(String dirItem : list)
      System.out.println(dirItem);
  }
}