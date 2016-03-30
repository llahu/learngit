package com.proxyAOP.www;
//这是一个游戏代练者，负责为游戏玩家代练。用于模拟代理模式
public class GameplayerProxy implements IGameplayer {
	private IGameplayer player=null;
	//通过构造函数来确定为谁代理
	public GameplayerProxy(IGameplayer player) {
		this.player = player;
	}

	@Override
	public void login(String user, String password) {
		// TODO Auto-generated method stub
		this.player.login(user, password);
	}


	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		this.player.killBoss();
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		this.player.upgrade();
	}

}
