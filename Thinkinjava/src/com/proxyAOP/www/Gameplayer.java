package com.proxyAOP.www;
//这是实现IGameplayer接口的类
public class Gameplayer implements IGameplayer {
	private String name="";
	//通过构造函数传递名称
	public Gameplayer(String name){
		this.name=name;
	}
	@Override
	public void login(String user, String password) {
		// TODO Auto-generated method stub
		System.out.println("登陆名为："+user+"的用户"+this.name+"登陆成功！");
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"在打怪");
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"又升了一级");
	}

}
