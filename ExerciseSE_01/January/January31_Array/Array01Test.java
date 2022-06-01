public class Array01Test{
	public static void main(String[]args){

		int[] a={6,66,666};
		printArray(a);
		System.out.println("__________________________________");
		int[] array=new int[2];//动态初始化一维数组
		printArray(array);
		System.out.println("__________________________________");
		//printArray({8,88,888})不能直接这样传，记住如下格式[]里也不能加东西
		printArray(new int[]{8,88,888});
		System.out.println("__________________________________");
		int[] arrayTwo=new int[]{9,99,999};//上面equal to这行
		printArray(arrayTwo);
		System.out.println("__________________________________");
		int[] B=new int[]{};
		int[] b={};//JVM出传过来就相当于这样，String[] strs={};  0
		printArray(B);
		System.out.println("__________________________________");
		printArray(b);//equals b 都没用元素，所以不打印任何东西
		System.out.println("__________________________________");
	}
	public static void printArray(int[]array){
	for(int i=0;i<array.length;i++){
	System.out.println(array[i]);}
	System.out.println(array.length);}

	
	}

	