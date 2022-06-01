public class Equals01{
	public static void main(String[] args){
		int a = 100;
		int b = 100;
		System.out.println(a == b); 
			MyTime t1 = new MyTime(2008, 8, 8); //MyTime t1 = 0x1234;
		// 创建了一个新的日期对象，但表示的日期也是：2008年8月8日。
		MyTime t2 = new MyTime(2008, 8, 8); //MyTime t2 = 0x3698;
		System.out.println(t1 == t2); 
		boolean flag = t1.equals(t2);
		System.out.println(flag);

		
		}
}





class MyTime { //extends Object{
	int year;
	int month;
	int day;

	public MyTime(){
	
	}
	public MyTime(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public boolean equals(Object obj) {
		// 当年相同，月相同，并且日也相同的时候，表示两个日期相同。两个对象相等。
		// 获取第一个日期的年月日
		int year1 = this.year;
		int month1 = this.month;
		int day1 = this.day;

		// 获取第二个日期的年月日
		//int year2 = obj.year;
		//int month2 = obj.month;
		//int day2 = obj.day;
		
		if(obj instanceof MyTime){
			MyTime t = (MyTime)obj;
			int year2 = t.year;
			int month2 = t.month;
			int day2 = t.day;
			if(year1 == year2 && month1 == month2 && day1 == day2){
				return true;}
				
			}	
			return false;
		}
}

