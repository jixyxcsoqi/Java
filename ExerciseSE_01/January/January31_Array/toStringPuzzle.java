public class toStringPuzzle{
	public static void main(String[] args){
		A a=new A();
		
		//所有类都是默认继承object类的，object类是java所有类的父类。
		//在java语言中不管是是new什么对象，最后老祖宗的Object类的无参数构造方法
		//一定会执行。（Object类的无参数构造方法是处于“栈顶部”）
		//这里B继承A，间接继承Object(A继承了)
		////print方法后面括号中如果是一个引用类型，会默认调用引用类型的toString方法.
		//public String toString() {
		//		return getClass().getName() + "@" + Integer.toHexString(hashCode());	
	    //	}
		System.out.println(a);//默认A@4b53f538  

	}
}
class A
{
	 
}
class B extends A
{
}