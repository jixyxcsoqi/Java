public class Overwrite{
	public static void main(String[] args){
	Mytime w=new Mytime(2022,1,29);
		String str=w.toString();
	System.out.println(w);

	}



}
class Mytime{
	int year;
	int month;
	int day;
	public Mytime(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
		System.out.println("hello");
	}
	public String toString(){//��дtoString(){}
	
	return	year+"��"+month+"��"+day+"��";
		}
}