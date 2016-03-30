package com.prototype.www;
//这是一个广告信的模板代码。这段代码是用来演示原型模式的
public class AdvTemple {
	//广告信的名称
	private String advSubject="xx银行国庆信用卡抽奖活动";
	//广告信内容
	private String advContext="国庆抽奖活动通知，只要刷卡就送你一百万";
	//取得广告信的名称
	public String getAdvsubject(){
		return this.advSubject;
	}
	//取得广告信的内容
	public String getAdvContext(){
		return this.advContext;
	}
}
