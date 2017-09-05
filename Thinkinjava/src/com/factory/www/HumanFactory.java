package com.factory.www;

public class HumanFactory extends AbstractHumanFactory {

	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		// TODO Auto-generated method stub
		//定义一个生产的人种
		Human human=null;
		try{
			//生产人种
			human=(T) Class.forName(c.getName()).newInstance();
		}catch(Exception e){
			System.out.println("人种生成有错。");
		}
		return (T)human;
	}

}
