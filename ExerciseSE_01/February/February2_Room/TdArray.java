public class TdArray{
	public static void main(String[] args){
	int[][] arr={
		{6},
		{66,666},
		{6666,66666,666666},
		{8},
		{88,888},
		{8888,88888,888888},
		{9},
		{99,999},
		{9999,99999,999999}
		};
	/*for(int i=0;i<arr.length;i++){
		int[] a=arr[i];
		for(int t=0;t<a.length;t++){
			System.out.println("         "+a[t]);
	
		}
	}*/

	//合并
	for(int i=0;i<arr.length;i++){
	
	for(int t=0;t<arr[i].length;t++){
		System.out.println("第"+i+"行"+"第"+t+"个元素"+"  "+arr[i][t]);

		}
	
	}

}
}