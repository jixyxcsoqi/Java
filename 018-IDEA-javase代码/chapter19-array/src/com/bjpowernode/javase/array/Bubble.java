public class Bubble{
	public static void main(String[] args){
	int[] arr={2,5,3,1,4,6,7};
	
	for(int j=arr.length-1;j>0;j--){
		for(int i=0;i<j;i++){//0-5共交换6次，第一轮比较6次
		if(arr[i]>arr[i+1]){
		int temp;
		temp=arr[i];
		arr[i]=arr[i+1];//i+1就可以取到第6个元素了7
		arr[i+1]=temp;
			}

		
		}
	}for(int a=0;a<arr.length;a++){
		System.out.print(arr[a]);}
}
}