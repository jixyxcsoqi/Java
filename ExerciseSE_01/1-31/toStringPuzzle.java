public class toStringPuzzle{
	public static void main(String[] args){
		A a=new A();
		
		//�����඼��Ĭ�ϼ̳�object��ģ�object����java������ĸ��ࡣ
		//��java�����в�������newʲô������������ڵ�Object����޲������췽��
		//һ����ִ�С���Object����޲������췽���Ǵ��ڡ�ջ��������
		//����B�̳�A����Ӽ̳�Object(A�̳���)
		////print�������������������һ���������ͣ���Ĭ�ϵ����������͵�toString����.
		//public String toString() {
		//		return getClass().getName() + "@" + Integer.toHexString(hashCode());	
	    //	}
		System.out.println(a);//Ĭ��A@4b53f538  

	}
}
class A
{
	 
}
class B extends A
{
}