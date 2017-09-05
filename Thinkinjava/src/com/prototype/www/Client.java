package com.prototype.www;

import java.util.Random;

public class Client {
//这是场景类
	//发送账单的数量，这个值实际上是从数据库中获取的
	private static int MAX_COUNT=7;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//模拟发送邮件
		int i=0;
		//把模板给定义出来，这是从数据库中获得的
		Mail mail =new Mail(new AdvTemple());
		mail.setTail("xx银行版权所有");
		while(i<MAX_COUNT){
			//一下是每一封信的不同之处
			try {
				Mail cloneMail=mail.clone();
				cloneMail.setApplication(getRandomString(5)+"先生（女士）");
				cloneMail.setReceiver(getRandomString(5)+"@"+getRandomString(8)+".com");
				//然后就是发送邮件
				sendMail(cloneMail);
				i++;
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//进行对象的复制
			
		}
	}
	public static void sendMail(Mail mail) {
		// TODO Auto-generated method stub
		System.out.println("标题"+mail.getSubjcet()+"\t收件人："
				+mail.getReceiver()+"\t....发送成功");
	}
	//获取指定长度的随机字符串
	public static String getRandomString(int maxLength) {
		// TODO Auto-generated method stub
		String source="qwertyuioooopasdfghjklzxcvbnm";
		StringBuffer sb=new StringBuffer();//使用它是为了考虑到线程的同步，StirngBuilder是不同步的
		Random rand=new Random();//定义一个随机的对象
		for(int i=0;i<maxLength;i++){
			sb.append(source.charAt(rand.nextInt(source.length())));
		}
		return sb.toString();
	}

}
