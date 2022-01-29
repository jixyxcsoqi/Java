public class GC_Outmoded{
	public static void main(String[] args){
	
	/*for(int i=1;i<10000000;i++){

	Gc c=new Gc();
		c=null;
	
	}*/
	for(int i=1;i<500;i++){

	Gc c=new Gc();
		c=null;
		System.gc();//建议GC启动
	
	}


	}
}
class Gc{

	protected void finalize()throws Throwable{

		System.out.println(this+"GC——start激活activate");
	
	}
}