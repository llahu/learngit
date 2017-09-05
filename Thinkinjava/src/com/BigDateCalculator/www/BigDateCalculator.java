package com.BigDateCalculator.www;
/*
 * 主要完成大数的加减乘除的运算功能
 * */
public class BigDateCalculator {

		private static String result;//用于存储最后运算结果的
		
		//加法，从低位加起，逢十进一
		public static String add(String firstNum, String secondNum){
			result = "";
			//首先选出位数较大的，来确定结果能到达的最大的位数
			int maxLength = firstNum.length() >= secondNum.length() ? firstNum.length() : secondNum.length();
			//确定最低位元素的索引号。注意由于是数据是使用String来表示的，
			//所以最低位是String的最后一位。
			int index = maxLength - 1;
			int carry = 0;//表示是否进位1
			//如果任意一个操作数的位数a小于最大的操作数的位数，则给a的高位来补充0。
			//使a操作数的位数和最大的操作数的位数一样
			while(firstNum.length() < maxLength){
				firstNum = "0" + firstNum;//进行高位补0操作
			}
			
			while(secondNum.length() < maxLength){
				secondNum = "0" + secondNum;//进行高位补0操作
			}
			
			while(index >= 0){
				//然后让各个操作数依次的从最后一位开始来取出当前位的数字，来进行运算
				int firstInt = Integer.valueOf(firstNum.substring(index, index + 1));
				int secondInt = Integer.valueOf(secondNum.substring(index, index + 1));
				result += (firstInt + secondInt + carry) % 10;//开始从低位计算，使用result来保存当前位的结果
				carry = (firstInt + secondInt + carry) / 10;//计算当前位是否有进位
				index--;//进行移位的操作，移向高位
			}
			
			if(carry != 0){
				result+=carry;
				///这是最后一次进位的计算，需要获取
			}
			//由于计算的结果的字符串是从低位依次到高位的，即最后字符串的最后一位是大数的高位
			//所以需要将结果进行反转的
			return revert(result);
			
		}
		
		//减法，分三种情况：1.两者相等，返回0，2：大数减小数，小数补0，逐位减，借位；3：小数减大数，转化为2的步骤，并且要记得最后加-号
		public static String minus(String firstNum, String secondNum){
			result = "";
			String sign = "";//用于记录是否需要添加负号的
			//如果两者相等，就输入结果为0
			if(firstNum.equals(secondNum)){
				return "0";
			}
			//小数-大数,交换firstNum与secondNum,并符号置为-
			if(firstNum.length() < secondNum.length() 
					|| (firstNum.length() == secondNum.length() && firstNum.compareTo(secondNum) < 0)){
				sign = "-";
				String tmp = firstNum;
				firstNum = secondNum;
				secondNum = tmp;
			}
			//若小数（secondNum）不足位，高位补0
			while(secondNum.length() < firstNum.length()){
				secondNum = "0" + secondNum;
			}
			//大数从低位开始，逐位减小数
			int index = firstNum.length()-1;//获取大数的最后一位数的索引号
			int borrow = 0;	//记录借位
			while(index >= 0){
				int firstInt = Integer.valueOf(firstNum.substring(index, index + 1));
				int secondInt = Integer.valueOf(secondNum.substring(index, index + 1));
				int left = firstInt - secondInt + borrow;//记得要减去借位值
				borrow=0;//注意啊，每一次处理完借位值后，要记得将借位值设为0
				//int gg=left;
				if(left < 0){//差值是小于0的表示是低位需要向高位进行借位的。
					borrow = -1;
					left += 10;//重新计算差值
				}
				//System.out.println(firstNum);
				//System.out.println(secondNum);
				//System.out.println(gg+":"+left);
				result = left+result;//当前位的计算结果存储在result中
				//System.out.println(result);
				index--;//移位，进行下一位的计算
			}
			//去除多余的前导0
			while(result.indexOf("0") == 0){
			   result = result.substring(1);
			}
			return sign + result;
		}
		
		//反转字符串，以获得正确的运算结果
		public static String revert(String string){
			char[] charArray = new char[string.length()];
			for(int i = 0; i < string.length(); i++){
				charArray[i] = string.charAt(string.length() - 1 - i);
			}
			return new String(charArray);
		}
		
		public static void main(String[] args){
			System.out.println(BigDateCalculator.add("4561427489456123456745646746745679783453453453", "798754564534690554645754676576544567343"));
			System.out.println(BigDateCalculator.minus("534543544343434335", "543543543543"));
		}


}
