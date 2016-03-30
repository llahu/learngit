package com.lulei.com;

//import com.interfasce.Qq;
//
//public class Test {
//
//	public static void main(String[] args) {
//		// 
////		Wq w=new Wq();
////		System.out.println(w);
////		new Qq();不能实例化抽象类
//	}
//
//}


//class TV{
//    public static void show(TV tv){
//        System.out.println("TV");
//    }
//}
//
//public class Test extends TV{
//    public static void main(String[] args) {
//        Test letv = new Test();
//        TV.show(letv);//这里是向上转型
//    }
//}


//public class Test{
//    private void show(){ //注意这里是private修饰
//        System.out.println("TV");
//    }
//    public static void main(String[] args) {
//        Test tv = new LeTV();
//        tv.show();
//    }
//}
//class LeTV extends Test{
//    public void show(){
//        System.out.println("LeTV");
//    }
//}


//class TV{
//    public int price = 10;
//    public int getprice(){
//        return price;
//    }
//    public static String getString(){
//        return "tv";
//    }
//}
//class LeTV extends TV{
//    public int price = 20;
//    public int getprice(){
//        return price;
//    }
//    public int getsuperprice(){
//        return super.price;
//    }
//    
//    public static String getString(){
//        return "letv";
//    }
//}  
//public class Test{
//    public static void main(String[] args) {
//    	TV tv = new LeTV();
//        System.out.println(tv.price+" getprice:"+tv.getprice()+tv.getString());
//        LeTV letv = new LeTV();
//        System.out.println(letv.price+" getprice:"+letv.getprice()+" getsuperprice:"+letv.getsuperprice()
//                +letv.getString());
//    }
//}









//class TV{
//    public  String getString(){
//        return "tv";
//    }
//
//    public TV change() {
//        // TODO Auto-generated method stub
//        return new TV();
//    }
//}
//class SanTV extends TV{
//    public  String getString(){
//        return "santv";
//    }
//}
//public class Test extends TV{
//    public String getString(){
//        return "letv";
//    }
//    public SanTV change(){
//        return new SanTV();
//    }
//    public static void main(String[] args) {
//        TV letv = new Test();
//        System.out.println(letv.getString());
//        TV newtv = letv.change();
//        System.out.println(newtv.getString());
//    }
//}



class Game{
    private static int count;
    private final int id  = count++;
    public String toString(){
        return "Game"+id;
    }
}

public class Test{
    public String name(){
        return getClass().getSimpleName();//拿到类名
    }
    
    Game show(Game input){
        return input;
    }
}

class LeComputer extends Test{
    Game show(Game input){
        return input;
    }
}
class MiComputer extends Test{
    Game show(Game input){
        return input;
    }
}