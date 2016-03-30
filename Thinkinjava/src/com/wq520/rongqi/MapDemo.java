package com.wq520.rongqi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 测试Map的一些基本的方法
 * 
 * @author LULEI
 *
 */
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hm=new HashMap<Integer,String>();//实例化对象
		
		testMapDemo1(hm);//这个方法实现了一些基本方法
		
		
		System.out.println();
		System.out.println();
		testMapDemo2(hm);	//这个方法实现Map集合中如何取出所有的元素
							//1、要使用到keySet()方法来获取key值得Set集合
							//2、依次的迭代Set集合中的key值，最后通过get(key)来获取键值对
		
	}

	public static void testMapDemo2(Map<Integer, String> hm) {
		// TODO Auto-generated method stub
		String str2=hm.put(2, "lisi");
		//System.out.println("此时给相同的key赋键值,返回的上一个键值是："+str2);//此时lisi				
		//会覆盖wangcai的，同时put方法会返回之前的键值对
		hm.put(8, "wq");
		hm.put(7, "ll");
		hm.put(6, "pp");
		
		Set<Integer> s=hm.keySet();//获取key的Set集合
		//使用迭代器来迭代集合
		for(Iterator<Integer> it=s.iterator(); it.hasNext();){
			Integer i=it.next();
			System.out.println("使用迭代获取的元素："+hm.get(i)  );
		}
		
	}

	public static void testMapDemo1(Map<Integer, String> hm) {
		//添加
		String str1=hm.put(2, "wangcai");
		System.out.println("此时给相同的key赋键值,返回的上一个值是："+str1);//此时由于key对应的value没有值										//刚刚被赋值，所以之前是没有键值对的
		String str2=hm.put(2, "lisi");
		System.out.println("此时给相同的key赋键值,返回的上一个值是："+str2);//此时lisi									//会覆盖wangcai的，同时put方法会返回之前的键值对
		hm.put(7, "ll");
		hm.put(8, "wq");
		hm.put(6, "pp");
		System.out.println("所有的键值对如下："+hm);
		//获取
		System.out.println("获取相应的key值得键值："+hm.get(7));
		System.out.println("获取相应的key值得键值："+hm.get(4));
		//删除
		hm.remove(6);//删除key为6的键值
		System.out.println("删除key为6的键值后的map"+hm);
	}

}
