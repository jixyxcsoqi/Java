public class SuperTest04{
	public static void main(String[] args){
		Vip v = new Vip("张三");//--v一直指向这一整个地址，无论如何调用
		v.shopping();
		System.out.println(v.name);//张三
	}
}
class Customer{
	String name;
	public Customer(){}
	public Customer(String name){
		super();
		this.name = name;
	}
}
class Vip extends Customer{
	public Vip(){}
	public Vip(String name){
		super(name);//上面执行完毕这里就没啦(为的就是执行上面代码)
	}
	// super和this都不能出现在静态方法中。
	public void shopping(){
		// this表示当前对象。
		System.out.println(this.name + "正在购物!");
		// super表示的是当前对象的父类型特征。（super是this指向的那个对象中的一块空间。）
		System.out.println(super.name + "正在购物!");
		System.out.println(name + "正在购物!");//等于this.name
	}
}
