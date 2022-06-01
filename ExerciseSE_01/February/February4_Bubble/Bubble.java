public class Bubble
{
	public static void main(String[] args){
	int[] arr={8,5,3,2,7,1,4,6};
	int compare=0;
	for(int j=arr.length-1;j>0;j--){
		
		
		for(int i=0;i<j;i++){
			
			compare++;
			
			if(arr[i]>arr[i+1])
			{int temp=arr[i];  arr[i]=arr[i+1];arr[i+1]=temp;}}
		//u<7当u是7时候就已经不执行了
		}

		for(int p=0;p<arr.length;p++){
		System.out.println(arr[p]);
		}
		System.out.println("你比较的总次数为："+compare);
	}
}
