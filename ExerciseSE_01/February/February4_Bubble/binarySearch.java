public class binarySearch{
	public static void main(String[]args){
	int[] arr={66,88,99,100,666,888,999};
	
	int index=binary(arr,999);
	System.out.println(index==-1?"该元素不存在":"该元素下表是"+index);
	
	
}
public static int binary(int[] arr,int dest){
	
	int end=arr.length-1;
	int begin=0;
	
	while(end>=begin){int mid=(end+begin)/2;
		if(arr[mid]==dest){return mid;}
		if(arr[mid]<dest){begin=mid+1;}
		if(arr[mid]>dest){end=mid-1;}
	
		}return -1;
	}
	
}