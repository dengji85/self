package comdengji85.demo;

import java.util.ArrayList;
import java.util.WeakHashMap;

public class Null {
	
	static void haha() {
		System.out.println("haha");
	}
	 void haha2() {
		System.out.println("haha2");
	}
	public static void main(String[] args) {
		((Null)null).haha();
	//	((Null)null).haha2();
		double d = 0.3424;
	ArrayList<String> list = new ArrayList<>();
	list.getClass();
	b app = new b();
	System.out.println(app.get());
	int a =9;
	int b = a>0 ? 1:2;
	System.out.println(b);
	}
	
	
}
class a{
	private String aa ="1 aa";;
	String get(){
		return aa;
	}
}
class b extends a{
	private String aa ="2 aa";
	String get(){
		return aa;
	}
}
