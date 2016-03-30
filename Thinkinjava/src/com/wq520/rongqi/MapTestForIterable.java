package com.wq520.rongqi;

import java.util.Map;

public class MapTestForIterable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Map.Entry<String, String> entry:System.getenv().entrySet()){
			System.out.println(entry.getKey()+":::"+entry.getValue());
		}
	}

}
