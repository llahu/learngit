package com.prototype.www;
//这是邮件类的代码
public class Mail implements Cloneable{
	//收件人
	private String receiver;
	//邮件的名称
	private String subjcet;
	@Override//重写Clonable的Clone方法
	protected Mail clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Mail mail=null;
		try {
			mail=(Mail)super.clone();//进行对象的复制
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return mail;
	}
	//称谓
	private String application;
	//邮件的内容
	private String context;
	//邮件的尾部，一般是加上 XXXX版权所有之类的
	private String tail;
	//构造函数
	public Mail(AdvTemple advtemple){
		this.context=advtemple.getAdvContext();
		this.subjcet=advtemple.getAdvsubject();
	}
	
	//以下均是get和set方法
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getSubjcet() {
		return subjcet;
	}
	public void setSubjcet(String subjcet) {
		this.subjcet = subjcet;
	}
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getTail() {
		return tail;
	}
	public void setTail(String tail) {
		this.tail = tail;
	}
	
	
	
	
	
}
