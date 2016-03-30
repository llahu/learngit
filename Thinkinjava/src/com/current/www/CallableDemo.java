package com.current.www;

import java.util.ArrayList;
import java.util.concurrent.*;

class TaskWithResult implements Callable<String>{
	private int id;
	public TaskWithResult(int id){
		this.id=id;
	}
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "result of TaskWithResullt"+id;
	}
	
}
public class CallableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//生成一个可缓冲的线程池
		ExecutorService exec=Executors.newCachedThreadPool();//
		ArrayList<Future<String>> results=new ArrayList<Future<String>>();
		for(int i=0;i<10;i++){
			results.add(exec.submit(new TaskWithResult(i)));//生产任务，并且提交任务
			
		}
		for(Future<String> fs:results){
			try{
				System.out.println(fs.get());
			}catch(InterruptedException e){
				System.out.println(e);
				return;
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				exec.shutdown();//关闭线程池的门，不接受新额任务
			}
		}
	}

}
