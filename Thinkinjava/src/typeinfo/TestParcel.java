package typeinfo;

interface Contents{
	int value();
}
interface Destination{
	
	String readLabel();
}
class Parcel4 {
  private class PContents implements Contents {
    private int i = 11;
    public int value() { return i; }
  }
  protected class PDestination implements Destination {
    private String label;
    private PDestination(String whereTo) {
      label = whereTo;
    }
    public String readLabel() { return label; }
  }
  public Destination destination(String s) {
    return new PDestination(s);
  }
  public Contents contents() {
    return new PContents();
  }
}

public class TestParcel {
  public static void main(String[] args) {
    Parcel4 p = new Parcel4();
    Contents c = p.contents();
    Destination d = p.destination("Tasmania");
    // Illegal -- can't access private class:
    //Multiple markers at this line
	/*- The type Parcel4.PContents is not 
	 visible
	- The type Parcel4.PContents is not 
	 visible*/
   // Parcel4.PContents pc = p.new PContents();
  // Contents c1=p.new PContents();//这种写法也是会报错的，只能使用方法返回内部类对象引用的方法。
  }
} ///:~