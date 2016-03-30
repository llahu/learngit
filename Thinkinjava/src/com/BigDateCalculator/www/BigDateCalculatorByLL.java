package com.BigDateCalculator.www;
/*
 * 主要完成大数的加减乘除的运算功能
 * */
public class BigDateCalculatorByLL {

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
			char[] first=firstNum.toCharArray();//注意，这里是使用char数组来完成操作的
			char[] second=secondNum.toCharArray();
			while(index >= 0){
				//然后让各个操作数依次的从最后一位开始来取出当前位的数字，来进行运算
				int firstInt = Integer.parseInt(""+first[index]);
				int secondInt = Integer.parseInt(""+second[index]);
				result = ((firstInt + secondInt + carry) % 10)+result;//开始从低位计算，使用result来保存当前位的结果
				carry = (firstInt + secondInt + carry) / 10;//计算当前位是否有进位
				index--;//进行移位的操作，移向高位
			}
			
			if(carry != 0){
				result=carry+result;///这是最后一次进位的计算，需要获取
			}
			//由于计算的结果的字符串是从低位依次到高位的，即最后字符串的最后一位是大数的高位
			//所以需要将结果进行反转的
			return result;
			
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
			char[] first=firstNum.toCharArray();
			char[] second=secondNum.toCharArray();
			while(index >= 0){
				int firstInt = Integer.valueOf(""+first[index]);
				int secondInt = Integer.valueOf(""+second[index]);
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
		/*大数乘法的运算*/
		//这里是转换元素
		public static String doMul(String firstNum,String secondNum) {
			  int i = 0,j = 0;
			  if(firstNum.charAt(0) == '-') {
				  firstNum = firstNum.substring(1);//去掉大整数前面的负号
			    	    i++;
			      }
			    
			  if(secondNum.charAt(0) == '-') {
				  secondNum = secondNum.substring(1);//去掉大整数前面的负号
			    	    j++;
			    }
			     char[] char1 = firstNum.toCharArray();   
			     char[] char2 = secondNum.toCharArray();
			     
			     int[] result = doMul(char1,char2);//进行乘法的具体计算
			     String lastresult = "";
			     
			     if(i+j == 1) {//判断两个大数之间是否存在一个为负数
			    	 //如果存在
			    	 lastresult = "-";
			     	 for(int k = 0; k < char1.length + char2.length-1; k++)  {
			     	    	lastresult += result[k];
			     	 }
			     }
			     	else{
			     	 for(int k = 0; k<char1.length+char2.length-1; k++)  {
			     	    	lastresult += result[k];
			     	 }
			     }
			     return lastresult;
		}
		/*
		高精度乘法函数
		*/
		public static int[] doMul(char[] char1 , char[] char2) {
			    
				//首先定义两个长度和大数一样的int型数组
			    int[] a = new int[char1.length];
			    int[] b = new int[char2.length];
			    //乘法的结果的长度是乘数和被乘数的长度之和减一
			    int[] result = new int[char1.length + char2.length-1];
			    //将以二维矩阵的形式依次存储每一步的值，这里char1是乘数，char2是被乘数
			    int[][] c = new int[char1.length][char2.length];
			    String jieguo = "";//最终结果的字符串形式
			    
			    for(int i = 0; i<char1.length ; i++) {
			    	    a[i] = Integer.parseInt(char1[i] + "");//依次将大数按位存放在int数组中
			    }
			    for(int i = 0; i<char2.length ; i++) {
			    	    b[i] = Integer.parseInt(char2[i] + "");
			    }
			    
			    for(int i = 0; i<char1.length ; i++) {
			    	    for(int j = 0; j<char2.length; j++) {
			    	    	   c[i][j] = a[i] * b[j];//将大整数一位一位的相乘
			    	    }
			    }//最后二维数组中存储的就是大数中依次按位相乘的结果
			    
			    int k = 0;//
			    while(k < char1.length+char2.length-1) {
			    	    for(int i = 0; i<char1.length; i++) {
			    	    	    for(int j = 0; j<char2.length; j++) {
			    	    	    	    if(i+j == k) {//依次将对应位上的所有的数值相加，结果存储在当前位上。因此值可能会出现进位值的
			    	    	    	    	    result[k] += c[i][j];
			    	    	    	    }
			    	    	    }
			    	    }
			    	    k++;
			    }
			    
			    for(int i = char1.length+char2.length-1-1; i>0 ;i--) {
			    	    if(result[i] > 9){//最后来依次处理每一位中出现进位的情况
			    	    	//出现进位当前的位的值就是除以10的余数，完成除操作的结果即为进位值    
			    	    	result[i-1] += result[i] / 10;//注意越往前，位数是越高的
			    	    	    result[i] = result[i] % 10;
			    	    }
			    }
			    return result;
		}
		public static void main(String[] args){
			System.out.println(BigDateCalculatorByLL.add("4561427489456123456745646746745679783453453453", "798754564534690554645754676576544567343"));
			System.out.println(BigDateCalculatorByLL.minus("534543544343434335", "543543543543"));
			System.out.println(BigDateCalculatorByLL.doMul("1231233338656786797595556565857354543433333", "6576456575666666755556564343555755555555554564"));
		}


}
