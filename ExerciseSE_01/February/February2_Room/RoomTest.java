public class RoomTest{
	public static void main(String[] args){
	Room room=new Room("贵族房间",101,true);
	System.out.println(room);

	 Room room1 = new Room("贵族房间",101,true);
        System.out.println(room.equals(room1));
	}
}


class Room{
	private int no;
	private String type;
	private boolean status;
public Room(){};
public Room(String type,int no,boolean status){
this.type=type; this.no=no;   this.status=status;
}

	public void setNo(int no){
	this.no=no;}

	public int getNo(){
	return no;
	}

	public void setType(String type){
	this.type=type;}

	public String getType(){
	return type;
	}


	public void setStatus(boolean status){
	this.status=status;}

	public boolean getStatus(){
	return status;
	}

	public String toString(){
	return  "房间类型是："+type+"  "+"房间号是："+no+"   "+(status ?"空闲" : "占用");}
	
	
	  

	public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Room)) return false;
        if(this == obj) return true;
		//能走到这里就可以转换了
        Room room = (Room)obj;
        // 当前房间编号 等于 传过来的房间对象的房间编号。认为是同一个房间。
        return this.getNo() == room.getNo();
    }

		
	}



