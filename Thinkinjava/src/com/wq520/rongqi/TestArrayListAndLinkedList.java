package com.wq520.rongqi;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestArrayListAndLinkedList {
 public static void main(String[] args){

 ArrayList<Object> Alist = new ArrayList<Object>();
 Object obj = new Object();
 System.out.println("ArrayList的add方法耗时：（毫秒）");
 long start = System.currentTimeMillis();
 for(int i=0;i<5000000;i++){
	 Alist.add(obj);
 }
 long end = System.currentTimeMillis();
 System.out.println(end-start);
 

 LinkedList<Object> Llist = new LinkedList<Object>();
 Object obj1 = new Object();
 System.out.println("LinkedList的add方法耗时：（毫秒）");
 start = System.currentTimeMillis();
 for(int i=0;i<5000000;i++){
	 Llist.add(obj1);
 }
 end = System.currentTimeMillis();
 System.out.println(end-start);
 
 System.out.println("ArrayList的指定位置插入方法耗时：（毫秒）");
 start = System.currentTimeMillis();
 Object obj2 = new Object();
 for(int i=0;i<1000;i++){
	 Alist.add(0,obj2);
 }
 end = System.currentTimeMillis();
 System.out.println(end-start);
 
 System.out.println("LinkedList的指定位置插入方法耗时：（毫秒）");
 start = System.currentTimeMillis();
 Object obj3 = new Object();
 for(int i=0;i<1000;i++){
	 Llist.add(0,obj3);
 }
 end = System.currentTimeMillis();
 System.out.println(end-start);
 
 System.out.println("ArrayList的指定位置remove方法耗时：（毫秒）");
 start = System.currentTimeMillis();
 Alist.remove(0);
 end = System.currentTimeMillis();
 System.out.println(end-start);
 
 System.out.println("LinkedList的指定位置remove方法耗时：（毫秒）");
 start = System.currentTimeMillis();
 Llist.remove(0);
 end = System.currentTimeMillis();
 System.out.println(end-start);
 
 }
}