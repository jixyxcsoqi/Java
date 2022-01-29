public class Transition{

	public static void main(String[] args){
	A a=new Dog();
	if(a instanceof Dog){
			Dog b=(Dog)a;
		System.out.println(b.b+"转型了");
			}
		else System.out.println("未转型");
	
	
	A d=new Dog();
	d.move();
	}
}

class A{
	int a;
	public A(){}
	public A(int a){
	 this.a=a;}	

	 public void move(){
		System.out.println("动物在移动！！！");
	}
	}
	
class Dog extends A{
		String b="狗狗";
	public Dog(){}
	public Dog(String b){
		this.b=b;}
		
		public void move(){
		System.out.println("Dog在跑步");
	}
		
}