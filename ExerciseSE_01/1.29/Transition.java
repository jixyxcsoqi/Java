public class Transition{

	public static void main(String[] args){
	A a=new Dog();
	if(a instanceof Dog){
			Dog b=(Dog)a;
		System.out.println(b.b+"ת����");
			}
		else System.out.println("δת��");
	
	
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
		System.out.println("�������ƶ�������");
	}
	}
	
class Dog extends A{
		String b="����";
	public Dog(){}
	public Dog(String b){
		this.b=b;}
		
		public void move(){
		System.out.println("Dog���ܲ�");
	}
		
}