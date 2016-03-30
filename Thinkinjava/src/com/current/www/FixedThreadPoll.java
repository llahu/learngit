package com.current.www;
import java.util.concurrent.*;
public class FixedThreadPoll {
	public static void main(String[] args){
		//使用Executor来实现多线程
		//ExecutorService executor=Executors.newFixedThreadPool(5);//生成一个含有5个线程的线程池
		ExecutorService executor=Executors.newSingleThreadExecutor();
		for(int i=0;i<5;i++){
			executor.execute(new LiftOff());
		}
		executor.shutdown();
	}
}
