package typeinfo;

public class B extends A {
	public void run(int i){
		System.out.println("asdsd");
	}
//	public void run(){
//		System.out.println("B is running");
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.run();
		b.run(1);
	}

}
