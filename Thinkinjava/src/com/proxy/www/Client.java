package com.proxy.www;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//定义一个玩家
		IGameplayer player=new Gameplayer("张三");
		//开始打游戏啊
		System.out.println("开始时间：2001-1-1");
		player.login("zhs", "123456");
		//开始杀怪
		player.killBoss();
		player.upgrade();
		System.out.println("再也不玩了啊。");
		*/
		///改为代理模式后的代码
		//定义一个玩家
		IGameplayer player=new Gameplayer("张三");
		//开始打游戏啊
		System.out.println("开始时间：2012-1-1");
		//定义一个代练的
		GameplayerProxy playerProxy=new GameplayerProxy(player);
		playerProxy.killBoss();
		playerProxy.upgrade();
		System.out.println("再也不玩了啊。");
	}

}
