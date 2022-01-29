public class HashCodeText{
	public static void main(String[] args){
	
	String str=new String();
	int s=str.hashCode();//可以赋值给int
	System.out.println(str.hashCode());//0

	Object o=new Object();
	System.out.println(o.hashCode());//79815496


	A a=new A();
	System.out.println(a.hashCode());//1392838282

	}
}

class A
{
}