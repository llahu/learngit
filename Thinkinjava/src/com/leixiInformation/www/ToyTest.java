package com.leixiInformation.www;
//这是一个测试Class对象的方法类，测试的方法：forName() getName,getIntefaces,getSuperClass,newInstance等
interface HaseBatt{};
interface WaterProof{};
interface Shoots{};
class Toy{
	Toy(){}
	Toy(int i){}
}
class FancyToy extends Toy implements HaseBatt,
WaterProof,Shoots{
	FancyToy(int i){
		super(1);
	}
}
public class ToyTest  {
	static void printInfo(Class cc){
		System.out.println("Class name"+cc.getName()+"is inteface?"
				+"["+cc.isInterface()+"]");
		System.out.println("simple name"+cc.getSimpleName());
		System.out.println("canonical name"+cc.getCanonicalName());
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c=null;
		try{
			c=Class.forName("com.leixiInformation.www.FancyToy");//实现一个Class对象的引用
		}catch(Exception e){
			System.out.println(e);
			System.exit(1);
		}
		printInfo(c);//打印信息
		for(Class face:c.getInterfaces()){
			printInfo(face);//打印所有的接口Class引用对象
		}
		Class up=c.getSuperclass();//父类的Class引用对象
		Object obj=null;
		try{
			obj=up.newInstance();//实例化对象
		}catch(Exception e){
			System.out.println(e);
			System.exit(1);
		}
		printInfo(obj.getClass());//打印父类的Class引用对象
	}

}
