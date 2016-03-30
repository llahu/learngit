package com.builder.www;

import java.util.*;

//车辆模型的抽象类
public abstract class CarModel {
	//这个参数是各个基本方法的执行的顺序
	private ArrayList<String> sequeuen=new ArrayList<String>();
	//模型是启动的，开始跑了。
	protected abstract void start();
	//可以停下来
	protected abstract void stop();
	//还可以按喇叭
	protected abstract void alarm();
	//还有引擎声
	protected abstract void engineBoom();
	//汽车是可以跑的哦
	final public void run(){
		//循环一遍，谁在前就执行谁
		for(int i=0;i<this.sequeuen.size();i++){
			String actionName=sequeuen.get(i);
			if(actionName.equals("start")){
				start();
			}else if(actionName.equals("stop")){
				stop();
			}else if(actionName.equals("alarm")){
				alarm();
			}else if(actionName.equals("engine boom")){
				engineBoom();
			}
		}
	}
	//设置属性值
	final public void setSequeuen(ArrayList<String> sequeuen){
		this.sequeuen=sequeuen;
	}
}	
