package com.wq520.rongqi;

import java.util.HashMap;
import java.util.*;

public class MapDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		Random rand=new Random(41);
		for(int i=0;i<300;i++){
			int key=rand.nextInt(3);
			Integer value=map.get(key);//获取value对象的值
			map.put(key, value==null?1:value+1);
		}
		System.out.println(map);
	}

}
