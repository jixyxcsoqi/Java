public class Transform{
	public static void main(String[] args){
	A a=new A(123,345,456);
	
	System.out.println(a.a);
	System.out.println(a.b);
	System.out.println(a.c);

	A t=new A(666,666,666);
	String s=t.toString();
	System.out.println(s);
	}
}

class A{

	int a;
	int b;
	int c;
	public A(){}
	public  A(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public String toString(){

		final java.lang.String string = "a\ufffd\ufffd\u05b5" + this.a;
		return string;
 		}


}