public class SuperTest04{
	public static void main(String[] args){
		Vip v = new Vip("����");//--vһֱָ����һ������ַ��������ε���
		v.shopping();
		System.out.println(v.name);//����
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
		super(name);//����ִ����������û��(Ϊ�ľ���ִ���������)
	}
	// super��this�����ܳ����ھ�̬�����С�
	public void shopping(){
		// this��ʾ��ǰ����
		System.out.println(this.name + "���ڹ���!");
		// super��ʾ���ǵ�ǰ����ĸ�������������super��thisָ����Ǹ������е�һ��ռ䡣��
		System.out.println(super.name + "���ڹ���!");
		System.out.println(name + "���ڹ���!");//����this.name
	}
}
