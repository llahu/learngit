package typeinfo;

public class DotThis {
	  void f() { System.out.println("DotThis.f()"); }
	  public class Inner {
	    public DotThis outer() {
	      return DotThis.this;
	      // A plain "this" would be Inner's "this"
	    }
	    public  Inner print(){
	    	return Inner.this;
	    }
	  }
	  public Inner inner() { return new Inner(); }
	  public static void main(String[] args) {
	    DotThis dt = new DotThis();
	    DotThis dt1;
	    
	    DotThis.Inner dti = dt.inner();
	    dti.outer().f();//outer()会返回一个外部类的对象
	    dt1=dti.outer();
	    System.out.println(dt1);
	    Inner inner=dt1.new Inner().print();
	    System.out.println(inner);
	}
} /* Output:
	DotThis.f()
	*///:~