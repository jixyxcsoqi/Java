public class StringNew{
	public static void main(String[] args){
	/*public String toString(){
	return this;//String有这个重写方法
	}*/
	String str=new String("我重写啦toString");
	
	System.out.println(str);
	System.out.println(str.toString());//不写自动也是加上toString()
	}
}