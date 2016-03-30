package com.proxy.www;
//这是一个游戏者接口。主要用于测试代理模式的
public interface IGameplayer {
	//登陆游戏
	public void login(String user,String password);
	//游戏类型
	public void killBoss();
	//升级
	public void  upgrade();
}
