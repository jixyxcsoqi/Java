public class A{
	public static void main(){
	int[] i={4,45,6,2,3,8,7};
	for(int j=i.length-1;j>0;j--){
		for(int u=0;u<j;u++){
		if(i[u]>i[u+1]){int temp;temp=i[u+1];i[u+1]=i[u];i[u]=temp;}
		
		}
	}
	for(int a=0;a<i.length-1;a++){System.out.println(i[a]);}
	
}
}