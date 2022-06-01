public class Array04Test{
	public static void main(String[] args){
	String[] str={"str1","str1","str3"};
	String[] temp=new String[10];
	System.arraycopy(str,0,temp,0,str.length);

	for(int i=0;i<temp.length;i++){
		System.out.println(temp[i]);
	}
	}
}