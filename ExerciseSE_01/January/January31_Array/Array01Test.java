public class Array01Test{
	public static void main(String[]args){

		int[] a={6,66,666};
		printArray(a);
		System.out.println("__________________________________");
		int[] array=new int[2];//��̬��ʼ��һά����
		printArray(array);
		System.out.println("__________________________________");
		//printArray({8,88,888})����ֱ������������ס���¸�ʽ[]��Ҳ���ܼӶ���
		printArray(new int[]{8,88,888});
		System.out.println("__________________________________");
		int[] arrayTwo=new int[]{9,99,999};//����equal to����
		printArray(arrayTwo);
		System.out.println("__________________________________");
		int[] B=new int[]{};
		int[] b={};//JVM�����������൱��������String[] strs={};  0
		printArray(B);
		System.out.println("__________________________________");
		printArray(b);//equals b ��û��Ԫ�أ����Բ���ӡ�κζ���
		System.out.println("__________________________________");
	}
	public static void printArray(int[]array){
	for(int i=0;i<array.length;i++){
	System.out.println(array[i]);}
	System.out.println(array.length);}

	
	}

	